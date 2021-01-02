package eltrut.flamboyant.common.blocks;

import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class TerracottaBlock extends Block {
	private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> Items.BLACK_TERRACOTTA);

	@Deprecated
	public TerracottaBlock() {
		super(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.25F, 4.2F));
	}
	
	public TerracottaBlock(MaterialColor color) {
		super(AbstractBlock.Properties.create(Material.ROCK, color).setRequiresTool().hardnessAndResistance(1.25F, 4.2F));
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		FILLER.fillItem(this.asItem(), group, items);
	}

}
