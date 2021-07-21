package co.eltrut.flamboyant.core.registry;

import java.util.List;

import co.eltrut.flamboyant.common.items.FDyeItem;
import co.eltrut.flamboyant.core.Flamboyant;
import co.eltrut.flamboyant.core.registrator.FItemHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Flamboyant.MOD_ID, bus = Bus.MOD)
public class FlamboyantItems {
	
	public static final FItemHelper HELPER = Flamboyant.REGISTRATOR.getHelper(ForgeRegistries.ITEMS);
	
	public static final List<RegistryObject<Item>> DYES = HELPER.createSimpleDyeItems("_dye", () -> new FDyeItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
}
