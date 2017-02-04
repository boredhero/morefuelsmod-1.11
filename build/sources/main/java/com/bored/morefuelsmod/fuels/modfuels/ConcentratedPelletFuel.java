package com.bored.morefuelsmod.fuels.modfuels;

import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ConcentratedPelletFuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == ModItems.concentratedPelletsFuel){
			return 32400;
		}
		return 0;
	}
}