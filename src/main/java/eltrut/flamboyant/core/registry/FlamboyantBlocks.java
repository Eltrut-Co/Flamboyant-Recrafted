package eltrut.flamboyant.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.InjectedBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import eltrut.flamboyant.common.blocks.FCarpetBlock;
import eltrut.flamboyant.common.blocks.FConcretePowderBlock;
import eltrut.flamboyant.common.blocks.FGlazedTerracottaBlock;
import eltrut.flamboyant.core.Flamboyant;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
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
	
	// Glass is building block
	// Pane is decoration
	
	public static class Properties {
		
		public static final Block.Properties WOOL = AbstractBlock.Properties.create(Material.WOOL).hardnessAndResistance(0.8F).sound(SoundType.CLOTH);
		public static final Block.Properties CARPET = AbstractBlock.Properties.create(Material.CARPET).hardnessAndResistance(0.1F).sound(SoundType.CLOTH);
		public static final Block.Properties TERRACOTTA = AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.25F, 4.2F);
		public static final Block.Properties GLAZED_TERRACOTTA = AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.4F);
		public static final Block.Properties CONCRETE = AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(1.8F);
		public static final Block.Properties CONCRETE_POWDER = AbstractBlock.Properties.create(Material.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND);
		public static final Block.Properties STAINED_GLASS = AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid();
		
	}
	
}
