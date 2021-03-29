package co.eltrut.flamboyant.core.other;

import java.util.HashMap;
import java.util.Map;

import co.eltrut.flamboyant.core.Flamboyant;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantAtlas {
	
	private static final Map<String, BedInfo> BED_INFO_MAP = new HashMap<>();
	
	public static synchronized void addBedInfo(String color) {
		BED_INFO_MAP.put(color + "_bed", new BedInfo(color));
	}
	
	public static BedInfo get(String key) {
		return BED_INFO_MAP.get(key);
	}
	
	@SubscribeEvent
	public static void onStitch(TextureStitchEvent.Pre event) {
		if (event.getMap().location().equals(Atlases.BED_SHEET)) {
			for (BedInfo info : BED_INFO_MAP.values()) {
				info.setup(event);
			}
		}
	}
	
	public static class BedInfo {
		
		private final ResourceLocation loc;
		private RenderMaterial material;
		
		public BedInfo(String color) {
			this.loc = new ResourceLocation(Flamboyant.MOD_ID, "entity/bed/" + color);
		}
		
		public void setup(TextureStitchEvent.Pre event) {
			event.addSprite(loc);
			this.material = new RenderMaterial(Atlases.BED_SHEET, this.loc);
		}
		
		public RenderMaterial getMaterial() {
			return this.material;
		}
		
	}
	
}
