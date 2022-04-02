package co.eltrut.flamboyant.core.other;

import co.eltrut.flamboyant.core.Flamboyant;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantAtlas {
	
	private static final Logger LOGGER = LogManager.getLogger();
	private static final Map<String, BedInfo> BED_INFO_MAP = new HashMap<>();
	
	public static synchronized void addBedInfo(String color) {
		BED_INFO_MAP.put(color, new BedInfo(color));
	}
	
	public static BedInfo get(String key) {
		return BED_INFO_MAP.get(key);
	}
	
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onStitch(TextureStitchEvent.Pre event) {
		if (event.getAtlas().location().equals(Sheets.BED_SHEET)) {
			for (BedInfo info : BED_INFO_MAP.values()) {
				info.setup(event);
			}
		}
	}
	
	public static class BedInfo {
		
		private final ResourceLocation loc;
		@OnlyIn(Dist.CLIENT)
		private Material material;
		
		public BedInfo(String color) {
			this.loc = new ResourceLocation(Flamboyant.MOD_ID, "entity/bed/" + color);
			LOGGER.info("Registered info for " + color + " bed");
		}
		
		@OnlyIn(Dist.CLIENT)
		public void setup(TextureStitchEvent.Pre event) {
			event.addSprite(loc);
			this.material = new Material(Sheets.BED_SHEET, this.loc);
			LOGGER.info("Materialized render for " + this.loc);
		}
		
		@OnlyIn(Dist.CLIENT)
		public Material getMaterial() {
			return this.material;
		}
		
	}
	
}
