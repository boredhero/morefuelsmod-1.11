package com.bored.morefuelsmod;

import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {
	public static void init(){
		//Smelting Recipe to Turn Bituminous Coal into Coke
		GameRegistry.addSmelting(ModItems.bituminousCoal, new ItemStack(ModItems.coke), 0.5F);
		//Smelting Recipe To Turn Glass Orb into Tempered Glass Orb
		GameRegistry.addSmelting(ModItems.glassOrb, new ItemStack(ModItems.temperedGlassOrb), 0.5F);
	}
}
