package com.bored.morefuelsmod;

import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {
	public static void init(){
		GameRegistry.addSmelting(ModItems.bituminousCoal, new ItemStack(ModItems.coke), 0.5F);
	}
}
