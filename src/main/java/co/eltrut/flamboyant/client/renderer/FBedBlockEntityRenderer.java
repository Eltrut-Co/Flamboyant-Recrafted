package co.eltrut.flamboyant.client.renderer;

import co.eltrut.flamboyant.common.blocks.FBedBlock;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import co.eltrut.flamboyant.core.other.FlamboyantAtlas;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BrightnessCombiner;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;

public class FBedBlockEntityRenderer implements BlockEntityRenderer<FBedTileEntity> {
	
	private final ModelPart headPiece;
	private final ModelPart footPiece;

	public FBedBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
		this.headPiece = context.bakeLayer(ModelLayers.BED_HEAD);
		this.footPiece = context.bakeLayer(ModelLayers.BED_FOOT);
	}

	public static LayerDefinition createHeadLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(50, 6).addBox(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.rotation(((float)Math.PI / 2F), 0.0F, ((float)Math.PI / 2F)));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(50, 18).addBox(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.rotation(((float)Math.PI / 2F), 0.0F, (float)Math.PI));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public static LayerDefinition createFootLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), PartPose.rotation(((float)Math.PI / 2F), 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(50, 12).addBox(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), PartPose.rotation(((float)Math.PI / 2F), 0.0F, ((float)Math.PI * 1.5F)));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void render(FBedTileEntity tileEntityIn, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
		Material rendermaterial = FlamboyantAtlas.get(tileEntityIn.getColor().getTranslationKey()).getMaterial();
		Level world = tileEntityIn.getLevel();
		if (world != null) {
			BlockState blockstate = tileEntityIn.getBlockState();
			DoubleBlockCombiner.NeighborCombineResult<? extends FBedTileEntity> icallbackwrapper = DoubleBlockCombiner
					.combineWithNeigbour(FlamboyantTileEntities.BED.get(), BedBlock::getBlockType, BedBlock::getConnectedDirection,
							FBedBlock.FACING, blockstate, world, tileEntityIn.getBlockPos(), (p_228846_0_, p_228846_1_) -> {
								return false;
							});
			int i = icallbackwrapper.<Int2IntFunction>apply(new BrightnessCombiner<>()).get(combinedLightIn);
			this.renderPiece(matrixStackIn, bufferIn, blockstate.getValue(FBedBlock.PART) == BedPart.HEAD ? this.headPiece : this.footPiece,
					blockstate.getValue(FBedBlock.FACING), rendermaterial, i, combinedOverlayIn, false);
		} else {
			this.renderPiece(matrixStackIn, bufferIn, this.headPiece, Direction.SOUTH, rendermaterial, combinedLightIn,
					combinedOverlayIn, false);
			this.renderPiece(matrixStackIn, bufferIn, this.footPiece, Direction.SOUTH, rendermaterial, combinedLightIn,
					combinedOverlayIn, true);
		}

	}

	private void renderPiece(PoseStack pPoseStack, MultiBufferSource pBufferSource, ModelPart pModelPart, Direction pDirection, Material pMaterial, int pPackedLight, int pPackedOverlay, boolean pFoot) {
		pPoseStack.pushPose();
		pPoseStack.translate(0.0D, 0.5625D, pFoot ? -1.0D : 0.0D);
		pPoseStack.mulPose(Vector3f.XP.rotationDegrees(90.0F));
		pPoseStack.translate(0.5D, 0.5D, 0.5D);
		pPoseStack.mulPose(Vector3f.ZP.rotationDegrees(180.0F + pDirection.toYRot()));
		pPoseStack.translate(-0.5D, -0.5D, -0.5D);
		VertexConsumer vertexconsumer = pMaterial.buffer(pBufferSource, RenderType::entitySolid);
		pModelPart.render(pPoseStack, vertexconsumer, pPackedLight, pPackedOverlay);
		pPoseStack.popPose();
	}

}
