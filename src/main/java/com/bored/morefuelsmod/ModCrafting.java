package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void init(){
		
		//Mod Blocks and Items Recipes
		
		//Pellet Fuel to Pellet Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pelletBlock),"###","###","###",'#',ModItems.pelletsFuel);
		//Pellet Block to Pellet Fuel
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pelletsFuel, 9),new Object[]{ModBlocks.pelletBlock});
		//Pellet Block to Concentrated Pellet Fuel
		GameRegistry.addRecipe(new ItemStack(ModItems.concentratedPelletsFuel),"##","##",'#',ModBlocks.pelletBlock);
		//Concentrated Pellet Fuel to Pellet Block
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.pelletBlock, 4),new Object[]{ModItems.concentratedPelletsFuel});
		//Concentrated Pellet Fuel to Concentrated Pellet Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.concentratedPelletBlock),"###","###","###",'#',ModItems.concentratedPelletsFuel);
		//Concentrated Pellet Block to Concentrated Pellet Fuel
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.concentratedPelletsFuel, 9),new Object[]{ModBlocks.concentratedPelletBlock});
		//Gunpowder, Coal Dust, and Slime Ball to Can of Slimoline
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.canSlimoline),new Object[]{Items.GUNPOWDER,ModItems.dustCoal,Items.SLIME_BALL});
		//Coal and Stone Block to Coal Dust
	    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustCoal),new Object[]{Items.COAL,Blocks.STONE});
		
		//Mod Fuels to Fuel Pellets Recipes
		
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.DEADBUSH));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.getItemFromBlock(Blocks.CACTUS));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.WEB));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.LEVER));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.DOUBLE_PLANT));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.RED_FLOWER));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.YELLOW_FLOWER));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Items.ITEM_FRAME);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.BED);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Items.PAINTING);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 7),"###","###","###",'#',Items.SIGN);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.getItemFromBlock(Blocks.LADDER));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.RAIL));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.ACTIVATOR_RAIL));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.DETECTOR_RAIL));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.GOLDEN_RAIL));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Item.getItemFromBlock(Blocks.PISTON));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Item.getItemFromBlock(Blocks.STICKY_PISTON));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.VINE));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.WATERLILY));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.TRIPWIRE_HOOK));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Item.getItemFromBlock(Blocks.HAY_BLOCK));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.CARPET));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.WOOL));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.ARROW);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.FEATHER);
		//GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.WHEAT);
		//Supposed to handle wheat, but this causes an override of 9 wheat = 1 hay block. Just gunna leave hay blocks in
		//And comment this for now. Might work out a solution later, might not. 
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.WHEAT_SEEDS);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.MELON_SEEDS);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.PUMPKIN_SEEDS);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.BEETROOT_SEEDS);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.TORCH));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.REDSTONE_TORCH));
		//GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.UNLIT_REDSTONE_TORCH));
		//Causes a crash because of unknown reasons
		//Do not uncomment
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.OAK_DOOR);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.ACACIA_DOOR);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.BIRCH_DOOR);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.DARK_OAK_DOOR);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.JUNGLE_DOOR);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.SPRUCE_DOOR);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.getItemFromBlock(Blocks.WOODEN_BUTTON));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.BOWL);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.BOAT);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.ACACIA_BOAT);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.BIRCH_BOAT);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.DARK_OAK_BOAT);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.JUNGLE_BOAT);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.SPRUCE_BOAT);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.REEDS);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.PAPER);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Items.BOOK);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 11),"###","###","###",'#',Items.WRITABLE_BOOK);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 11),"###","###","###",'#',Items.WRITTEN_BOOK);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 4),"###","###","###",'#',Items.CHEST_MINECART);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 25),"###","###","###",'#',Items.MAP);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 25),"###","###","###",'#',Items.FILLED_MAP);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.FISHING_ROD);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.CARROT_ON_A_STICK);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.TALLGRASS));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.BROWN_MUSHROOM));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.RED_MUSHROOM));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.BROWN_MUSHROOM_BLOCK));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.BROWN_MUSHROOM_BLOCK));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.ARMOR_STAND);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.FIRE_CHARGE);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 32),"###","###","###",'#',Items.FIREWORK_CHARGE);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 51),"###","###","###",'#',Items.FIREWORKS);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 16),"###","###","###",'#',Items.GUNPOWDER);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 12),"###","###","###",'#',Items.BLAZE_POWDER);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 20),"###","###","###",'#',Items.MAGMA_CREAM);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 20),"###","###","###",'#',Items.GHAST_TEAR);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 50),"###","###","###",'#',Items.SPAWN_EGG);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.POISONOUS_POTATO);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.ROTTEN_FLESH);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.SPIDER_EYE);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Items.FERMENTED_SPIDER_EYE);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Items.RABBIT_FOOT);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.LEATHER);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 4),"###","###","###",'#',Items.LEATHER_BOOTS);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 8),"###","###","###",'#',Items.LEATHER_CHESTPLATE);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 5),"###","###","###",'#',Items.LEATHER_HELMET);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 7),"###","###","###",'#',Items.LEATHER_LEGGINGS);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Item.getItemFromBlock(Blocks.CHORUS_PLANT));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Item.getItemFromBlock(Blocks.CHORUS_FLOWER));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 18),"###","###","###",'#',Items.SHIELD);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 21),"###","###","###",'#',Items.DRAGON_BREATH);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 81),"###","###","###",'#',Item.getItemFromBlock(Blocks.TNT));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 82),"###","###","###",'#',Items.TNT_MINECART);
	}
}

