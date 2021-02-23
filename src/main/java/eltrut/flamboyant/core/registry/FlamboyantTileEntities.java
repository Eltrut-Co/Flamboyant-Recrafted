package eltrut.flamboyant.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.TileEntitySubRegistryHelper;

import eltrut.flamboyant.common.tileentities.FBedTileEntity;
import eltrut.flamboyant.core.Flamboyant;
import eltrut.flamboyant.core.registry.FlamboyantBlocks.ColoredBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantTileEntities {
	
	public static final TileEntitySubRegistryHelper HELPER = Flamboyant.REGISTRY_HELPER.getTileEntitySubHelper();
	
	public static final RegistryObject<TileEntityType<FBedTileEntity>> BED = HELPER.createTileEntity("bed", FBedTileEntity::new, () -> ColoredBlocks.BEDS);
	
}
