package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class FWoolBlock extends FQuiltedWoolBlock {
	
	public FWoolBlock(Properties properties) {
		super(properties);
	}

	@Override
	public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_WOOL, group, items);
	}

}
