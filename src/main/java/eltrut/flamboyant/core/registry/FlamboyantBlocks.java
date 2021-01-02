package eltrut.flamboyant.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import eltrut.flamboyant.common.blocks.FlamboyantCarpetBlock;
import eltrut.flamboyant.common.blocks.FlamboyantGlazedTerracottaBlock;
import eltrut.flamboyant.common.blocks.TerracottaBlock;
import eltrut.flamboyant.common.blocks.WoolBlock;
import eltrut.flamboyant.core.Flamboyant;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantBlocks {
	
	public static final BlockSubRegistryHelper HELPER = Flamboyant.REGISTRY_HELPER.getBlockSubHelper();
	
	public static final RegistryObject<Block> AMBER_WOOL = HELPER.createBlock("amber_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_WOOL = HELPER.createBlock("beige_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_WOOL = HELPER.createBlock("cream_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_WOOL = HELPER.createBlock("dark_green_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_WOOL = HELPER.createBlock("forest_green_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_WOOL = HELPER.createBlock("hot_pink_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_WOOL = HELPER.createBlock("indigo_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_WOOL = HELPER.createBlock("maroon_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_WOOL = HELPER.createBlock("navy_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_WOOL = HELPER.createBlock("olive_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_WOOL = HELPER.createBlock("pale_green_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_WOOL = HELPER.createBlock("pale_pink_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_WOOL = HELPER.createBlock("pale_yellow_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_WOOL = HELPER.createBlock("sky_blue_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_WOOL = HELPER.createBlock("slate_gray_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_WOOL = HELPER.createBlock("violet_wool", () -> new WoolBlock(), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_CARPET = HELPER.createBlock("amber_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_CARPET = HELPER.createBlock("beige_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_CARPET = HELPER.createBlock("cream_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_CARPET = HELPER.createBlock("dark_green_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_CARPET = HELPER.createBlock("forest_green_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_CARPET = HELPER.createBlock("hot_pink_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_CARPET = HELPER.createBlock("indigo_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_CARPET = HELPER.createBlock("maroon_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_CARPET = HELPER.createBlock("navy_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_CARPET = HELPER.createBlock("olive_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_CARPET = HELPER.createBlock("pale_green_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_CARPET = HELPER.createBlock("pale_pink_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_CARPET = HELPER.createBlock("pale_yellow_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_CARPET = HELPER.createBlock("sky_blue_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_CARPET = HELPER.createBlock("slate_gray_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_CARPET = HELPER.createBlock("violet_carpet", () -> new FlamboyantCarpetBlock(), ItemGroup.DECORATIONS);

	public static final RegistryObject<Block> AMBER_TERRACOTTA = HELPER.createBlock("amber_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_TERRACOTTA = HELPER.createBlock("beige_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_TERRACOTTA = HELPER.createBlock("cream_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_TERRACOTTA = HELPER.createBlock("dark_green_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_TERRACOTTA = HELPER.createBlock("forest_green_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_TERRACOTTA = HELPER.createBlock("hot_pink_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_TERRACOTTA = HELPER.createBlock("indigo_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_TERRACOTTA = HELPER.createBlock("maroon_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_TERRACOTTA = HELPER.createBlock("navy_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_TERRACOTTA = HELPER.createBlock("olive_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_TERRACOTTA = HELPER.createBlock("pale_green_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_TERRACOTTA = HELPER.createBlock("pale_pink_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_TERRACOTTA = HELPER.createBlock("pale_yellow_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_TERRACOTTA = HELPER.createBlock("sky_blue_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_TERRACOTTA = HELPER.createBlock("slate_gray_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_TERRACOTTA = HELPER.createBlock("violet_terracotta", () -> new TerracottaBlock(), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_GLAZED_TERRACOTTA = HELPER.createBlock("amber_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_GLAZED_TERRACOTTA = HELPER.createBlock("beige_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_GLAZED_TERRACOTTA = HELPER.createBlock("cream_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_GLAZED_TERRACOTTA = HELPER.createBlock("dark_green_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_GLAZED_TERRACOTTA = HELPER.createBlock("forest_green_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_GLAZED_TERRACOTTA = HELPER.createBlock("hot_pink_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_GLAZED_TERRACOTTA = HELPER.createBlock("indigo_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_GLAZED_TERRACOTTA = HELPER.createBlock("maroon_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_GLAZED_TERRACOTTA = HELPER.createBlock("navy_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_GLAZED_TERRACOTTA = HELPER.createBlock("olive_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_GLAZED_TERRACOTTA = HELPER.createBlock("pale_green_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_GLAZED_TERRACOTTA = HELPER.createBlock("pale_pink_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_GLAZED_TERRACOTTA = HELPER.createBlock("pale_yellow_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_GLAZED_TERRACOTTA = HELPER.createBlock("sky_blue_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_GLAZED_TERRACOTTA = HELPER.createBlock("slate_gray_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_GLAZED_TERRACOTTA = HELPER.createBlock("violet_glazed_terracotta", () -> new FlamboyantGlazedTerracottaBlock(), ItemGroup.DECORATIONS);

}
