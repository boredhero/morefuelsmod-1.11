package com.bored.morefuelsmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase pelletsFuel;
	public static ItemBase concentratedPelletsFuel;
	public static ItemBase coke;
	public static ItemBase bituminousCoal;
	public static ItemBase canSlimoline;
	public static ItemBase dustCoal;
	public static ItemBase bitumen;

	public static void init() {
		pelletsFuel = register(new ItemBase("pelletsFuel"));
		concentratedPelletsFuel = register(new ItemBase("concentratedPelletsFuel"));
		coke = register(new ItemBase("coke"));
		bituminousCoal = register(new ItemBase("bituminousCoal"));
		canSlimoline = register(new ItemBase("canSlimoline"));
		dustCoal = register(new ItemBase("dustCoal"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}

		return item;
	}

}