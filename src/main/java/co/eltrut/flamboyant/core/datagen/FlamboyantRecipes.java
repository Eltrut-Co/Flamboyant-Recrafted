package co.eltrut.flamboyant.core.datagen;

import co.eltrut.differentiate.core.util.RecipeUtil;
import co.eltrut.flamboyant.core.registry.FlamboyantBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class FlamboyantRecipes extends RecipeProvider {

	public FlamboyantRecipes(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	public void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		IntStream.range(0, 16).forEach(s -> {
			RecipeUtil.smeltingRecipe(Ingredient.of(FlamboyantBlocks.CONCRETE_POWDERS.get(s).get()), FlamboyantBlocks.STAINED_GLASS.get(s).get(), 0.1F, 200).build(consumer);
		});
	}

}
