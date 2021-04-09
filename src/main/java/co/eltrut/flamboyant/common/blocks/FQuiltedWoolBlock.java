package co.eltrut.flamboyant.common.blocks;

import co.eltrut.differentiate.common.interf.IFlammableBlock;
import net.minecraft.block.Block;

public class FQuiltedWoolBlock extends Block implements IFlammableBlock {

	public FQuiltedWoolBlock(Properties properties) {
		super(properties);
	}

	@Override
	public int getEncouragement() {
		return 30;
	}

	@Override
	public int getFlammability() {
		return 60;
	}
	
}
