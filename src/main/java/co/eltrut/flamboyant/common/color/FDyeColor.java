package co.eltrut.flamboyant.common.color;

import java.util.ArrayList;

import javax.annotation.Nullable;

import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.level.material.MaterialColor;

public class FDyeColor implements IStringSerializable {

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
	private final int colorValue;
	private final int swappedColorValue;
	private final float[] colorComponentValues;
	private final int fireworkColor;
	private final net.minecraftforge.common.Tags.IOptionalNamedTag<Item> tag;
	private final int textColor;

	public FDyeColor(int idIn, String translationKeyIn, int colorValueIn, MaterialColor mapColorIn, int fireworkColorIn,
			int textColorIn) {
		this.id = idIn;
		this.translationKey = translationKeyIn;
		this.colorValue = colorValueIn;
		this.mapColor = mapColorIn;
		this.textColor = textColorIn;
		int i = (colorValueIn & 16711680) >> 16;
		int j = (colorValueIn & '\uff00') >> 8;
		int k = (colorValueIn & 255) >> 0;
		this.swappedColorValue = k << 16 | j << 8 | i << 0;
		this.tag = net.minecraft.tags.ItemTags
				.createOptional(new net.minecraft.util.ResourceLocation("forge", "dyes/" + translationKeyIn));
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

	public int getColorValue() {
		return colorValue;
	}

	public net.minecraftforge.common.Tags.IOptionalNamedTag<Item> getTag() {
		return tag;
	}

	@Nullable
	public static FDyeColor getColor(ItemStack stack) {
//	      if (stack.getItem() instanceof DyeItem)
//	         return ((DyeItem)stack.getItem()).getDyeColor();

		for (FDyeColor color : VALUES) {
			if (stack.getItem().is(color.getTag()))
				return color;
		}

		return null;
	}
}
