package eltrut.flamboyant.common.items;

import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class FDyeItem extends Item {
	private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> Items.BLACK_DYE);

	public FDyeItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		FILLER.fillItem(this, group, items);
	}

}
