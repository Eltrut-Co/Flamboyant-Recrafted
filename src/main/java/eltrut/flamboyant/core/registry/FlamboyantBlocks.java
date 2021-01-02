package eltrut.flamboyant.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import eltrut.flamboyant.core.Flamboyant;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantBlocks {
	
	public static final BlockSubRegistryHelper HELPER = Flamboyant.REGISTRY_HELPER.getBlockSubHelper();
	
}
