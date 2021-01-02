package eltrut.flamboyant.common.blocks;

import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class WoolBlock extends Block {
	private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> Items.BLACK_WOOL);

	@Deprecated
	public WoolBlock() {
		super(AbstractBlock.Properties.create(Material.WOOL).hardnessAndResistance(0.8F).sound(SoundType.CLOTH));
		
	}
	
	public WoolBlock(MaterialColor color) {
		super(AbstractBlock.Properties.create(Material.WOOL, color).hardnessAndResistance(0.8F).sound(SoundType.CLOTH));
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		FILLER.fillItem(this.asItem(), group, items);
	}

}
