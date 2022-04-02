package co.eltrut.flamboyant.common.items;

import co.eltrut.flamboyant.client.renderer.BEWLRInstance;
import co.eltrut.flamboyant.client.renderer.FBedItemRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BedItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.IItemRenderProperties;

import java.util.function.Consumer;

public class FBedItem extends BedItem {

    public FBedItem(Block p_40558_, Properties p_40559_) {
        super(p_40558_, p_40559_);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        consumer.accept(new IItemRenderProperties() {
            @Override
            public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                return new BEWLRInstance();
            }
        });
    }
}
