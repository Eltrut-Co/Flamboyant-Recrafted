package eltrut.flamboyant.common.blocks;

import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.block.PaneBlock;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class FStainedGlassPaneBlock extends PaneBlock implements IBeaconBeamColorProvider {
	private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(() -> Items.BLACK_STAINED_GLASS_PANE);

	public FStainedGlassPaneBlock(AbstractBlock.Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(false))
				.with(EAST, Boolean.valueOf(false)).with(SOUTH, Boolean.valueOf(false))
				.with(WEST, Boolean.valueOf(false)).with(WATERLOGGED, Boolean.valueOf(false)));
	}

	@Override
	public DyeColor getColor() {
		return DyeColor.WHITE;
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		FILLER.fillItem(this.asItem(), group, items);
	}
	
}
