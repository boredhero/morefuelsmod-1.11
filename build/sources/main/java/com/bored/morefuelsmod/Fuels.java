package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel){
		//Examples:
				//if(fuel.getItem() == Items.diamond) {
				//	return 5000;
				//}
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.deadbush)){
				//	return 50;
				//}
				//Note on timings, 20 = about 1 second in ticks.
		        //As of v1.4.0, no timings may exist under 100 for compatibility with the fuel pellet systems.
		        //All numbers will be rounded to the nearest 100 as well for compatibility with said system.
		        //Numbers 40 or above will be rounded up to the nearest 100.
				if(fuel.getItem() == Item.getItemFromBlock(Blocks.DEADBUSH)){
					return 200;
				}
				if(fuel.getItem() == Item.getItemFromBlock(Blocks.CACTUS)){
					return 300;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WEB)){
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.LEVER)){
					return 100;
				}
				//Fix for tall grass and all other doubly tall plants
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.DOUBLE_PLANT)){
					return 200;
				}
				//This code SHOULD cover all flowers.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RED_FLOWER)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.YELLOW_FLOWER)){
					return 100;
				}
				if (fuel.getItem() == Items.ITEM_FRAME){
					return 900;
				}
				if (fuel.getItem() == Items.BED){
					return 1500;
				}
				if (fuel.getItem() == Items.PAINTING){
					return 1000;
				}
				if (fuel.getItem() == Items.SIGN){
					return 700;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.LADDER)){
					return 300;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RAIL)) {
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.ACTIVATOR_RAIL)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.DETECTOR_RAIL)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.GOLDEN_RAIL)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.PISTON)){
					return 1000;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.STICKY_PISTON)){
					return 1100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.VINE)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WATERLILY)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TRIPWIRE_HOOK)){
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.HAY_BLOCK)){
					return 900;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CARPET)){
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WOOL)){
					return 200;
				}
				if (fuel.getItem() == Items.ARROW){
					return 100;
				}
				if (fuel.getItem() == Items.FEATHER){
					return 100;
				}
				if (fuel.getItem() == Items.WHEAT){
					return 100;
				}
				if (fuel.getItem() == Items.WHEAT_SEEDS){
					return 100;
				}
				if (fuel.getItem() == Items.MELON_SEEDS){
					return 100;
				}
				if (fuel.getItem() == Items.PUMPKIN_SEEDS){
					return 100;
				}
				if (fuel.getItem() == Items.BEETROOT_SEEDS){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TORCH)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.REDSTONE_TORCH)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.UNLIT_REDSTONE_TORCH)){
					return 100;
				}
				//Doors! Try the back one ;)
				if (fuel.getItem() == Items.OAK_DOOR){
					return 600;
				}
				if (fuel.getItem() == Items.ACACIA_DOOR){
					return 600;
				}
				if (fuel.getItem() == Items.BIRCH_DOOR){
					//you little birch!
					return 600;
				}
				if (fuel.getItem() == Items.DARK_OAK_DOOR){
					return 600;
				}
				if (fuel.getItem() == Items.JUNGLE_DOOR){
					return 600;
				}
				if (fuel.getItem() == Items.SPRUCE_DOOR){
					return 600;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WOODEN_BUTTON)){
					return 300;
				}
				if (fuel.getItem() == Items.BOWL){
					return 300;
				}
				if (fuel.getItem() == Items.BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.ACACIA_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.BIRCH_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.DARK_OAK_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.JUNGLE_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.SPRUCE_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.REEDS){
					return 300;
				}
				if (fuel.getItem() == Items.PAPER){
					return 300;
				}
				if (fuel.getItem() == Items.BOOK) {
					return 1000;
				}
				if (fuel.getItem() == Items.WRITABLE_BOOK){
					//unwritten writable book
					return 1100;
				}
				if (fuel.getItem() == Items.WRITTEN_BOOK){
					//already written writable book
					return 1100;
				}
				if (fuel.getItem() == Items.CHEST_MINECART){
				//Vanilla chest only burns for 300 Ticks.
					return 400;
				}
				if (fuel.getItem() == Items.MAP){
					return 2500;
				}
				if (fuel.getItem() == Items.FILLED_MAP){
					return 2500;
				}
				if (fuel.getItem() == Items.FISHING_ROD){
					return 300;
				}
				if (fuel.getItem() == Items.CARROT_ON_A_STICK){
					return 300;
				}
				//This handles ferns, also redundant for some items like dead bush
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TALLGRASS)){
					return 200;
				}
				//Mushroom time! Don't get high off the fumes from burning them...
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.BROWN_MUSHROOM)){
					//This covers the brown mushroom inventory item
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RED_MUSHROOM)){
					//This covers the red mushroom inventory item
					return 100;
				}
				//EXPERIMENTAL SHROOM COMPATIBILITY
				//Never actually bothered to get these items in inventory to test
				//Therefore I have no idea if this is just eating up space or if it works.
				//But someone might need it...so I'll be nice and accommodate them.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.BROWN_MUSHROOM_BLOCK)){
					//This covers the giant brown mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RED_MUSHROOM_BLOCK)){
					//This covers the giant red mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.getItem() == Items.ARMOR_STAND){
					return 600;
				}
				if (fuel.getItem() == Items.FIRE_CHARGE){
					return 1500;
				}
				if (fuel.getItem() == Items.FIREWORK_CHARGE){
					return 3200;
				}
				if (fuel.getItem() == Items.FIREWORKS){
					return 5100;
				}
				if (fuel.getItem() == Items.GUNPOWDER){
					return 1600;
				}
				if (fuel.getItem() == Items.BLAZE_POWDER){
					return 1200;
				}
				if (fuel.getItem() == Items.MAGMA_CREAM){
					return 2000;
				}
				if (fuel.getItem() == Items.GHAST_TEAR){
					return 2000;
				}
				if (fuel.getItem() == Items.SPAWN_EGG){
					return 5000;
				}
				if (fuel.getItem() == Items.POISONOUS_POTATO){
					return 100;
				}
				if (fuel.getItem() == Items.ROTTEN_FLESH){
					return 100;
				}
				if (fuel.getItem() == Items.SPIDER_EYE){
					return 100;
				}
				if (fuel.getItem() == Items.FERMENTED_SPIDER_EYE){
					return 200;
				}
				if (fuel.getItem() == Items.RABBIT_FOOT){
					return 200;
				}
				if (fuel.getItem() == Items.LEATHER){
					return 100;
				}
				if (fuel.getItem() == Items.LEATHER_BOOTS){
					return 400;
				}
				if (fuel.getItem() == Items.LEATHER_CHESTPLATE){
					return 800;
				}
				if (fuel.getItem() == Items.LEATHER_HELMET){
					return 500;
				}
				if (fuel.getItem() == Items.LEATHER_LEGGINGS){
					return 700;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CHORUS_PLANT)){
					return 600;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CHORUS_FLOWER)){
					return 600;
				}
				if (fuel.getItem() == Items.SHIELD){
					return 1800;
				}
				if (fuel.getItem() == Items.DRAGON_BREATH){
					return 2100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TNT)){
					return 8100;
				}
				if (fuel.getItem() == Items.TNT_MINECART){
					return 8200;
				}
				//MOD ITEMS BELOW THIS POINT
				if (fuel.getItem() == ModItems.pelletsFuel){
					return 900;
				}
				if (fuel.getItem() == Item.getItemFromBlock(ModBlocks.pelletBlock)){
					return 8100; //9 times the value of fuel pellets
				}
				if (fuel.getItem() == ModItems.concentratedPelletsFuel){
					return 32400; //4 times the value of pellet blocks
				}
				if (fuel.getItem() == Item.getItemFromBlock(ModBlocks.concentratedPelletBlock)){
					return 291600; //9 times the value of concentrated pellet fuel
				}
				if (fuel.getItem() == ModItems.coke){
					return 3200; //twice the value of coal.
				}
				if (fuel.getItem() == Item.getItemFromBlock(ModBlocks.cokeBlock)){
					return 28800;
				}
				if (fuel.getItem() == ModItems.bituminousCoal){
					return 1600; //Same as regular coal, it will function as this with the ability to make coke.
				}
				if (fuel.getItem() == ModItems.canSlimoline){
					return 20000;
				}
				
				return 0;
	}
}