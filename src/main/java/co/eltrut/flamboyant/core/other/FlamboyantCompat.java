package co.eltrut.flamboyant.core.other;

import co.eltrut.flamboyant.client.renderer.FBedTileEntityRenderer;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class FlamboyantCompat {
	
	public static void registerEntityRenderers() {
		BlockEntityRenderers.register(FlamboyantTileEntities.BED.get(), FBedTileEntityRenderer::new);
	}
	
}
