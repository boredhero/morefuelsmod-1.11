//These are the mushroom items.
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class MushroomItems implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.RED_MUSHROOM)){
			return 100;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.BROWN_MUSHROOM)){
			return 100;
		}
		return 0;
	}
}