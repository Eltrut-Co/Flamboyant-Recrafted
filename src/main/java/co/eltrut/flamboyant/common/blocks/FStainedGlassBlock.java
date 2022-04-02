package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.BeaconBeamBlock;

public class FStainedGlassBlock extends AbstractGlassBlock implements BeaconBeamBlock, IRenderTypeBlock {
	
	public FStainedGlassBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_STAINED_GLASS, group, items);
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
