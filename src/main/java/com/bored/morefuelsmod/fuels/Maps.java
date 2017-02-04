//Covers both filled and unfilled maps. Don't like? Tough!
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Maps implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.MAP){
			return 2500;
		}
		if(fuel.getItem() == Items.FILLED_MAP){
			return 2500;
		}
		return 0;
	}
}