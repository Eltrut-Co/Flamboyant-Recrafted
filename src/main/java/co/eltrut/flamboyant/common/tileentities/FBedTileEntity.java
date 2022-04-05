package co.eltrut.flamboyant.common.tileentities;

import co.eltrut.flamboyant.common.blocks.FBedBlock;
import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class FBedTileEntity extends BlockEntity {

	private FDyeColor color;

	public FBedTileEntity(BlockPos worldPosition, BlockState blockState) {
		super(FlamboyantTileEntities.BED.get(), worldPosition, blockState);
	}

	public FBedTileEntity(BlockPos worldPosition, BlockState blockState, FDyeColor colorIn) {
		this(worldPosition, blockState);
		this.setColor(colorIn);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
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

}
