package co.eltrut.flamboyant.core.datagen;

import java.util.function.Consumer;
import java.util.stream.IntStream;

import co.eltrut.differentiate.core.util.RecipeUtil;
import co.eltrut.flamboyant.core.registry.FlamboyantBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;

public class FlamboyantRecipes extends RecipeProvider {

	public FlamboyantRecipes(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	public void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
		IntStream.range(0, 16).forEach(s -> {
			RecipeUtil.smeltingRecipe(Ingredient.of(FlamboyantBlocks.CONCRETE_POWDERS.get(s).get()), FlamboyantBlocks.STAINED_GLASS.get(s).get(), 0.1F, 200).build(consumer);
		});
	}

}
