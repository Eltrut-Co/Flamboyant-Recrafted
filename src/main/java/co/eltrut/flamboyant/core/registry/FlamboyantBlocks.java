package co.eltrut.flamboyant.core.registry;

import co.eltrut.differentiate.common.block.FollowBlock;
import co.eltrut.flamboyant.common.blocks.FCarpetBlock;
import co.eltrut.flamboyant.common.blocks.FConcretePowderBlock;
import co.eltrut.flamboyant.common.blocks.FGlazedTerracottaBlock;
import co.eltrut.flamboyant.common.blocks.FStainedGlassBlock;
import co.eltrut.flamboyant.common.blocks.FStainedGlassPaneBlock;
import co.eltrut.flamboyant.common.color.FDyeColors;
import co.eltrut.flamboyant.core.Flamboyant;
import co.eltrut.flamboyant.core.registrator.FBlockHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantBlocks {
	
	public static final FBlockHelper HELPER = Flamboyant.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);
	
	public static final RegistryObject<Block> AMBER_WOOL = HELPER.createSimpleBlock("amber_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_WOOL = HELPER.createSimpleBlock("beige_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_WOOL = HELPER.createSimpleBlock("cream_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_WOOL = HELPER.createSimpleBlock("dark_green_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_WOOL = HELPER.createSimpleBlock("forest_green_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_WOOL = HELPER.createSimpleBlock("hot_pink_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_WOOL = HELPER.createSimpleBlock("indigo_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_WOOL = HELPER.createSimpleBlock("maroon_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_WOOL = HELPER.createSimpleBlock("navy_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_WOOL = HELPER.createSimpleBlock("olive_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_WOOL = HELPER.createSimpleBlock("pale_green_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_WOOL = HELPER.createSimpleBlock("pale_pink_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_WOOL = HELPER.createSimpleBlock("pale_yellow_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_WOOL = HELPER.createSimpleBlock("sky_blue_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_WOOL = HELPER.createSimpleBlock("slate_gray_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_WOOL = HELPER.createSimpleBlock("violet_wool", () -> new FollowBlock(Properties.WOOL, Items.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_CARPET = HELPER.createSimpleBlock("amber_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_CARPET = HELPER.createSimpleBlock("beige_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_CARPET = HELPER.createSimpleBlock("cream_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_CARPET = HELPER.createSimpleBlock("dark_green_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_CARPET = HELPER.createSimpleBlock("forest_green_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_CARPET = HELPER.createSimpleBlock("hot_pink_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_CARPET = HELPER.createSimpleBlock("indigo_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_CARPET = HELPER.createSimpleBlock("maroon_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_CARPET = HELPER.createSimpleBlock("navy_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_CARPET = HELPER.createSimpleBlock("olive_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_CARPET = HELPER.createSimpleBlock("pale_green_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_CARPET = HELPER.createSimpleBlock("pale_pink_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_CARPET = HELPER.createSimpleBlock("pale_yellow_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_CARPET = HELPER.createSimpleBlock("sky_blue_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_CARPET = HELPER.createSimpleBlock("slate_gray_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_CARPET = HELPER.createSimpleBlock("violet_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.DECORATIONS);

	public static final RegistryObject<Block> AMBER_TERRACOTTA = HELPER.createSimpleBlock("amber_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_TERRACOTTA = HELPER.createSimpleBlock("beige_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_TERRACOTTA = HELPER.createSimpleBlock("cream_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_TERRACOTTA = HELPER.createSimpleBlock("dark_green_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_TERRACOTTA = HELPER.createSimpleBlock("forest_green_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_TERRACOTTA = HELPER.createSimpleBlock("hot_pink_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_TERRACOTTA = HELPER.createSimpleBlock("indigo_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_TERRACOTTA = HELPER.createSimpleBlock("maroon_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_TERRACOTTA = HELPER.createSimpleBlock("navy_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_TERRACOTTA = HELPER.createSimpleBlock("olive_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_TERRACOTTA = HELPER.createSimpleBlock("pale_green_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_TERRACOTTA = HELPER.createSimpleBlock("pale_pink_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_TERRACOTTA = HELPER.createSimpleBlock("pale_yellow_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_TERRACOTTA = HELPER.createSimpleBlock("sky_blue_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_TERRACOTTA = HELPER.createSimpleBlock("slate_gray_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_TERRACOTTA = HELPER.createSimpleBlock("violet_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("amber_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("beige_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("cream_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("dark_green_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("forest_green_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("hot_pink_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("indigo_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("maroon_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("navy_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("olive_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("pale_green_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("pale_pink_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("pale_yellow_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("sky_blue_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("slate_gray_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_GLAZED_TERRACOTTA = HELPER.createSimpleBlock("violet_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.DECORATIONS);

	public static final RegistryObject<Block> AMBER_CONCRETE = HELPER.createSimpleBlock("amber_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_CONCRETE = HELPER.createSimpleBlock("beige_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_CONCRETE = HELPER.createSimpleBlock("cream_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_CONCRETE = HELPER.createSimpleBlock("dark_green_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_CONCRETE = HELPER.createSimpleBlock("forest_green_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_CONCRETE = HELPER.createSimpleBlock("hot_pink_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_CONCRETE = HELPER.createSimpleBlock("indigo_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_CONCRETE = HELPER.createSimpleBlock("maroon_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_CONCRETE = HELPER.createSimpleBlock("navy_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_CONCRETE = HELPER.createSimpleBlock("olive_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_CONCRETE = HELPER.createSimpleBlock("pale_green_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_CONCRETE = HELPER.createSimpleBlock("pale_pink_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_CONCRETE = HELPER.createSimpleBlock("pale_yellow_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_CONCRETE = HELPER.createSimpleBlock("sky_blue_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_CONCRETE = HELPER.createSimpleBlock("slate_gray_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_CONCRETE = HELPER.createSimpleBlock("violet_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_CONCRETE_POWDER = HELPER.createSimpleBlock("amber_concrete_powder", () -> new FConcretePowderBlock(AMBER_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_CONCRETE_POWDER = HELPER.createSimpleBlock("beige_concrete_powder", () -> new FConcretePowderBlock(BEIGE_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_CONCRETE_POWDER = HELPER.createSimpleBlock("cream_concrete_powder", () -> new FConcretePowderBlock(CREAM_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_CONCRETE_POWDER = HELPER.createSimpleBlock("dark_green_concrete_powder", () -> new FConcretePowderBlock(DARK_GREEN_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_CONCRETE_POWDER = HELPER.createSimpleBlock("forest_green_concrete_powder", () -> new FConcretePowderBlock(FOREST_GREEN_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_CONCRETE_POWDER = HELPER.createSimpleBlock("hot_pink_concrete_powder", () -> new FConcretePowderBlock(HOT_PINK_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_CONCRETE_POWDER = HELPER.createSimpleBlock("indigo_concrete_powder", () -> new FConcretePowderBlock(INDIGO_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_CONCRETE_POWDER = HELPER.createSimpleBlock("maroon_concrete_powder", () -> new FConcretePowderBlock(MAROON_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_CONCRETE_POWDER = HELPER.createSimpleBlock("navy_concrete_powder", () -> new FConcretePowderBlock(NAVY_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_CONCRETE_POWDER = HELPER.createSimpleBlock("olive_concrete_powder", () -> new FConcretePowderBlock(OLIVE_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_CONCRETE_POWDER = HELPER.createSimpleBlock("pale_green_concrete_powder", () -> new FConcretePowderBlock(PALE_GREEN_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_CONCRETE_POWDER = HELPER.createSimpleBlock("pale_pink_concrete_powder", () -> new FConcretePowderBlock(PALE_PINK_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_CONCRETE_POWDER = HELPER.createSimpleBlock("pale_yellow_concrete_powder", () -> new FConcretePowderBlock(PALE_YELLOW_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_CONCRETE_POWDER = HELPER.createSimpleBlock("sky_blue_concrete_powder", () -> new FConcretePowderBlock(SKY_BLUE_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_CONCRETE_POWDER = HELPER.createSimpleBlock("slate_gray_concrete_powder", () -> new FConcretePowderBlock(SLATE_GRAY_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_CONCRETE_POWDER = HELPER.createSimpleBlock("violet_concrete_powder", () -> new FConcretePowderBlock(VIOLET_CONCRETE.get(), Properties.CONCRETE_POWDER), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_STAINED_GLASS = HELPER.createSimpleBlock("amber_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> BEIGE_STAINED_GLASS = HELPER.createSimpleBlock("beige_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CREAM_STAINED_GLASS = HELPER.createSimpleBlock("cream_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> DARK_GREEN_STAINED_GLASS = HELPER.createSimpleBlock("dark_green_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> FOREST_GREEN_STAINED_GLASS = HELPER.createSimpleBlock("forest_green_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HOT_PINK_STAINED_GLASS = HELPER.createSimpleBlock("hot_pink_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> INDIGO_STAINED_GLASS = HELPER.createSimpleBlock("indigo_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MAROON_STAINED_GLASS = HELPER.createSimpleBlock("maroon_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> NAVY_STAINED_GLASS = HELPER.createSimpleBlock("navy_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> OLIVE_STAINED_GLASS = HELPER.createSimpleBlock("olive_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_GREEN_STAINED_GLASS = HELPER.createSimpleBlock("pale_green_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_PINK_STAINED_GLASS = HELPER.createSimpleBlock("pale_pink_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PALE_YELLOW_STAINED_GLASS = HELPER.createSimpleBlock("pale_yellow_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SKY_BLUE_STAINED_GLASS = HELPER.createSimpleBlock("sky_blue_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> SLATE_GRAY_STAINED_GLASS = HELPER.createSimpleBlock("slate_gray_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> VIOLET_STAINED_GLASS = HELPER.createSimpleBlock("violet_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> AMBER_STAINED_GLASS_PANE = HELPER.createSimpleBlock("amber_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_STAINED_GLASS_PANE = HELPER.createSimpleBlock("beige_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_STAINED_GLASS_PANE = HELPER.createSimpleBlock("cream_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_STAINED_GLASS_PANE = HELPER.createSimpleBlock("dark_green_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_STAINED_GLASS_PANE = HELPER.createSimpleBlock("forest_green_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_STAINED_GLASS_PANE = HELPER.createSimpleBlock("hot_pink_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_STAINED_GLASS_PANE = HELPER.createSimpleBlock("indigo_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_STAINED_GLASS_PANE = HELPER.createSimpleBlock("maroon_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_STAINED_GLASS_PANE = HELPER.createSimpleBlock("navy_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_STAINED_GLASS_PANE = HELPER.createSimpleBlock("olive_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_STAINED_GLASS_PANE = HELPER.createSimpleBlock("pale_green_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_STAINED_GLASS_PANE = HELPER.createSimpleBlock("pale_pink_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_STAINED_GLASS_PANE = HELPER.createSimpleBlock("pale_yellow_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_STAINED_GLASS_PANE = HELPER.createSimpleBlock("sky_blue_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_STAINED_GLASS_PANE = HELPER.createSimpleBlock("slate_gray_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_STAINED_GLASS_PANE = HELPER.createSimpleBlock("violet_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> AMBER_BED = HELPER.createBedBlock(FDyeColors.AMBER);
	public static final RegistryObject<Block> BEIGE_BED = HELPER.createBedBlock(FDyeColors.BEIGE);
	public static final RegistryObject<Block> CREAM_BED = HELPER.createBedBlock(FDyeColors.CREAM);
	public static final RegistryObject<Block> DARK_GREEN_BED = HELPER.createBedBlock(FDyeColors.DARK_GREEN);
	public static final RegistryObject<Block> FOREST_GREEN_BED = HELPER.createBedBlock(FDyeColors.FOREST_GREEN);
	public static final RegistryObject<Block> HOT_PINK_BED = HELPER.createBedBlock(FDyeColors.HOT_PINK);
	public static final RegistryObject<Block> INDIGO_BED = HELPER.createBedBlock(FDyeColors.INDIGO);
	public static final RegistryObject<Block> MAROON_BED = HELPER.createBedBlock(FDyeColors.MAROON);
	public static final RegistryObject<Block> NAVY_BED = HELPER.createBedBlock(FDyeColors.NAVY);
	public static final RegistryObject<Block> OLIVE_BED = HELPER.createBedBlock(FDyeColors.OLIVE);
	public static final RegistryObject<Block> PALE_GREEN_BED = HELPER.createBedBlock(FDyeColors.PALE_GREEN);
	public static final RegistryObject<Block> PALE_PINK_BED = HELPER.createBedBlock(FDyeColors.PALE_PINK);
	public static final RegistryObject<Block> PALE_YELLOW_BED = HELPER.createBedBlock(FDyeColors.PALE_YELLOW);
	public static final RegistryObject<Block> SKY_BLUE_BED = HELPER.createBedBlock(FDyeColors.SKY_BLUE);
	public static final RegistryObject<Block> SLATE_GRAY_BED = HELPER.createBedBlock(FDyeColors.SLATE_GRAY);
	public static final RegistryObject<Block> VIOLET_BED = HELPER.createBedBlock(FDyeColors.VIOLET);
	
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
