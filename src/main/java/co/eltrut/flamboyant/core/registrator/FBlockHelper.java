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
			return new FBedBlock(color, AbstractBlock.Properties.create(Material.WOOL, (state) -> {
		         return state.get(FBedBlock.PART) == BedPart.FOOT ? color.getMapColor() : MaterialColor.WOOL;
		      }).sound(SoundType.WOOD).hardnessAndResistance(0.2F).notSolid());
		});
		this.itemRegister.createItem(name, () -> new BedItem(registeredBlock.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> () -> new FBedItemRenderer(color))));
		return registeredBlock;
	}

}
