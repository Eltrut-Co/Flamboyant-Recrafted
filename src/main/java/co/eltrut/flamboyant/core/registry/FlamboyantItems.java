package co.eltrut.flamboyant.core.registry;

import co.eltrut.flamboyant.common.items.FDyeItem;
import co.eltrut.flamboyant.core.Flamboyant;
import co.eltrut.flamboyant.core.registrator.FItemHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantItems {
	
	public static final FItemHelper HELPER = Flamboyant.REGISTRATOR.getHelper(ForgeRegistries.ITEMS);
	
	public static final List<RegistryObject<Item>> DYES = HELPER.createSimpleDyeItems("_dye", () -> new FDyeItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
}
