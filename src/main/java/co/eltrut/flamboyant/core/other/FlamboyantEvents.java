package co.eltrut.flamboyant.core.other;

import co.eltrut.flamboyant.client.renderer.FBedTileEntityRenderer;
import co.eltrut.flamboyant.core.Flamboyant;
import co.eltrut.flamboyant.core.registry.FlamboyantTileEntities;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Flamboyant.MOD_ID)
public class FlamboyantEvents {

//	@SubscribeEvent
//	public static void onVillagerTradesEvent(VillagerTradesEvent event) {
//		
//		if (event.getType() == VillagerProfession.SHEPHERD) {
//			for (int i = 0; i < 16; i++) {
//				TradeUtil.addVillagerTrades(event, TradeUtil.APPRENTICE,
//						new AbnormalsTrade(1, ColoredBlocks.WOOL[i].asItem(), 1, 16, 5),
//						new AbnormalsTrade(1, ColoredBlocks.CARPETS[i].asItem(), 1, 16, 5));
//				TradeUtil.addVillagerTrades(event, TradeUtil.MASTER,
//						new AbnormalsTrade(ColoredItems.DYES[i], 12, 1, 16, 30));
//			}
//		}
//		
//		if (event.getType() == VillagerProfession.MASON) {
//			for (int i = 0; i < 16; i++) {
//				TradeUtil.addVillagerTrades(event, TradeUtil.EXPERT,
//						new AbnormalsTrade(1, ColoredBlocks.TERRACOTTA[i].asItem(), 1, 12, 15),
//						new AbnormalsTrade(1, ColoredBlocks.GLAZED_TERRACOTTA[i].asItem(), 1, 12, 15));
//			}
//		}
//		
//	}
//	
//	@SubscribeEvent
//	public static void onWandererTradesEvent(WandererTradesEvent event) {
//		for (int i = 0; i < 16; i++) {
//			TradeUtil.addWandererTrades(event,
//					new AbnormalsTrade(1, ColoredItems.DYES[i], 3, 12, 1));
//		}
//	}
	
}
