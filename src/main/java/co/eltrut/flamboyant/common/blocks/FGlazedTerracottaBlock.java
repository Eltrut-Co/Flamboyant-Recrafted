package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.GlazedTerracottaBlock;

public class FGlazedTerracottaBlock extends GlazedTerracottaBlock {
	
	public FGlazedTerracottaBlock(Properties properties) {
		super(properties);
	}

	@Override
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_GLAZED_TERRACOTTA, group, items);
	}

}
