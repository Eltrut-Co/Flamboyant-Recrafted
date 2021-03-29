package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

import net.minecraft.block.AbstractBlock.Properties;

public class FStainedGlassBlock extends AbstractGlassBlock implements IBeaconBeamColorProvider, IRenderTypeBlock {
	
	public FStainedGlassBlock(Properties properties) {
		super(properties);
	}

	@Override
	public DyeColor getColor() {
		return DyeColor.WHITE;
	}
	
	@Override
	public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_STAINED_GLASS, group, items);
	}

	@Override
	public RenderType getRenderType() {
		return RenderType.translucent();
	}

}
