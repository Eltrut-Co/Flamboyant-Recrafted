package co.eltrut.flamboyant.core;

import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.flamboyant.core.other.FlamboyantCompat;
import co.eltrut.flamboyant.core.registrator.FBlockHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("flamboyant")
@Mod.EventBusSubscriber(modid = "flamboyant", bus = Bus.MOD)
public class Flamboyant {
    public static final String MOD_ID = "flamboyant";
    public static final Registrator REGISTRATOR = Registrator.create(MOD_ID, s -> {
    	s.getHelpers().put(ForgeRegistries.BLOCKS, new FBlockHelper(s));
    });
    public static Flamboyant instance;

    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Flamboyant() {
    	
        modEventBus.addListener(this::doCommonStuff);
        modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void doCommonStuff(final FMLCommonSetupEvent event) {
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
    	event.enqueueWork(() -> {
    		FlamboyantCompat.registerEntityRenderers();
    	});
    }
}
