package eltrut.flamboyant.core.other;

import eltrut.flamboyant.client.renderer.FBedTileEntityRenderer;
import eltrut.flamboyant.core.registry.FlamboyantBlocks;
import eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class FlamboyantCompat {
	
	public static void registerBlockRenderers() {
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.AMBER_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.BEIGE_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.CREAM_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.HOT_PINK_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.INDIGO_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.MAROON_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.NAVY_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.OLIVE_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_PINK_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.VIOLET_STAINED_GLASS.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.AMBER_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.BEIGE_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.CREAM_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.DARK_GREEN_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.FOREST_GREEN_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.HOT_PINK_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.INDIGO_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.MAROON_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.NAVY_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.OLIVE_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_GREEN_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_PINK_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.PALE_YELLOW_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.SKY_BLUE_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.SLATE_GRAY_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FlamboyantBlocks.VIOLET_STAINED_GLASS_PANE.get(), RenderType.getTranslucent());
	}
	
	public static void registerEntityRenderers() {
		ClientRegistry.bindTileEntityRenderer(FlamboyantTileEntities.BED.get(), FBedTileEntityRenderer::new);
	}
	
}
