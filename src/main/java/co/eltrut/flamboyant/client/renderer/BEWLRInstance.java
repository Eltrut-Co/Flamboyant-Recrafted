package co.eltrut.flamboyant.client.renderer;

import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;

public class BEWLRInstance extends BlockEntityWithoutLevelRenderer {

    public BEWLRInstance(BlockEntityRenderDispatcher pBlockEntityRenderDispatcher, EntityModelSet pEntityModelSet) {
        super(pBlockEntityRenderDispatcher, pEntityModelSet);
    }

}
