package co.eltrut.flamboyant.client.renderer;

import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FBedItemRenderer extends BlockEntityWithoutLevelRenderer {
	
	private final FDyeColor color;
	
	public FBedItemRenderer(FDyeColor color) {
		super();
		this.color = color;
	}
	
	@Override
	public void renderByItem(ItemStack itemStackIn, ItemTransforms.TransformType transformType, PoseStack matrixStack, MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
		BlockEntityRenderDispatcher.instance.renderItem(new FBedTileEntity(color), matrixStack, buffer, combinedLight, combinedOverlay);
	}

}
