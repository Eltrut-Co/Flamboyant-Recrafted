package eltrut.flamboyant.core.other;

import eltrut.flamboyant.core.registry.FlamboyantBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FlamboyantCompat {
	
	@OnlyIn(Dist.CLIENT)
	public static void registerBlockRenderers() {
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.AMBER_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.BEIGE_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.CREAM_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.HOT_PINK_STAINED_GLASS.get(), RenderType.getTranslucent());
	}
	
}
