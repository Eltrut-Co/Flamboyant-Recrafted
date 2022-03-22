package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class FStainedGlassPaneBlock extends IronBarsBlock implements BeaconBeamBlock, IRenderTypeBlock {
	
	public FStainedGlassPaneBlock(BlockBehaviour.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, Boolean.valueOf(false))
				.setValue(EAST, Boolean.valueOf(false)).setValue(SOUTH, Boolean.valueOf(false))
				.setValue(WEST, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)));
	}
	
	@Override
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_STAINED_GLASS_PANE, group, items);
	}

	@Override
	public RenderType getRenderType() {
		return RenderType.translucent();
	}

	@Override
	public DyeColor getColor() {
		return DyeColor.WHITE;
	}
}
