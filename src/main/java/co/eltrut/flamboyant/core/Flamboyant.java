package co.eltrut.flamboyant.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.eltrut.differentiate.core.registrator.ItemHelper;
import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.differentiate.core.registrator.TileEntityHelper;
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
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "flamboyant";
    public static final Registrator REGISTRATOR = new Registrator(MOD_ID, true);
    public static Flamboyant instance;

    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Flamboyant() {
    	REGISTRATOR.getHelpers().put(ForgeRegistries.ITEMS, new ItemHelper(REGISTRATOR));
    	REGISTRATOR.getHelpers().put(ForgeRegistries.BLOCKS, new FBlockHelper(REGISTRATOR));
    	REGISTRATOR.getHelpers().put(ForgeRegistries.TILE_ENTITIES, new TileEntityHelper(REGISTRATOR));
    	
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
