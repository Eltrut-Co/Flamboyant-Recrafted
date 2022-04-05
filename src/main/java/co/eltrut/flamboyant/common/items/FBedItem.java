package co.eltrut.flamboyant.common.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class FBedItem extends BlockItem {

    public FBedItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    protected boolean placeBlock(BlockPlaceContext pContext, BlockState pState) {
        return pContext.getLevel().setBlock(pContext.getClickedPos(), pState, 26);
    }

}
