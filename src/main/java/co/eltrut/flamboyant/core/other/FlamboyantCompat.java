package co.eltrut.flamboyant.core.other;

import co.eltrut.flamboyant.client.renderer.FBedTileEntityRenderer;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class FlamboyantCompat {
	
	public static void registerEntityRenderers() {
		ClientRegistry.bindTileEntityRenderer(FlamboyantTileEntities.BED.get(), FBedTileEntityRenderer::new);
	}
	
}
