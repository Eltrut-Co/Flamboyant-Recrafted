package eltrut.flamboyant.common.blocks;

import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;

import net.minecraft.block.Block;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class FConcretePowderBlock extends ConcretePowderBlock {
	private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> Items.BLACK_CONCRETE_POWDER);

	public FConcretePowderBlock(Block solidified, Properties properties) {
		super(solidified, properties);
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		FILLER.fillItem(this.asItem(), group, items);
	}
	
}
