package co.eltrut.flamboyant.core.registry;

import java.util.Arrays;
import java.util.HashSet;

import co.eltrut.differentiate.core.registrator.TileEntityHelper;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import co.eltrut.flamboyant.core.Flamboyant;
import co.eltrut.flamboyant.core.registry.FlamboyantBlocks.ColoredBlocks;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantTileEntities {
	
	public static final DeferredRegister<TileEntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Flamboyant.MOD_ID);
	
	public static final RegistryObject<TileEntityType<FBedTileEntity>> BED = REGISTER.register("bed", () -> new TileEntityType<FBedTileEntity>(FBedTileEntity::new, new HashSet<Block>(Arrays.asList(ColoredBlocks.BEDS)), null));
	
//	public static final TileEntityHelper HELPER = Flamboyant.REGISTRATOR.getHelper(ForgeRegistries.TILE_ENTITIES);
//	
//	public static final RegistryObject<TileEntityType<FBedTileEntity>> BED = HELPER.createTileEntity("bed", FBedTileEntity::new, ColoredBlocks.BEDS);
//	
}
