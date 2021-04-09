package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.core.util.GroupUtil;
import net.minecraft.block.Block;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class FConcretePowderBlock extends ConcretePowderBlock {
	
	public FConcretePowderBlock(Block solidified, Properties properties) {
		super(solidified, properties);
	}

	@Override
	public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
		GroupUtil.fillItem(this.asItem(), Items.BLACK_CONCRETE_POWDER, group, items);
	}
	
}
