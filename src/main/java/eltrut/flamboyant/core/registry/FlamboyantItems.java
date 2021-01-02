package eltrut.flamboyant.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import eltrut.flamboyant.common.items.FlamboyantDyeItem;
import eltrut.flamboyant.core.Flamboyant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantItems {
	
	public static final ItemSubRegistryHelper HELPER = Flamboyant.REGISTRY_HELPER.getItemSubHelper();
	
	public static final RegistryObject<Item> AMBER_DYE = HELPER.createItem("amber_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> BEIGE_DYE = HELPER.createItem("beige_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> CREAM_DYE = HELPER.createItem("cream_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> DARK_GREEN_DYE = HELPER.createItem("dark_green_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> FOREST_GREEN_DYE = HELPER.createItem("forest_green_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> HOT_PINK_DYE = HELPER.createItem("hot_pink_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> INDIGO_DYE = HELPER.createItem("indigo_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> MAROON_DYE = HELPER.createItem("maroon_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> NAVY_DYE = HELPER.createItem("navy_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> OLIVE_DYE = HELPER.createItem("olive_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> PALE_GREEN_DYE = HELPER.createItem("pale_green_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> PALE_PINK_DYE = HELPER.createItem("pale_pink_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> PALE_YELLOW_DYE = HELPER.createItem("pale_yellow_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> SKY_BLUE_DYE = HELPER.createItem("sky_blue_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> SLATE_GRAY_DYE = HELPER.createItem("slate_gray_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> VIOLET_DYE = HELPER.createItem("violet_dye", () -> new FlamboyantDyeItem(new Item.Properties().group(ItemGroup.MATERIALS)));

}
