package eltrut.flamboyant.core.registry;

import java.util.concurrent.Callable;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import eltrut.flamboyant.client.renderer.FBedItemRenderer;
import eltrut.flamboyant.common.color.FDyeColor;
import eltrut.flamboyant.common.color.FDyeColors;
import eltrut.flamboyant.common.items.FDyeItem;
import eltrut.flamboyant.core.Flamboyant;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.BedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantItems {
	
	public static final ItemSubRegistryHelper HELPER = Flamboyant.REGISTRY_HELPER.getItemSubHelper();
	
	public static final RegistryObject<Item> AMBER_DYE = HELPER.createItem("amber_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> BEIGE_DYE = HELPER.createItem("beige_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> CREAM_DYE = HELPER.createItem("cream_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> DARK_GREEN_DYE = HELPER.createItem("dark_green_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> FOREST_GREEN_DYE = HELPER.createItem("forest_green_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> HOT_PINK_DYE = HELPER.createItem("hot_pink_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> INDIGO_DYE = HELPER.createItem("indigo_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> MAROON_DYE = HELPER.createItem("maroon_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> NAVY_DYE = HELPER.createItem("navy_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> OLIVE_DYE = HELPER.createItem("olive_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> PALE_GREEN_DYE = HELPER.createItem("pale_green_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> PALE_PINK_DYE = HELPER.createItem("pale_pink_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> PALE_YELLOW_DYE = HELPER.createItem("pale_yellow_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> SKY_BLUE_DYE = HELPER.createItem("sky_blue_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> SLATE_GRAY_DYE = HELPER.createItem("slate_gray_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> VIOLET_DYE = HELPER.createItem("violet_dye", () -> new FDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));

	public static final RegistryObject<Item> AMBER_BED = HELPER.createItem("amber_bed", () -> new BedItem(FlamboyantBlocks.AMBER_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.AMBER))));
	public static final RegistryObject<Item> BEIGE_BED = HELPER.createItem("beige_bed", () -> new BedItem(FlamboyantBlocks.BEIGE_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.BEIGE))));
	public static final RegistryObject<Item> CREAM_BED = HELPER.createItem("cream_bed", () -> new BedItem(FlamboyantBlocks.CREAM_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.CREAM))));
	public static final RegistryObject<Item> DARK_GREEN_BED = HELPER.createItem("dark_green_bed", () -> new BedItem(FlamboyantBlocks.DARK_GREEN_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.DARK_GREEN))));
	public static final RegistryObject<Item> FOREST_GREEN_BED = HELPER.createItem("forest_green_bed", () -> new BedItem(FlamboyantBlocks.FOREST_GREEN_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.FOREST_GREEN))));
	public static final RegistryObject<Item> HOT_PINK_BED = HELPER.createItem("hot_pink_bed", () -> new BedItem(FlamboyantBlocks.HOT_PINK_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.HOT_PINK))));
	public static final RegistryObject<Item> INDIGO_BED = HELPER.createItem("indigo_bed", () -> new BedItem(FlamboyantBlocks.INDIGO_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.INDIGO))));
	public static final RegistryObject<Item> MAROON_BED = HELPER.createItem("maroon_bed", () -> new BedItem(FlamboyantBlocks.MAROON_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.MAROON))));
	public static final RegistryObject<Item> NAVY_BED = HELPER.createItem("navy_bed", () -> new BedItem(FlamboyantBlocks.NAVY_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.NAVY))));
	public static final RegistryObject<Item> OLIVE_BED = HELPER.createItem("olive_bed", () -> new BedItem(FlamboyantBlocks.OLIVE_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.OLIVE))));
	public static final RegistryObject<Item> PALE_GREEN_BED = HELPER.createItem("pale_green_bed", () -> new BedItem(FlamboyantBlocks.PALE_GREEN_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.PALE_GREEN))));
	public static final RegistryObject<Item> PALE_PINK_BED = HELPER.createItem("pale_pink_bed", () -> new BedItem(FlamboyantBlocks.PALE_PINK_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.PALE_PINK))));
	public static final RegistryObject<Item> PALE_YELLOW_BED = HELPER.createItem("pale_yellow_bed", () -> new BedItem(FlamboyantBlocks.PALE_YELLOW_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.PALE_YELLOW))));
	public static final RegistryObject<Item> SKY_BLUE_BED = HELPER.createItem("sky_blue_bed", () -> new BedItem(FlamboyantBlocks.SKY_BLUE_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.SKY_BLUE))));
	public static final RegistryObject<Item> SLATE_GRAY_BED = HELPER.createItem("slate_gray_bed", () -> new BedItem(FlamboyantBlocks.SLATE_GRAY_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.SLATE_GRAY))));
	public static final RegistryObject<Item> VIOLET_BED = HELPER.createItem("violet_bed", () -> new BedItem(FlamboyantBlocks.VIOLET_BED.get(), new Item.Properties().maxStackSize(1).group(ItemGroup.DECORATIONS).setISTER(() -> bedISTER(FDyeColors.VIOLET))));
	
	public static Callable<ItemStackTileEntityRenderer> bedISTER(FDyeColor color) {
		return () -> new FBedItemRenderer(color);
	}
	
	public static class ColoredItems {
		
		public static final Item[] DYES = {AMBER_DYE.get(), BEIGE_DYE.get(), CREAM_DYE.get(), DARK_GREEN_DYE.get(), FOREST_GREEN_DYE.get(), HOT_PINK_DYE.get(), INDIGO_DYE.get(), MAROON_DYE.get(), NAVY_DYE.get(), OLIVE_DYE.get(), PALE_GREEN_DYE.get(), PALE_PINK_DYE.get(), PALE_YELLOW_DYE.get(), SKY_BLUE_DYE.get(), SLATE_GRAY_DYE.get(), VIOLET_DYE.get()};
		
	}
	
}
