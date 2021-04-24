package co.eltrut.flamboyant.core;

import java.util.HashSet;
import java.util.Map;

import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.flamboyant.core.other.FlamboyantCompat;
import co.eltrut.flamboyant.core.registrator.FBlockHelper;
import co.eltrut.flamboyant.core.registry.FlamboyantBlocks;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.properties.BedPart;
import net.minecraft.village.PointOfInterestType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.config.ModConfig;
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
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, FlamboyantConfig.COMMON_SPEC);
    	
        modEventBus.addListener(this::doCommonStuff);
        modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void doCommonStuff(final FMLCommonSetupEvent event) {
    	event.enqueueWork(() -> {
    		this.replaceBedPOI();
    	});
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
    	event.enqueueWork(() -> {
    		FlamboyantCompat.registerEntityRenderers();
    	});
    }
    
    private void replaceBedPOI() {
    	PointOfInterestType.HOME.matchingStates = new HashSet<>(PointOfInterestType.HOME.matchingStates);
    	Map<BlockState, PointOfInterestType> map = ObfuscationReflectionHelper.getPrivateValue(PointOfInterestType.class, null, "field_221073_u");
    	FlamboyantBlocks.BEDS.stream().flatMap(s -> {
    		return s.get().getStateDefinition().getPossibleStates().stream();
    	}).filter(s -> {
    		return s.getValue(BedBlock.PART) == BedPart.HEAD;
    	}).forEach(s -> {
    		map.put(s, PointOfInterestType.HOME);
    		PointOfInterestType.HOME.matchingStates.add(s);
    	});;
    }
}
