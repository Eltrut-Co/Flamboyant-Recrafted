package co.eltrut.flamboyant.core.registrator;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.flamboyant.client.renderer.FBedItemRenderer;
import co.eltrut.flamboyant.common.blocks.FBedBlock;
import co.eltrut.flamboyant.common.blocks.FConcretePowderBlock;
import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.common.color.FDyeColors;
import co.eltrut.flamboyant.core.other.FlamboyantAtlas;
import co.eltrut.flamboyant.core.registry.FlamboyantBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.BedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.properties.BedPart;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
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
		this.itemRegister.createItem(name, () -> new BedItem(registeredBlock.get(), new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_DECORATIONS).setISTER(() -> bedISTER(color))));
		FlamboyantAtlas.addBedInfo(color.getTranslationKey());
		return registeredBlock;
	}
	
	public List<RegistryObject<Block>> createDyeBlocks(Function<? super FDyeColor, ? extends RegistryObject<Block>> mapper) {
		return Arrays.stream(FDyeColors.COLORS).map(mapper).collect(Collectors.toList());
	}
	
	public List<RegistryObject<Block>> createSimpleDyeBlocks(String name, Supplier<Block> block, ItemGroup group, String... mods) {
		return this.createDyeBlocks(s -> {
			return this.createSimpleBlock(s.getSerializedName() + name, block, group, mods);
		});
	}
	
	public List<RegistryObject<Block>> createSimpleFuelDyeBlocks(String name, Supplier<Block> block, ItemGroup group, int burnTime, String... mods) {
		return this.createDyeBlocks(s -> {
			return this.createSimpleFuelBlock(s.getSerializedName() + name, block, group, burnTime, mods);
		});
	}
	
	public List<RegistryObject<Block>> createConcretePowderBlocks(List<RegistryObject<Block>> concreteBlocks) {
		return this.createDyeBlocks(s -> {
			return this.createSimpleBlock(s.getSerializedName() + "_concrete_powder", () -> new FConcretePowderBlock(concreteBlocks.get(s.getId()).get(), FlamboyantBlocks.Properties.CONCRETE_POWDER), ItemGroup.TAB_BUILDING_BLOCKS);
		});
	}
	
	public List<RegistryObject<Block>> createBedBlocks() {
		return this.createDyeBlocks(this::createBedBlock);
	}
	
	@OnlyIn(Dist.CLIENT)
	private static Callable<ItemStackTileEntityRenderer> bedISTER(FDyeColor color) {
		return () -> new FBedItemRenderer(color);
	}

}
