package co.eltrut.flamboyant.core;

import org.apache.commons.lang3.tuple.Pair;

import co.eltrut.differentiate.core.condition.BooleanRecipeCondition;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class FlamboyantConfig {

	public static class Common {

		public final ConfigValue<Boolean> smeltableConcretePowder;

		Common(ForgeConfigSpec.Builder builder) {
			builder.push("common");

			smeltableConcretePowder = builder.define("If concrete powder should be able to be smelted into stained glass", true);

			builder.pop();

			BooleanRecipeCondition.TABLE.put("smeltable_concrete_powder", smeltableConcretePowder);
		}

	}

	public static final ForgeConfigSpec COMMON_SPEC;
	public static final Common COMMON;
	static {
		final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		COMMON_SPEC = specPair.getRight();
		COMMON = specPair.getLeft();
	}

}
