//This class is a fix for double tall grass and other doubly tall plants and flowers.
//Not 100% Sure its necessary, but its a failsafe.
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class DoublePlant implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.DOUBLE_PLANT)){
			return 200;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.TALLGRASS)){
			return 200;
		}
		return 0;
	}
}