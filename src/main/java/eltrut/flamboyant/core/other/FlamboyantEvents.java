package eltrut.flamboyant.core.other;

import com.minecraftabnormals.abnormals_core.core.util.TradeUtil;
import com.minecraftabnormals.abnormals_core.core.util.TradeUtil.AbnormalsTrade;

import eltrut.flamboyant.core.Flamboyant;
import eltrut.flamboyant.core.registry.FlamboyantBlocks.ColoredBlocks;
import eltrut.flamboyant.core.registry.FlamboyantItems.ColoredItems;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Flamboyant.MOD_ID)
public class FlamboyantEvents {

	@SubscribeEvent
	public static void onVillagerTradesEvent(VillagerTradesEvent event) {
		
		if (event.getType() == VillagerProfession.SHEPHERD) {
			for (int i = 0; i < 16; i++) {
				TradeUtil.addVillagerTrades(event, TradeUtil.APPRENTICE,
						new AbnormalsTrade(1, ColoredBlocks.WOOL[i].asItem(), 1, 16, 5),
						new AbnormalsTrade(1, ColoredBlocks.CARPETS[i].asItem(), 1, 16, 5));
				TradeUtil.addVillagerTrades(event, TradeUtil.MASTER,
						new AbnormalsTrade(ColoredItems.DYES[i], 12, 1, 16, 30));
			}
		}
		
		if (event.getType() == VillagerProfession.MASON) {
			for (int i = 0; i < 16; i++) {
				TradeUtil.addVillagerTrades(event, TradeUtil.EXPERT,
						new AbnormalsTrade(1, ColoredBlocks.TERRACOTTA[i].asItem(), 1, 12, 15),
						new AbnormalsTrade(1, ColoredBlocks.GLAZED_TERRACOTTA[i].asItem(), 1, 12, 15));
			}
		}
		
	}
	
	@SubscribeEvent
	public static void onWandererTradesEvent(WandererTradesEvent event) {
		for (int i = 0; i < 16; i++) {
			TradeUtil.addWandererTrades(event,
					new AbnormalsTrade(1, ColoredItems.DYES[i], 3, 12, 1));
		}
	}
	
}
