package co.eltrut.flamboyant.core.registrator;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.flamboyant.client.renderer.FBedItemRenderer;
import co.eltrut.flamboyant.common.blocks.FBedBlock;
import co.eltrut.flamboyant.common.color.FDyeColor;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.properties.BedPart;
import net.minecraftforge.fml.RegistryObject;

public class FBlockHelper extends BlockHelper {

	public FBlockHelper(Registrator parent) {
		super(parent);
	}
	
	public RegistryObject<Block> createBedBlock(FDyeColor color) {
		String name = color.getTranslationKey() + "_bed";
		RegistryObject<Block> registeredBlock = this.registry.register(name, () -> {
			return new FBedBlock(color, AbstractBlock.Properties.of(Material.WOOL, (state) -> {
		         return state.getValue(FBedBlock.PART) == BedPart.FOOT ? color.getMapColor() : MaterialColor.WOOL;
		      }).sound(SoundType.WOOD).strength(0.2F).noOcclusion());
		});
		this.itemRegister.createItem(name, () -> new BedItem(registeredBlock.get(), new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_DECORATIONS).setISTER(() -> () -> new FBedItemRenderer(color))));
		return registeredBlock;
	}

}
