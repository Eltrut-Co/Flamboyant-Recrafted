package co.eltrut.flamboyant.core.registrator;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.flamboyant.common.blocks.FBedBlock;
import co.eltrut.flamboyant.common.blocks.FConcretePowderBlock;
import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.common.color.FDyeColors;
import co.eltrut.flamboyant.core.other.FlamboyantAtlas;
import co.eltrut.flamboyant.core.registry.FlamboyantBlocks;
import net.minecraft.world.item.BedItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FBlockHelper extends BlockHelper {

	public FBlockHelper(Registrator parent) {
		super(parent);
	}
	
	public RegistryObject<Block> createBedBlock(FDyeColor color) {
		String name = color.getTranslationKey() + "_bed";
		RegistryObject<Block> registeredBlock = this.registry.register(name, () -> {
			return new FBedBlock(color, BlockBehaviour.Properties.of(Material.WOOL, (state) -> {
		         return state.getValue(FBedBlock.PART) == BedPart.FOOT ? color.getMapColor() : MaterialColor.WOOL;
		      }).sound(SoundType.WOOD).strength(0.2F).noOcclusion());
		});
		this.itemRegister.createItem(name, () -> new BedItem(registeredBlock.get(), new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
		FlamboyantAtlas.addBedInfo(color.getTranslationKey());
		return registeredBlock;
	}
	
	public List<RegistryObject<Block>> createDyeBlocks(Function<? super FDyeColor, ? extends RegistryObject<Block>> mapper) {
		return this.createMultipleEntries(FDyeColors.COLORS, mapper);
	}
	
	public List<RegistryObject<Block>> createSimpleDyeBlocks(String name, Supplier<Block> block, CreativeModeTab group, String... mods) {
		return this.createDyeBlocks(s -> {
			return this.createSimpleBlock(s.getSerializedName() + name, block, group, mods);
		});
	}
	
	public List<RegistryObject<Block>> createSimpleFuelDyeBlocks(String name, Supplier<Block> block, CreativeModeTab group, int burnTime, String... mods) {
		return this.createDyeBlocks(s -> {
			return this.createSimpleFuelBlock(s.getSerializedName() + name, block, group, burnTime, mods);
		});
	}
	
	public List<RegistryObject<Block>> createConcretePowderBlocks(List<RegistryObject<Block>> concreteBlocks) {
		return this.createDyeBlocks(s -> {
			return this.createSimpleBlock(s.getSerializedName() + "_concrete_powder", () -> new FConcretePowderBlock(concreteBlocks.get(s.getId()).get(), FlamboyantBlocks.Properties.CONCRETE_POWDER), CreativeModeTab.TAB_BUILDING_BLOCKS);
		});
	}
	
	public List<RegistryObject<Block>> createBedBlocks() {
		return this.createDyeBlocks(this::createBedBlock);
	}

}
