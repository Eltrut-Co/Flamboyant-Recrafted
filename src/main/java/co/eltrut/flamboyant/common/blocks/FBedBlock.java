package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.core.util.GroupUtil;
import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.properties.BedPart;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;

public class FBedBlock extends BedBlock {
	
	private final FDyeColor color;

	public FBedBlock(FDyeColor colorIn, Properties properties) {
		super(null, properties);
		this.color = colorIn;
		this.registerDefaultState(this.stateDefinition.any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, Boolean.valueOf(false)));
	}

	public FDyeColor getFColor() {
		return this.color;
	}
	
	@Override
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_BED, group, items);
	}
	
	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return FlamboyantTileEntities.BED.get().create();
	}
	
	@Override
	public boolean isBed(BlockState state, BlockGetter block, BlockPos pos, Entity entity) {
		return true;
	}
	
}
