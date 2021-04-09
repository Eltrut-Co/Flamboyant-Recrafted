package co.eltrut.flamboyant.core.datagen;

import java.util.function.Consumer;
import java.util.stream.IntStream;

import co.eltrut.differentiate.core.util.RecipeUtil;
import co.eltrut.flamboyant.core.registry.FlamboyantBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Items;

public class FlamboyantRecipes extends RecipeProvider {

	public FlamboyantRecipes(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	public void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
		IntStream.range(0, 16).forEach(s -> {
			RecipeUtil.shapedRecipe(FlamboyantBlocks.QUILTED_WOOLS.get(s).get(), 3)
					.patternLine(" S ")
					.patternLine("WWW")
					.patternLine(" S ")
					.key('W', FlamboyantBlocks.WOOLS.get(s).get())
					.key('S', Items.STRING)
					.addFlags("quilted_wool")
					.build(consumer);
		});
	}

}
