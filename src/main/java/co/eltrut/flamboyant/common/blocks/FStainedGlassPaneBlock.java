package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.block.PaneBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class FStainedGlassPaneBlock extends PaneBlock implements IBeaconBeamColorProvider, IRenderTypeBlock {
	
	public FStainedGlassPaneBlock(AbstractBlock.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, Boolean.valueOf(false))
				.setValue(EAST, Boolean.valueOf(false)).setValue(SOUTH, Boolean.valueOf(false))
				.setValue(WEST, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)));
	}

	@Override
	public DyeColor getColor() {
		return DyeColor.WHITE;
	}
	
	@Override
	public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_STAINED_GLASS_PANE, group, items);
	}

	@Override
	public RenderType getRenderType() {
		return RenderType.translucent();
	}
	
}
