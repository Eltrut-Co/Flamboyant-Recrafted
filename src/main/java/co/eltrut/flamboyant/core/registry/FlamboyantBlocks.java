package co.eltrut.flamboyant.core.registry;

import java.util.List;

import co.eltrut.differentiate.common.block.FollowBlock;
import co.eltrut.differentiate.core.util.CompatUtil.Mods;
import co.eltrut.flamboyant.common.blocks.FCarpetBlock;
import co.eltrut.flamboyant.common.blocks.FGlazedTerracottaBlock;
import co.eltrut.flamboyant.common.blocks.FQuiltedWoolBlock;
import co.eltrut.flamboyant.common.blocks.FStainedGlassBlock;
import co.eltrut.flamboyant.common.blocks.FStainedGlassPaneBlock;
import co.eltrut.flamboyant.common.blocks.FWoolBlock;
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
	
	public static final List<RegistryObject<Block>> WOOLS = HELPER.createSimpleFuelDyeBlocks("_wool", () -> new FWoolBlock(Properties.WOOL), ItemGroup.TAB_BUILDING_BLOCKS, 100);
	public static final List<RegistryObject<Block>> CARPETS = HELPER.createSimpleFuelDyeBlocks("_carpet", () -> new FCarpetBlock(Properties.CARPET), ItemGroup.TAB_DECORATIONS, 67);
	public static final List<RegistryObject<Block>> TERRACOTTAS = HELPER.createSimpleDyeBlocks("_terracotta", () -> new FollowBlock(Properties.TERRACOTTA, Items.BLACK_TERRACOTTA), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final List<RegistryObject<Block>> GLAZED_TERRACOTTAS = HELPER.createSimpleDyeBlocks("_glazed_terracotta", () -> new FGlazedTerracottaBlock(Properties.GLAZED_TERRACOTTA), ItemGroup.TAB_DECORATIONS);
	public static final List<RegistryObject<Block>> CONCRETES = HELPER.createSimpleDyeBlocks("_concrete", () -> new FollowBlock(Properties.CONCRETE, Items.BLACK_CONCRETE), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final List<RegistryObject<Block>> CONCRETE_POWDERS = HELPER.createConcretePowderBlocks(CONCRETES);
	public static final List<RegistryObject<Block>> STAINED_GLASS = HELPER.createSimpleDyeBlocks("_stained_glass", () -> new FStainedGlassBlock(Properties.STAINED_GLASS), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final List<RegistryObject<Block>> STAINED_GLASS_PANES = HELPER.createSimpleDyeBlocks("_stained_glass_pane", () -> new FStainedGlassPaneBlock(Properties.STAINED_GLASS), ItemGroup.TAB_DECORATIONS);
	public static final List<RegistryObject<Block>> BEDS = HELPER.createBedBlocks();
	
	public static final List<RegistryObject<Block>> QUILTED_WOOLS = HELPER.createSimpleFuelDyeBlocks("_quilted_wool", () -> new FQuiltedWoolBlock(Properties.WOOL), ItemGroup.TAB_BUILDING_BLOCKS, 100, Mods.QUARK);
	
	public static class Properties {
		
		public static final Block.Properties WOOL = AbstractBlock.Properties.of(Material.WOOL).strength(0.8F).sound(SoundType.WOOL);
		public static final Block.Properties CARPET = AbstractBlock.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL);
		public static final Block.Properties TERRACOTTA = AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.25F, 4.2F);
		public static final Block.Properties GLAZED_TERRACOTTA = AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.4F);
		public static final Block.Properties CONCRETE = AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.8F);
		public static final Block.Properties CONCRETE_POWDER = AbstractBlock.Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND);
		public static final Block.Properties STAINED_GLASS = AbstractBlock.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion();
		
	}
	
	public static Block[] toBlockArray(List<RegistryObject<Block>> list) {
		return list.stream().map(s -> s.get()).toArray(Block[]::new);
	}
	
}
