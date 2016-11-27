package com.bored.morefuelsmod.block;

import java.util.Random;

import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOre extends BlockBase {

	public BlockOre(String name) {
		super(Material.ROCK, name);
		setHardness(5f);
		setResistance(5f);
	}

	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return ModItems.bituminousCoal;
		}


}