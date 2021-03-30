package co.eltrut.flamboyant.common.blocks;

import java.util.List;
import java.util.Optional;

import javax.annotation.Nullable;

import org.apache.commons.lang3.ArrayUtils;

import co.eltrut.differentiate.core.util.GroupUtil;
import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMerger;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.TransportationHelper;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.ExplosionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ICollisionReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class FBedBlock extends HorizontalBlock {
	
	public static final EnumProperty<BedPart> PART = BlockStateProperties.BED_PART;
	public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;
	protected static final VoxelShape BED_BASE_SHAPE = Block.box(0.0D, 3.0D, 0.0D, 16.0D, 9.0D, 16.0D);
	protected static final VoxelShape CORNER_NW = Block.box(0.0D, 0.0D, 0.0D, 3.0D, 3.0D, 3.0D);
	protected static final VoxelShape CORNER_SW = Block.box(0.0D, 0.0D, 13.0D, 3.0D, 3.0D, 16.0D);
	protected static final VoxelShape CORNER_NE = Block.box(13.0D, 0.0D, 0.0D, 16.0D, 3.0D, 3.0D);
	protected static final VoxelShape CORNER_SE = Block.box(13.0D, 0.0D, 13.0D, 16.0D, 3.0D, 16.0D);
	protected static final VoxelShape NORTH_FACING_SHAPE = VoxelShapes.or(BED_BASE_SHAPE, CORNER_NW, CORNER_NE);
	protected static final VoxelShape SOUTH_FACING_SHAPE = VoxelShapes.or(BED_BASE_SHAPE, CORNER_SW, CORNER_SE);
	protected static final VoxelShape WEST_FACING_SHAPE = VoxelShapes.or(BED_BASE_SHAPE, CORNER_NW, CORNER_SW);
	protected static final VoxelShape EAST_FACING_SHAPE = VoxelShapes.or(BED_BASE_SHAPE, CORNER_NE, CORNER_SE);
	private final FDyeColor color;

	public FBedBlock(FDyeColor colorIn, AbstractBlock.Properties properties) {
		super(properties);
		this.color = colorIn;
		this.registerDefaultState(
				this.stateDefinition.any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, Boolean.valueOf(false)));
	}

	@Nullable
	public static Direction getBedDirection(IBlockReader reader, BlockPos pos) {
		BlockState blockstate = reader.getBlockState(pos);
		return blockstate.getBlock() instanceof FBedBlock ? blockstate.getValue(FACING) : null;
	}

	@Override
	public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (worldIn.isClientSide) {
			return ActionResultType.CONSUME;
		} else {
			if (state.getValue(PART) != BedPart.HEAD) {
				pos = pos.relative(state.getValue(FACING));
				state = worldIn.getBlockState(pos);
				if (!state.is(this)) {
					return ActionResultType.CONSUME;
				}
			}

			if (!doesBedWork(worldIn)) {
				worldIn.removeBlock(pos, false);
				BlockPos blockpos = pos.relative(state.getValue(FACING).getOpposite());
				if (worldIn.getBlockState(blockpos).is(this)) {
					worldIn.removeBlock(blockpos, false);
				}

				worldIn.explode((Entity) null, DamageSource.badRespawnPointExplosion(), (ExplosionContext) null,
						(double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, 5.0F, true,
						Explosion.Mode.DESTROY);
				return ActionResultType.SUCCESS;
			} else if (state.getValue(OCCUPIED)) {
				if (!this.tryWakeUpVillager(worldIn, pos)) {
					player.displayClientMessage(new TranslationTextComponent("block.minecraft.bed.occupied"), true);
				}

				return ActionResultType.SUCCESS;
			} else {
				player.startSleepInBed(pos).ifLeft((result) -> {
					if (result != null) {
						player.displayClientMessage(result.getMessage(), true);
					}

				});
				return ActionResultType.SUCCESS;
			}
		}
	}

	public static boolean doesBedWork(World world) {
		return world.dimensionType().bedWorks();
	}

	private boolean tryWakeUpVillager(World world, BlockPos pos) {
		List<VillagerEntity> list = world.getEntitiesOfClass(VillagerEntity.class, new AxisAlignedBB(pos),
				LivingEntity::isSleeping);
		if (list.isEmpty()) {
			return false;
		} else {
			list.get(0).stopSleeping();
			return true;
		}
	}

	@Override
	public void fallOn(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
		super.fallOn(worldIn, pos, entityIn, fallDistance * 0.5F);
	}

	@Override
	public void updateEntityAfterFallOn(IBlockReader worldIn, Entity entityIn) {
		if (entityIn.isSuppressingBounce()) {
			super.updateEntityAfterFallOn(worldIn, entityIn);
		} else {
			this.bounceEntity(entityIn);
		}

	}

	private void bounceEntity(Entity entity) {
		Vector3d vector3d = entity.getDeltaMovement();
		if (vector3d.y < 0.0D) {
			double d0 = entity instanceof LivingEntity ? 1.0D : 0.8D;
			entity.setDeltaMovement(vector3d.x, -vector3d.y * (double) 0.66F * d0, vector3d.z);
		}

	}

	@Override
	public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn,
			BlockPos currentPos, BlockPos facingPos) {
		if (facing == getDirectionToOther(stateIn.getValue(PART), stateIn.getValue(FACING))) {
			return facingState.is(this) && facingState.getValue(PART) != stateIn.getValue(PART)
					? stateIn.setValue(OCCUPIED, facingState.getValue(OCCUPIED))
					: Blocks.AIR.defaultBlockState();
		} else {
			return stateIn;
		}
	}

	private static Direction getDirectionToOther(BedPart part, Direction direction) {
		return part == BedPart.FOOT ? direction : direction.getOpposite();
	}

	@Override
	public void playerWillDestroy(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
		if (!worldIn.isClientSide && player.isCreative()) {
			BedPart bedpart = state.getValue(PART);
			if (bedpart == BedPart.FOOT) {
				BlockPos blockpos = pos.relative(getDirectionToOther(bedpart, state.getValue(FACING)));
				BlockState blockstate = worldIn.getBlockState(blockpos);
				if (blockstate.getBlock() == this && blockstate.getValue(PART) == BedPart.HEAD) {
					worldIn.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 35);
					worldIn.levelEvent(player, 2001, blockpos, Block.getId(blockstate));
				}
			}
		}

		super.playerWillDestroy(worldIn, pos, state, player);
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		Direction direction = context.getHorizontalDirection();
		BlockPos blockpos = context.getClickedPos();
		BlockPos blockpos1 = blockpos.relative(direction);
		return context.getLevel().getBlockState(blockpos1).canBeReplaced(context)
				? this.defaultBlockState().setValue(FACING, direction)
				: null;
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		Direction direction = getFootDirection(state).getOpposite();
		switch (direction) {
		case NORTH:
			return NORTH_FACING_SHAPE;
		case SOUTH:
			return SOUTH_FACING_SHAPE;
		case WEST:
			return WEST_FACING_SHAPE;
		default:
			return EAST_FACING_SHAPE;
		}
	}

	public static Direction getFootDirection(BlockState state) {
		Direction direction = state.getValue(FACING);
		return state.getValue(PART) == BedPart.HEAD ? direction.getOpposite() : direction;
	}

	public static TileEntityMerger.Type getMergeType(BlockState state) {
		BedPart bedpart = state.getValue(PART);
		return bedpart == BedPart.HEAD ? TileEntityMerger.Type.FIRST : TileEntityMerger.Type.SECOND;
	}

	private static boolean isBedBelow(IBlockReader blockReader, BlockPos pos) {
		return blockReader.getBlockState(pos.below()).getBlock() instanceof FBedBlock;
	}

	public static Optional<Vector3d> findStandUpPosition(EntityType<?> type, ICollisionReader collisionReader, BlockPos pos,
			float orientation) {
		Direction direction = collisionReader.getBlockState(pos).getValue(FACING);
		Direction direction1 = direction.getClockWise();
		Direction direction2 = direction1.isFacingAngle(orientation) ? direction1.getOpposite() : direction1;
		if (isBedBelow(collisionReader, pos)) {
			return findBunkBedStandUpPosition(type, collisionReader, pos, direction, direction2);
		} else {
			int[][] aint = bedStandUpOffsets(direction, direction2);
			Optional<Vector3d> optional = findStandUpPositionAtOffset(type, collisionReader, pos, aint, true);
			return optional.isPresent() ? optional : findStandUpPositionAtOffset(type, collisionReader, pos, aint, false);
		}
	}

	private static Optional<Vector3d> findBunkBedStandUpPosition(EntityType<?> type, ICollisionReader collisionReader, BlockPos pos,
			Direction direction1, Direction direction2) {
		int[][] aint = bedSurroundStandUpOffsets(direction1, direction2);
		Optional<Vector3d> optional = findStandUpPositionAtOffset(type, collisionReader, pos, aint, true);
		if (optional.isPresent()) {
			return optional;
		} else {
			BlockPos blockpos = pos.below();
			Optional<Vector3d> optional1 = findStandUpPositionAtOffset(type, collisionReader, blockpos, aint, true);
			if (optional1.isPresent()) {
				return optional1;
			} else {
				int[][] aint1 = bedAboveStandUpOffsets(direction1);
				Optional<Vector3d> optional2 = findStandUpPositionAtOffset(type, collisionReader, pos, aint1, true);
				if (optional2.isPresent()) {
					return optional2;
				} else {
					Optional<Vector3d> optional3 = findStandUpPositionAtOffset(type, collisionReader, pos, aint, false);
					if (optional3.isPresent()) {
						return optional3;
					} else {
						Optional<Vector3d> optional4 = findStandUpPositionAtOffset(type, collisionReader, blockpos, aint, false);
						return optional4.isPresent() ? optional4
								: findStandUpPositionAtOffset(type, collisionReader, pos, aint1, false);
					}
				}
			}
		}
	}

	private static Optional<Vector3d> findStandUpPositionAtOffset(EntityType<?> type, ICollisionReader collisionReader, BlockPos pos,
			int[][] p_242654_3_, boolean p_242654_4_) {
		BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

		for (int[] aint : p_242654_3_) {
			blockpos$mutable.set(pos.getX() + aint[0], pos.getY(), pos.getZ() + aint[1]);
			Vector3d vector3d = TransportationHelper.findSafeDismountLocation(type, collisionReader, blockpos$mutable,
					p_242654_4_);
			if (vector3d != null) {
				return Optional.of(vector3d);
			}
		}

		return Optional.empty();
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.DESTROY;
	}

	@Override
	public BlockRenderType getRenderShape(BlockState state) {
		return BlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	@Override
	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(FACING, PART, OCCUPIED);
	}

	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		return new FBedTileEntity(this.color);
	}

	@Override
	public void setPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer,
			ItemStack stack) {
		super.setPlacedBy(worldIn, pos, state, placer, stack);
		if (!worldIn.isClientSide) {
			BlockPos blockpos = pos.relative(state.getValue(FACING));
			worldIn.setBlock(blockpos, state.setValue(PART, BedPart.HEAD), 3);
			worldIn.blockUpdated(pos, Blocks.AIR);
			state.updateNeighbourShapes(worldIn, pos, 3);
		}

	}

	public FDyeColor getColor() {
		return this.color;
	}
	
	@Override
	public long getSeed(BlockState state, BlockPos pos) {
		BlockPos blockpos = pos.relative(state.getValue(FACING), state.getValue(PART) == BedPart.HEAD ? 0 : 1);
		return MathHelper.getSeed(blockpos.getX(), pos.getY(), blockpos.getZ());
	}

	@Override
	public boolean isPathfindable(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
		return false;
	}

	private static int[][] bedStandUpOffsets(Direction direction1, Direction direction2) {
		return ArrayUtils.addAll((int[][]) bedSurroundStandUpOffsets(direction1, direction2), (int[][]) bedAboveStandUpOffsets(direction1));
	}

	private static int[][] bedSurroundStandUpOffsets(Direction direction1, Direction direction2) {
		return new int[][] { { direction2.getStepX(), direction2.getStepZ() },
				{ direction2.getStepX() - direction1.getStepX(),
						direction2.getStepZ() - direction1.getStepZ() },
				{ direction2.getStepX() - direction1.getStepX() * 2,
						direction2.getStepZ() - direction1.getStepZ() * 2 },
				{ -direction1.getStepX() * 2, -direction1.getStepZ() * 2 },
				{ -direction2.getStepX() - direction1.getStepX() * 2,
						-direction2.getStepZ() - direction1.getStepZ() * 2 },
				{ -direction2.getStepX() - direction1.getStepX(),
						-direction2.getStepZ() - direction1.getStepZ() },
				{ -direction2.getStepX(), -direction2.getStepZ() },
				{ -direction2.getStepX() + direction1.getStepX(),
						-direction2.getStepZ() + direction1.getStepZ() },
				{ direction1.getStepX(), direction1.getStepZ() },
				{ direction2.getStepX() + direction1.getStepX(),
						direction2.getStepZ() + direction1.getStepZ() } };
	}

	private static int[][] bedAboveStandUpOffsets(Direction direction) {
		return new int[][] { { 0, 0 }, { -direction.getStepX(), -direction.getStepZ() } };
	}
	
	@Override
	public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_BED, group, items);
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return FlamboyantTileEntities.BED.get().create();
	}
	
	@Override
	public boolean isBed(BlockState state, IBlockReader block, BlockPos pos, Entity entity) {
		return true;
	}
	
}
