package co.eltrut.flamboyant.core.registry;

import co.eltrut.differentiate.core.registrator.BlockEntityHelper;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import co.eltrut.flamboyant.core.Flamboyant;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantTileEntities {
	
	public static final BlockEntityHelper HELPER = Flamboyant.REGISTRATOR.getHelper(ForgeRegistries.BLOCK_ENTITIES);
	
	public static final RegistryObject<BlockEntityType<FBedTileEntity>> BED = HELPER.createBlockEntity("bed", FBedTileEntity::new, () -> FlamboyantBlocks.toBlockArray(FlamboyantBlocks.BEDS));
	
}
