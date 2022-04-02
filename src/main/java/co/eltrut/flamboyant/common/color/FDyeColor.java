package co.eltrut.flamboyant.common.color;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.MaterialColor;

import javax.annotation.Nullable;
import java.util.ArrayList;

public class FDyeColor implements StringRepresentable {

	// TODO: figure out what is going on here
	private static final ArrayList<FDyeColor> VALUES = new ArrayList<FDyeColor>();
//	   private static final Int2ObjectOpenHashMap<FDyeColor> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap<>(Arrays.stream(values()).collect(Collectors.toMap((color) -> {
//	      return color.fireworkColor;
//	   }, (color) -> {
//	      return color;
//	   })));
	private final int id;
	private final String translationKey;
	private final MaterialColor mapColor;
	private final float[] colorComponentValues;
	private final int fireworkColor;
	private final TagKey<Item> tag;
	private final int textColor;

	public FDyeColor(int idIn, String translationKeyIn, int colorValueIn, MaterialColor mapColorIn, int fireworkColorIn,
			int textColorIn) {
		this.id = idIn;
		this.translationKey = translationKeyIn;
		this.mapColor = mapColorIn;
		this.textColor = textColorIn;
		int i = (colorValueIn & 16711680) >> 16;
		int j = (colorValueIn & '\uff00') >> 8;
		int k = (colorValueIn & 255) >> 0;
		this.tag = ItemTags.create(new ResourceLocation("forge", "dyes/" + translationKeyIn));
		this.colorComponentValues = new float[] { (float) i / 255.0F, (float) j / 255.0F, (float) k / 255.0F };
		this.fireworkColor = fireworkColorIn;

		VALUES.add(this);
	}

	public int getId() {
		return this.id;
	}

	public String getTranslationKey() {
		return this.translationKey;
	}

	/**
	 * Gets an array containing 3 floats ranging from 0.0 to 1.0: the red, green,
	 * and blue components of the corresponding color.
	 */
	public float[] getColorComponentValues() {
		return this.colorComponentValues;
	}

	public MaterialColor getMapColor() {
		return this.mapColor;
	}

	public int getFireworkColor() {
		return this.fireworkColor;
	}

	public int getTextColor() {
		return this.textColor;
	}

	public static FDyeColor byId(int colorId) {
		if (colorId < 0 || colorId >= VALUES.size()) {
			colorId = 0;
		}

		return VALUES.get(colorId);
	}

	public static FDyeColor byTranslationKey(String translationKeyIn, FDyeColor fallback) {
		for (FDyeColor dyecolor : VALUES) {
			if (dyecolor.translationKey.equals(translationKeyIn)) {
				return dyecolor;
			}
		}

		return fallback;
	}

//	   @Nullable
//	   public static FDyeColor byFireworkColor(int fireworkColorIn) {
//	      return BY_FIREWORK_COLOR.get(fireworkColorIn);
//	   }

	@Override
	public String toString() {
		return this.translationKey;
	}

	@Override
	public String getSerializedName() {
		return this.translationKey;
	}

	public TagKey<Item> getTag() {
		return tag;
	}

	@Nullable
	public static FDyeColor getColor(ItemStack stack) {
//	      if (stack.getItem() instanceof DyeItem)
//	         return ((DyeItem)stack.getItem()).getDyeColor();

		for (FDyeColor color : VALUES) {
			if (stack.is(color.getTag()))
				return color;
		}

		return null;
	}
}
