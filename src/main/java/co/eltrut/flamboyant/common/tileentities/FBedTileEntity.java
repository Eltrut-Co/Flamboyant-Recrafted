package co.eltrut.flamboyant.common.tileentities;

import co.eltrut.flamboyant.common.blocks.FBedBlock;
import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;

public class FBedTileEntity extends TileEntity /*implements IRendererTileEntity<FBedTileEntity>*/ {

	private FDyeColor color;

	public FBedTileEntity() {
		super(FlamboyantTileEntities.BED.get());
	}

	public FBedTileEntity(FDyeColor colorIn) {
		this();
		this.setColor(colorIn);
	}

	@Override
	public SUpdateTileEntityPacket getUpdatePacket() {
		return new SUpdateTileEntityPacket(this.pos, 11, this.getUpdateTag());
	}

	public FDyeColor getColor() {
		if (this.color == null) {
			this.color = ((FBedBlock)this.getBlockState().getBlock()).getColor();
		}

		return this.color;
	}

	public void setColor(FDyeColor color) {
		this.color = color;
	}

//	@Override
//	public Function<? super TileEntityRendererDispatcher, ? extends TileEntityRenderer<? super FBedTileEntity>> getRendererFactory() {
//		return FBedTileEntityRenderer::new;
//	}

}
