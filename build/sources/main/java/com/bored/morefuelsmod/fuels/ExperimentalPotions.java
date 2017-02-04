//There is no way to set specific potions as far as I can tell, so it would enable anything minecraft considers a "POTIONITEM". 
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ExperimentalPotions implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.POTIONITEM){
			return 600;
		}
		return 0;
	}
}