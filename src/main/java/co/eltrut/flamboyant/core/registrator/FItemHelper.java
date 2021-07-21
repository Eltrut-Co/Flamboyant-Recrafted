package co.eltrut.flamboyant.core.registrator;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import co.eltrut.differentiate.core.registrator.ItemHelper;
import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.common.color.FDyeColors;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class FItemHelper extends ItemHelper {

	public FItemHelper(Registrator parent) {
		super(parent);
	}
	
	public List<RegistryObject<Item>> createDyeItems(Function<? super FDyeColor, ? extends RegistryObject<Item>> mapper) {
		return this.createMultipleEntries(FDyeColors.COLORS, mapper);
	}
	
	public List<RegistryObject<Item>> createSimpleDyeItems(String name, Supplier<Item> item) {
		return this.createDyeItems(s -> {
			return this.createItem(s.getSerializedName() + name, item);
		});
	}

}
