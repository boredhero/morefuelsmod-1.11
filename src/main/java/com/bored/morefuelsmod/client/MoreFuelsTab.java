package com.bored.morefuelsmod.client;

import com.bored.morefuelsmod.Main;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MoreFuelsTab extends CreativeTabs {

	public MoreFuelsTab() {
		super(Main.modid);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.coke;
	}

}