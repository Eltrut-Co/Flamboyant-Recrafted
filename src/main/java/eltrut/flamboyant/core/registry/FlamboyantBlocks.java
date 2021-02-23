package eltrut.flamboyant.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.InjectedBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import eltrut.flamboyant.common.blocks.FBedBlock;
import eltrut.flamboyant.common.blocks.FCarpetBlock;
import eltrut.flamboyant.common.blocks.FConcretePowderBlock;
import eltrut.flamboyant.common.blocks.FGlazedTerracottaBlock;
import eltrut.flamboyant.common.blocks.FStainedGlassBlock;
import eltrut.flamboyant.common.blocks.FStainedGlassPaneBlock;
import eltrut.flamboyant.common.color.FDyeColor;
import eltrut.flamboyant.common.color.FDyeColors;
import eltrut.flamboyant.core.Flamboyant;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.state.properties.BedPart;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantBlocks {
	
	public static final BlockSubRegistryHelper HELPER = Flamboyant.REGISTRY_HELPER.getBlockSubHelper();
	
	public static final RegistryObject<Block> AMBER_WOOL = HELPER.createBlock("amber_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_WOOL = HELPER.createBlock("beige_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_WOOL = HELPER.createBlock("cream_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_WOOL = HELPER.createBlock("dark_green_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_WOOL = HELPER.createBlock("forest_green_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_WOOL = HELPER.createBlock("hot_pink_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_WOOL = HELPER.createBlock("indigo_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_WOOL = HELPER.createBlock("maroon_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_WOOL = HELPER.createBlock("navy_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_WOOL = HELPER.createBlock("olive_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_WOOL = HELPER.createBlock("pale_green_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_WOOL = HELPER.createBlock("pale_pink_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_WOOL = HELPER.createBlock("pale_yellow_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_WOOL = HELPER.createBlock("sky_blue_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_WOOL = HELPER.createBlock("slate_gray_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_WOOL = HELPER.createBlock("violet_wool", () -> new InjectedBlock(Items.BLACK_WOOL, Properties.WOOL), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_CARPET = HELPER.createBlock("amber_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_CARPET = HELPER.createBlock("beige_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_CARPET = HELPER.createBlock("cream_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_CARPET = HELPER.createBlock("dark_green_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_CARPET = HELPER.createBlock("forest_green_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_CARPET = HELPER.createBlock("hot_pink_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_CARPET = HELPER.createBlock("indigo_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_CARPET = HELPER.createBlock("maroon_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_CARPET = HELPER.createBlock("navy_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_CARPET = HELPER.createBlock("olive_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_CARPET = HELPER.createBlock("pale_green_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_CARPET = HELPER.createBlock("pale_pink_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_CARPET = HELPER.createBlock("pale_yellow_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_CARPET = HELPER.createBlock("sky_blue_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_CARPET = HELPER.createBlock("slate_gray_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_CARPET = HELPER.createBlock("violet_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);

	public static final RegistryObject<Block> AMBER_TERRACOTTA = HELPER.createBlock("amber_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_TERRACOTTA = HELPER.createBlock("beige_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_TERRACOTTA = HELPER.createBlock("cream_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_TERRACOTTA = HELPER.createBlock("dark_green_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_TERRACOTTA = HELPER.createBlock("forest_green_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_TERRACOTTA = HELPER.createBlock("hot_pink_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_TERRACOTTA = HELPER.createBlock("indigo_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_TERRACOTTA = HELPER.createBlock("maroon_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_TERRACOTTA = HELPER.createBlock("navy_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_TERRACOTTA = HELPER.createBlock("olive_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_TERRACOTTA = HELPER.createBlock("pale_green_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_TERRACOTTA = HELPER.createBlock("pale_pink_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_TERRACOTTA = HELPER.createBlock("pale_yellow_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_TERRACOTTA = HELPER.createBlock("sky_blue_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_TERRACOTTA = HELPER.createBlock("slate_gray_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_TERRACOTTA = HELPER.createBlock("violet_terracotta", () -> new InjectedBlock(Items.BLACK_TERRACOTTA, Properties.TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_GLAZED_TERRACOTTA = HELPER.createBlock("amber_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_GLAZED_TERRACOTTA = HELPER.createBlock("beige_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_GLAZED_TERRACOTTA = HELPER.createBlock("cream_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_GLAZED_TERRACOTTA = HELPER.createBlock("dark_green_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_GLAZED_TERRACOTTA = HELPER.createBlock("forest_green_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_GLAZED_TERRACOTTA = HELPER.createBlock("hot_pink_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_GLAZED_TERRACOTTA = HELPER.createBlock("indigo_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_GLAZED_TERRACOTTA = HELPER.createBlock("maroon_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_GLAZED_TERRACOTTA = HELPER.createBlock("navy_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_GLAZED_TERRACOTTA = HELPER.createBlock("olive_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_GLAZED_TERRACOTTA = HELPER.createBlock("pale_green_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_GLAZED_TERRACOTTA = HELPER.createBlock("pale_pink_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_GLAZED_TERRACOTTA = HELPER.createBlock("pale_yellow_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_GLAZED_TERRACOTTA = HELPER.createBlock("sky_blue_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_GLAZED_TERRACOTTA = HELPER.createBlock("slate_gray_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_GLAZED_TERRACOTTA = HELPER.createBlock("violet_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);

	public static final RegistryObject<Block> AMBER_CONCRETE = HELPER.createBlock("amber_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_CONCRETE = HELPER.createBlock("beige_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_CONCRETE = HELPER.createBlock("cream_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_CONCRETE = HELPER.createBlock("dark_green_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_CONCRETE = HELPER.createBlock("forest_green_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_CONCRETE = HELPER.createBlock("hot_pink_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_CONCRETE = HELPER.createBlock("indigo_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_CONCRETE = HELPER.createBlock("maroon_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_CONCRETE = HELPER.createBlock("navy_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_CONCRETE = HELPER.createBlock("olive_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_CONCRETE = HELPER.createBlock("pale_green_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_CONCRETE = HELPER.createBlock("pale_pink_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_CONCRETE = HELPER.createBlock("pale_yellow_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_CONCRETE = HELPER.createBlock("sky_blue_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_CONCRETE = HELPER.createBlock("slate_gray_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_CONCRETE = HELPER.createBlock("violet_concrete", () -> new InjectedBlock(Items.BLACK_CONCRETE, Properties.CONCRETE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_CONCRETE_POWDER = HELPER.createBlock("amber_concrete_powder", () -> new FConcretePowderBlock(AMBER_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_CONCRETE_POWDER = HELPER.createBlock("beige_concrete_powder", () -> new FConcretePowderBlock(BEIGE_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_CONCRETE_POWDER = HELPER.createBlock("cream_concrete_powder", () -> new FConcretePowderBlock(CREAM_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_CONCRETE_POWDER = HELPER.createBlock("dark_green_concrete_powder", () -> new FConcretePowderBlock(DARK_GREEN_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_CONCRETE_POWDER = HELPER.createBlock("forest_green_concrete_powder", () -> new FConcretePowderBlock(FOREST_GREEN_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_CONCRETE_POWDER = HELPER.createBlock("hot_pink_concrete_powder", () -> new FConcretePowderBlock(HOT_PINK_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_CONCRETE_POWDER = HELPER.createBlock("indigo_concrete_powder", () -> new FConcretePowderBlock(INDIGO_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_CONCRETE_POWDER = HELPER.createBlock("maroon_concrete_powder", () -> new FConcretePowderBlock(MAROON_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_CONCRETE_POWDER = HELPER.createBlock("navy_concrete_powder", () -> new FConcretePowderBlock(NAVY_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_CONCRETE_POWDER = HELPER.createBlock("olive_concrete_powder", () -> new FConcretePowderBlock(OLIVE_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_CONCRETE_POWDER = HELPER.createBlock("pale_green_concrete_powder", () -> new FConcretePowderBlock(PALE_GREEN_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_CONCRETE_POWDER = HELPER.createBlock("pale_pink_concrete_powder", () -> new FConcretePowderBlock(PALE_PINK_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_CONCRETE_POWDER = HELPER.createBlock("pale_yellow_concrete_powder", () -> new FConcretePowderBlock(PALE_YELLOW_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_CONCRETE_POWDER = HELPER.createBlock("sky_blue_concrete_powder", () -> new FConcretePowderBlock(SKY_BLUE_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_CONCRETE_POWDER = HELPER.createBlock("slate_gray_concrete_powder", () -> new FConcretePowderBlock(SLATE_GRAY_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_CONCRETE_POWDER = HELPER.createBlock("violet_concrete_powder", () -> new FConcretePowderBlock(VIOLET_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_STAINED_GLASS = HELPER.createBlock("amber_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_STAINED_GLASS = HELPER.createBlock("beige_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_STAINED_GLASS = HELPER.createBlock("cream_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_STAINED_GLASS = HELPER.createBlock("dark_green_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_STAINED_GLASS = HELPER.createBlock("forest_green_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_STAINED_GLASS = HELPER.createBlock("hot_pink_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_STAINED_GLASS = HELPER.createBlock("indigo_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_STAINED_GLASS = HELPER.createBlock("maroon_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_STAINED_GLASS = HELPER.createBlock("navy_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_STAINED_GLASS = HELPER.createBlock("olive_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_STAINED_GLASS = HELPER.createBlock("pale_green_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_STAINED_GLASS = HELPER.createBlock("pale_pink_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_STAINED_GLASS = HELPER.createBlock("pale_yellow_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_STAINED_GLASS = HELPER.createBlock("sky_blue_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_STAINED_GLASS = HELPER.createBlock("slate_gray_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_STAINED_GLASS = HELPER.createBlock("violet_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_STAINED_GLASS_PANE = HELPER.createBlock("amber_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_STAINED_GLASS_PANE = HELPER.createBlock("beige_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_STAINED_GLASS_PANE = HELPER.createBlock("cream_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_STAINED_GLASS_PANE = HELPER.createBlock("dark_green_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_STAINED_GLASS_PANE = HELPER.createBlock("forest_green_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_STAINED_GLASS_PANE = HELPER.createBlock("hot_pink_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_STAINED_GLASS_PANE = HELPER.createBlock("indigo_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_STAINED_GLASS_PANE = HELPER.createBlock("maroon_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_STAINED_GLASS_PANE = HELPER.createBlock("navy_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_STAINED_GLASS_PANE = HELPER.createBlock("olive_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_STAINED_GLASS_PANE = HELPER.createBlock("pale_green_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_STAINED_GLASS_PANE = HELPER.createBlock("pale_pink_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_STAINED_GLASS_PANE = HELPER.createBlock("pale_yellow_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_STAINED_GLASS_PANE = HELPER.createBlock("sky_blue_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_STAINED_GLASS_PANE = HELPER.createBlock("slate_gray_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_STAINED_GLASS_PANE = HELPER.createBlock("violet_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> AMBER_BED = HELPER.createBlock("amber_bed", () -> createBedFromColor(FDyeColors.AMBER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_BED = HELPER.createBlock("beige_bed", () -> createBedFromColor(FDyeColors.BEIGE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_BED = HELPER.createBlock("cream_bed", () -> createBedFromColor(FDyeColors.CREAM), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_BED = HELPER.createBlock("dark_green_bed", () -> createBedFromColor(FDyeColors.DARK_GREEN), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_BED = HELPER.createBlock("forest_green_bed", () -> createBedFromColor(FDyeColors.FOREST_GREEN), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_BED = HELPER.createBlock("hot_pink_bed", () -> createBedFromColor(FDyeColors.HOT_PINK), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_BED = HELPER.createBlock("indigo_bed", () -> createBedFromColor(FDyeColors.INDIGO), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_BED = HELPER.createBlock("maroon_bed", () -> createBedFromColor(FDyeColors.MAROON), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_BED = HELPER.createBlock("navy_bed", () -> createBedFromColor(FDyeColors.NAVY), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_BED = HELPER.createBlock("olive_bed", () -> createBedFromColor(FDyeColors.OLIVE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_BED = HELPER.createBlock("pale_green_bed", () -> createBedFromColor(FDyeColors.PALE_GREEN), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_BED = HELPER.createBlock("pale_pink_bed", () -> createBedFromColor(FDyeColors.PALE_PINK), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_BED = HELPER.createBlock("pale_yellow_bed", () -> createBedFromColor(FDyeColors.PALE_YELLOW), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_BED = HELPER.createBlock("sky_blue_bed", () -> createBedFromColor(FDyeColors.SKY_BLUE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_BED = HELPER.createBlock("slate_gray_bed", () -> createBedFromColor(FDyeColors.SLATE_GRAY), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_BED = HELPER.createBlock("violet_bed", () -> createBedFromColor(FDyeColors.VIOLET), ItemGroup.DECORATIONS);
	
	private static FBedBlock createBedFromColor(FDyeColor color) {
		return new FBedBlock(color, AbstractBlock.Properties.create(Material.WOOL, (state) -> {
	         return state.get(FBedBlock.PART) == BedPart.FOOT ? color.getMapColor() : MaterialColor.WOOL;
	      }).sound(SoundType.WOOD).hardnessAndResistance(0.2F).notSolid());
	}
	
	public static class Properties {
		
		public static final Block.Properties WOOL = AbstractBlock.Properties.create(Material.WOOL).hardnessAndResistance(0.8F).sound(SoundType.CLOTH);
		public static final Block.Properties CARPET = AbstractBlock.Properties.create(Material.CARPET).hardnessAndResistance(0.1F).sound(SoundType.CLOTH);
		public static final Block.Properties TERRACOTTA = AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.25F, 4.2F);
		public static final Block.Properties GLAZED_TERRACOTTA = AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.4F);
		public static final Block.Properties CONCRETE = AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.8F);
		public static final Block.Properties CONCRETE_POWDER = AbstractBlock.Properties.create(Material.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND);
		public static final Block.Properties STAINED_GLASS = AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid();
		
	}
	
	public static class ColoredBlocks {
		
		public static final Block[] WOOL = {AMBER_WOOL.get(), BEIGE_WOOL.get(), CREAM_WOOL.get(), DARK_GREEN_WOOL.get(), FOREST_GREEN_WOOL.get(), HOT_PINK_WOOL.get(), INDIGO_WOOL.get(), MAROON_WOOL.get(), NAVY_WOOL.get(), OLIVE_WOOL.get(), PALE_GREEN_WOOL.get(), PALE_PINK_WOOL.get(), PALE_YELLOW_WOOL.get(), SKY_BLUE_WOOL.get(), SLATE_GRAY_WOOL.get(), VIOLET_WOOL.get()};
		public static final Block[] CARPETS = {AMBER_CARPET.get(), BEIGE_CARPET.get(), CREAM_CARPET.get(), DARK_GREEN_CARPET.get(), FOREST_GREEN_CARPET.get(), HOT_PINK_CARPET.get(), INDIGO_CARPET.get(), MAROON_CARPET.get(), NAVY_CARPET.get(), OLIVE_CARPET.get(), PALE_GREEN_CARPET.get(), PALE_PINK_CARPET.get(), PALE_YELLOW_CARPET.get(), SKY_BLUE_CARPET.get(), SLATE_GRAY_CARPET.get(), VIOLET_CARPET.get()};
		public static final Block[] TERRACOTTA = {AMBER_TERRACOTTA.get(), BEIGE_TERRACOTTA.get(), CREAM_TERRACOTTA.get(), DARK_GREEN_TERRACOTTA.get(), FOREST_GREEN_TERRACOTTA.get(), HOT_PINK_TERRACOTTA.get(), INDIGO_TERRACOTTA.get(), MAROON_TERRACOTTA.get(), NAVY_TERRACOTTA.get(), OLIVE_TERRACOTTA.get(), PALE_GREEN_TERRACOTTA.get(), PALE_PINK_TERRACOTTA.get(), PALE_YELLOW_TERRACOTTA.get(), SKY_BLUE_TERRACOTTA.get(), SLATE_GRAY_TERRACOTTA.get(), VIOLET_TERRACOTTA.get()};
		public static final Block[] GLAZED_TERRACOTTA = {AMBER_GLAZED_TERRACOTTA.get(), BEIGE_GLAZED_TERRACOTTA.get(), CREAM_GLAZED_TERRACOTTA.get(), DARK_GREEN_GLAZED_TERRACOTTA.get(), FOREST_GREEN_GLAZED_TERRACOTTA.get(), HOT_PINK_GLAZED_TERRACOTTA.get(), INDIGO_GLAZED_TERRACOTTA.get(), MAROON_GLAZED_TERRACOTTA.get(), NAVY_GLAZED_TERRACOTTA.get(), OLIVE_GLAZED_TERRACOTTA.get(), PALE_GREEN_GLAZED_TERRACOTTA.get(), PALE_PINK_GLAZED_TERRACOTTA.get(), PALE_YELLOW_GLAZED_TERRACOTTA.get(), SKY_BLUE_GLAZED_TERRACOTTA.get(), SLATE_GRAY_GLAZED_TERRACOTTA.get(), VIOLET_GLAZED_TERRACOTTA.get()};
		public static final Block[] CONCRETE = {AMBER_CONCRETE.get(), BEIGE_CONCRETE.get(), CREAM_CONCRETE.get(), DARK_GREEN_CONCRETE.get(), FOREST_GREEN_CONCRETE.get(), HOT_PINK_CONCRETE.get(), INDIGO_CONCRETE.get(), MAROON_CONCRETE.get(), NAVY_CONCRETE.get(), OLIVE_CONCRETE.get(), PALE_GREEN_CONCRETE.get(), PALE_PINK_CONCRETE.get(), PALE_YELLOW_CONCRETE.get(), SKY_BLUE_CONCRETE.get(), SLATE_GRAY_CONCRETE.get(), VIOLET_CONCRETE.get()};
		public static final Block[] CONCRETE_POWDER = {AMBER_CONCRETE_POWDER.get(), BEIGE_CONCRETE_POWDER.get(), CREAM_CONCRETE_POWDER.get(), DARK_GREEN_CONCRETE_POWDER.get(), FOREST_GREEN_CONCRETE_POWDER.get(), HOT_PINK_CONCRETE_POWDER.get(), INDIGO_CONCRETE_POWDER.get(), MAROON_CONCRETE_POWDER.get(), NAVY_CONCRETE_POWDER.get(), OLIVE_CONCRETE_POWDER.get(), PALE_GREEN_CONCRETE_POWDER.get(), PALE_PINK_CONCRETE_POWDER.get(), PALE_YELLOW_CONCRETE_POWDER.get(), SKY_BLUE_CONCRETE_POWDER.get(), SLATE_GRAY_CONCRETE_POWDER.get(), VIOLET_CONCRETE_POWDER.get()};
		public static final Block[] STAINED_GLASS = {AMBER_STAINED_GLASS.get(), BEIGE_STAINED_GLASS.get(), CREAM_STAINED_GLASS.get(), DARK_GREEN_STAINED_GLASS.get(), FOREST_GREEN_STAINED_GLASS.get(), HOT_PINK_STAINED_GLASS.get(), INDIGO_STAINED_GLASS.get(), MAROON_STAINED_GLASS.get(), NAVY_STAINED_GLASS.get(), OLIVE_STAINED_GLASS.get(), PALE_GREEN_STAINED_GLASS.get(), PALE_PINK_STAINED_GLASS.get(), PALE_YELLOW_STAINED_GLASS.get(), SKY_BLUE_STAINED_GLASS.get(), SLATE_GRAY_STAINED_GLASS.get(), VIOLET_STAINED_GLASS.get()};
		public static final Block[] STAINED_GLASS_PANES = {AMBER_STAINED_GLASS_PANE.get(), BEIGE_STAINED_GLASS_PANE.get(), CREAM_STAINED_GLASS_PANE.get(), DARK_GREEN_STAINED_GLASS_PANE.get(), FOREST_GREEN_STAINED_GLASS_PANE.get(), HOT_PINK_STAINED_GLASS_PANE.get(), INDIGO_STAINED_GLASS_PANE.get(), MAROON_STAINED_GLASS_PANE.get(), NAVY_STAINED_GLASS_PANE.get(), OLIVE_STAINED_GLASS_PANE.get(), PALE_GREEN_STAINED_GLASS_PANE.get(), PALE_PINK_STAINED_GLASS_PANE.get(), PALE_YELLOW_STAINED_GLASS_PANE.get(), SKY_BLUE_STAINED_GLASS_PANE.get(), SLATE_GRAY_STAINED_GLASS_PANE.get(), VIOLET_STAINED_GLASS_PANE.get()};
		public static final Block[] BEDS = {AMBER_BED.get(), BEIGE_BED.get(), CREAM_BED.get(), DARK_GREEN_BED.get(), FOREST_GREEN_BED.get(), HOT_PINK_BED.get(), INDIGO_BED.get(), MAROON_BED.get(), NAVY_BED.get(), OLIVE_BED.get(), PALE_GREEN_BED.get(), PALE_PINK_BED.get(), PALE_YELLOW_BED.get(), SKY_BLUE_BED.get(), SLATE_GRAY_BED.get(), VIOLET_BED.get()};
		
	}
	
}
