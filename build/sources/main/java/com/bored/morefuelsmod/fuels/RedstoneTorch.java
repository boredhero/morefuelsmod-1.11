//Covers both lit and unlit torches in one file!
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class RedstoneTorch implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.REDSTONE_TORCH)){
			return 100;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.UNLIT_REDSTONE_TORCH)){
			return 100;
		}
		return 0;
	}
}