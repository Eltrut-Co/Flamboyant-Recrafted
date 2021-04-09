package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.common.interf.IFlammableBlock;
import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class FWoolBlock extends Block implements IFlammableBlock {

	public FWoolBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_WOOL, group, items);
	}

	@Override
	public int getEncouragement() {
		return 30;
	}

	@Override
	public int getFlammability() {
		return 60;
	}

}
