package co.eltrut.flamboyant.client.renderer;

import co.eltrut.flamboyant.common.blocks.FBedBlock;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import co.eltrut.flamboyant.core.registry.FlamboyantBlocks;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class FBedItemEntityRenderer extends BlockEntityWithoutLevelRenderer {

    private final BlockEntityRenderDispatcher dispatcher;

    public FBedItemEntityRenderer(BlockEntityRenderDispatcher pBlockEntityRenderDispatcher, EntityModelSet pEntityModelSet) {
        super(pBlockEntityRenderDispatcher, pEntityModelSet);
        this.dispatcher = pBlockEntityRenderDispatcher;
    }

    @Override
    public void renderByItem(ItemStack stack, ItemTransforms.TransformType transformType, PoseStack poseStack, MultiBufferSource source, int packedLight, int packedOverlay) {
        Item item = stack.getItem();
        if (item instanceof BlockItem blockItem) {
            Block block = blockItem.getBlock();
            if (block instanceof FBedBlock bedBlock) {
                FBedTileEntity bed = new FBedTileEntity(BlockPos.ZERO, FlamboyantBlocks.BEDS.get(0).get().defaultBlockState());
                bed.setColor(bedBlock.getColor());
                this.dispatcher.renderItem(bed, poseStack, source, packedLight, packedOverlay);
            }

        }
    }
}
