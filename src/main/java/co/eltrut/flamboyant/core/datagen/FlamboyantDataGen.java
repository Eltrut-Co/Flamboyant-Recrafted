package co.eltrut.flamboyant.core.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Bus.MOD)
public class FlamboyantDataGen {

	@SubscribeEvent
	public static void gatherData(final GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		generator.addProvider(new FlamboyantRecipes(generator));
	}
	
}
