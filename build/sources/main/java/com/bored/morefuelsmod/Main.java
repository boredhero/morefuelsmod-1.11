package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.client.MoreFuelsTab;
import com.bored.morefuelsmod.item.ModItems;
import com.bored.morefuelsmod.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.modid, name = Main.name, version = Main.version, acceptedMinecraftVersions = "[1.11]")
public class Main {

	public static final String modid = "morefuelsmod-1.11.x";
	public static final String name = "More Fuels Mod";
	public static final String version = "1.5.2";

	@Mod.Instance(modid)
	public static Main instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is making smelting better for you!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			//RFtL.init();
		config.save();
		ModItems.init();
		ModBlocks.init();
		ModCrafting.init();
		ModSmelting.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerFuelHandler(new Fuels());
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 1);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
	
	@SidedProxy(clientSide = "com.bored.morefuelsmod.proxy.ClientProxy", serverSide = "com.bored.morefuelsmod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final MoreFuelsTab creativeTab = new MoreFuelsTab();

}