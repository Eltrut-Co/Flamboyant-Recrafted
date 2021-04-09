package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.core.util.GroupUtil;
import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.properties.BedPart;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class FBedBlock extends BedBlock {
	
	private final FDyeColor color;

	public FBedBlock(FDyeColor colorIn, AbstractBlock.Properties properties) {
		super(null, properties);
		this.color = colorIn;
		this.registerDefaultState(this.stateDefinition.any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, Boolean.valueOf(false)));
	}

	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		return new FBedTileEntity(this.color);
	}

	public FDyeColor getFColor() {
		return this.color;
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
