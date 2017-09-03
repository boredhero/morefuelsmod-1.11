package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.client.MoreFuelsTab;
import com.bored.morefuelsmod.item.ModItems;
import com.bored.morefuelsmod.proxy.CommonProxy;
import com.bored.morefuelsmod.fuels.*;
import com.bored.morefuelsmod.fuels.modfuels.*;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.modid, name = Main.name, version = Main.version, acceptedMinecraftVersions = "[1.11, 1.11.2]")
public class Main {

	public static final String modid = "morefuelsmod";
	public static final String name = "More Fuels Mod";
	public static final String version = "1.6.1";

	@Mod.Instance(modid)
	public static Main instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println(name + " is making smelting oh so much better for you!");
		ModItems.init();
		ModBlocks.init();
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			RFtL.init();
		boolean enableModOrespawn = config.get(Configuration.CATEGORY_GENERAL, "enableModOrespawn", true).getBoolean(true);
		if(enableModOrespawn)
			GameRegistry.registerWorldGenerator(new ModWorldGen(), 1);
		boolean enableModCraftingRecipes = config.get(Configuration.CATEGORY_GENERAL, "enableModCraftingRecipes", true).getBoolean(true);
		if(enableModCraftingRecipes)
			ModCrafting.init();
		boolean enableBituminousCoalOreSmeltingIntoCoke = config.get(Configuration.CATEGORY_GENERAL, "enableBituminousCoalOreSmeltingIntoCoke", true).getBoolean(true);
		if(enableBituminousCoalOreSmeltingIntoCoke)
			ModSmelting.init();
		//Fuels start here
		boolean enableDeadbush = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDeadbush", true).getBoolean(true);
		if(enableDeadbush)
			GameRegistry.registerFuelHandler(new Deadbush());
		boolean enableCactus = config.get(Configuration.CATEGORY_GENERAL, "fuelenableCactus", true).getBoolean(true);
		if(enableCactus)
			GameRegistry.registerFuelHandler(new Cactus());
		boolean enableWeb = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWeb", true).getBoolean(true);
		if(enableWeb)
			GameRegistry.registerFuelHandler(new Web());
		boolean enableLever = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLever", true).getBoolean(true);
		if(enableLever)
			GameRegistry.registerFuelHandler(new Lever());
		boolean enableDoublePlant = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDoublePlant", true).getBoolean(true);
		if(enableDoublePlant)
			GameRegistry.registerFuelHandler(new DoublePlant());
		boolean enableRedFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRedFlower", true).getBoolean(true);
		if(enableRedFlower)
			GameRegistry.registerFuelHandler(new RedFlower());
		boolean enableYellowFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableYellowFlower", true).getBoolean(true);
		if(enableYellowFlower)
			GameRegistry.registerFuelHandler(new YellowFlower());
		boolean enableItemFrame = config.get(Configuration.CATEGORY_GENERAL, "fuelenableItemFrame", true).getBoolean(true);
		if(enableItemFrame)
			GameRegistry.registerFuelHandler(new ItemFrame());
		boolean enableBed = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBed", true).getBoolean(true);
		if(enableBed)
			GameRegistry.registerFuelHandler(new Bed());
		boolean enablePainting = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePainting", true).getBoolean(true);
		if(enablePainting)
			GameRegistry.registerFuelHandler(new Painting());
		boolean enableSign = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSign", true).getBoolean(true);
		if(enableSign)
			GameRegistry.registerFuelHandler(new Sign());
		boolean enableLadder = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLadder", true).getBoolean(true);
		if(enableLadder)
			GameRegistry.registerFuelHandler(new Ladder());
		boolean enableRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRail", true).getBoolean(true);
		if(enableRail)
			GameRegistry.registerFuelHandler(new Rail());
		boolean enableActivatorRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableActivatorRail", true).getBoolean(true);
		if(enableActivatorRail)
			GameRegistry.registerFuelHandler(new ActivatorRail());
		boolean enableDetectorRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDetectorRail", true).getBoolean(true);
		if(enableDetectorRail)
			GameRegistry.registerFuelHandler(new DetectorRail());
		boolean enablePoweredRail = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePoweredRail", true).getBoolean(true);
		if(enablePoweredRail)
			GameRegistry.registerFuelHandler(new PoweredRail());
		boolean enablePiston = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePiston", true).getBoolean(true);
		if(enablePiston)
			GameRegistry.registerFuelHandler(new Piston());
		boolean enableStickyPiston = config.get(Configuration.CATEGORY_GENERAL, "fuelenableStickyPiston", true).getBoolean(true);
		if(enableStickyPiston)
			GameRegistry.registerFuelHandler(new StickyPiston());
		boolean enableVine = config.get(Configuration.CATEGORY_GENERAL, "fuelenableStickyPiston", true).getBoolean(true);
		if(enableVine)
			GameRegistry.registerFuelHandler(new Vine());
		boolean enableWaterLily = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWaterLily", true).getBoolean(true);
		if(enableWaterLily)
			GameRegistry.registerFuelHandler(new WaterLily());
		boolean enableTripwireHook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTripwireHook", true).getBoolean(true);
		if(enableTripwireHook)
			GameRegistry.registerFuelHandler(new TripwireHook());
		boolean enableHayBlock = config.get(Configuration.CATEGORY_GENERAL, "fuelenableHayBlock", true).getBoolean(true);
		if(enableHayBlock)
			GameRegistry.registerFuelHandler(new HayBlock());
		boolean enableCarpet = config.get(Configuration.CATEGORY_GENERAL, "fuelenableCarpet", true).getBoolean(true);
		if(enableCarpet)
			GameRegistry.registerFuelHandler(new Carpet());
		boolean enableWool = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWool", true).getBoolean(true);
		if(enableWool)
			GameRegistry.registerFuelHandler(new Wool());
		boolean enableArrow = config.get(Configuration.CATEGORY_GENERAL, "fuelenableArrow", true).getBoolean(true);
		if(enableArrow)
			GameRegistry.registerFuelHandler(new Arrow());
		boolean enableFeather = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFeather", true).getBoolean(true);
		if(enableFeather)
			GameRegistry.registerFuelHandler(new Feather());
		boolean enableWheat = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWheat", true).getBoolean(true);
		if(enableWheat)
			GameRegistry.registerFuelHandler(new Wheat());
		boolean enableWheatSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWheatSeeds", true).getBoolean(true);
		if(enableWheatSeeds)
			GameRegistry.registerFuelHandler(new WheatSeeds());
		boolean enableMelonSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMelonSeeds", true).getBoolean(true);
		if(enableMelonSeeds)
			GameRegistry.registerFuelHandler(new MelonSeeds());
		boolean enablePumpkinSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePumpkinSeeds", true).getBoolean(true);
		if(enablePumpkinSeeds)
			GameRegistry.registerFuelHandler(new PumpkinSeeds());
		boolean enableBeetSeeds = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBeetSeeds", true).getBoolean(true);
		if(enableBeetSeeds)
			GameRegistry.registerFuelHandler(new BeetSeeds());
		boolean enableTorch = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTorch", true).getBoolean(true);
		if(enableTorch)
			GameRegistry.registerFuelHandler(new Torch());
		boolean enableRedstoneTorch = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRedstoneTorch", true).getBoolean(true);
		if(enableRedstoneTorch)
			GameRegistry.registerFuelHandler(new RedstoneTorch());
		boolean enableDoors = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDoors", true).getBoolean(true);
		if(enableDoors)
			GameRegistry.registerFuelHandler(new Doors());
		boolean enableWoodenButton = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWoodenButton", true).getBoolean(true);
		if(enableWoodenButton)
			GameRegistry.registerFuelHandler(new WoodenButton());
		boolean enableBowl = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBowl", true).getBoolean(true);
		if(enableBowl)
			GameRegistry.registerFuelHandler(new Bowl());
		boolean enableSugarcane = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSugarcane", true).getBoolean(true);
		if(enableSugarcane)
			GameRegistry.registerFuelHandler(new Sugarcane());
		boolean enablePaper = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePaper", true).getBoolean(true);
		if(enablePaper)
			GameRegistry.registerFuelHandler(new Paper());
		boolean enableBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBook", true).getBoolean(true);
		if(enableBook)
			GameRegistry.registerFuelHandler(new Book());
		boolean enableWritableBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWritableBook", true).getBoolean(true);
		if(enableWritableBook)
			GameRegistry.registerFuelHandler(new WritableBook());
		boolean enableWrittenBook = config.get(Configuration.CATEGORY_GENERAL, "fuelenableWrittenBook", true).getBoolean(true);
		if(enableWrittenBook)
			GameRegistry.registerFuelHandler(new WrittenBook());
		boolean enableMinecartWithChest = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMinecartWithChest", true).getBoolean(true);
		if(enableMinecartWithChest)
			GameRegistry.registerFuelHandler(new MinecartWithChest());
		boolean enableMaps = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMaps", true).getBoolean(true);
		if(enableMaps)
			GameRegistry.registerFuelHandler(new Maps());
		boolean enableFishingRod = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFishingRod", true).getBoolean(true);
		if(enableFishingRod)
			GameRegistry.registerFuelHandler(new FishingRod());
		boolean enableCarrotOnAStick = config.get(Configuration.CATEGORY_GENERAL, "fuelenableCarrotOnAStick", true).getBoolean(true);
		if(enableCarrotOnAStick)
			GameRegistry.registerFuelHandler(new CarrotOnAStick());
		boolean enableMushroomItems = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMushroomItems", true).getBoolean(true);
		if(enableMushroomItems)
			GameRegistry.registerFuelHandler(new MushroomItems());
		boolean enableExperimentalMushroomBlocks = config.get(Configuration.CATEGORY_GENERAL, "fuelenableExperimentalMushroomBlocks", true).getBoolean(true);
		if(enableExperimentalMushroomBlocks)
			GameRegistry.registerFuelHandler(new ExperimentalMushroomBlocks());
		boolean enableArmorStand = config.get(Configuration.CATEGORY_GENERAL, "fuelenableArmorStand", true).getBoolean(true);
		if(enableArmorStand)
			GameRegistry.registerFuelHandler(new ArmorStand());
		boolean enableFireCharge = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireCharge", true).getBoolean(true);
		if(enableFireCharge)
			GameRegistry.registerFuelHandler(new FireCharge());
		boolean enableFireworkCharge = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireworkCharge", true).getBoolean(true);
		if(enableFireworkCharge)
			GameRegistry.registerFuelHandler(new FireworkCharge());
		boolean enableFireworks = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFireworks", true).getBoolean(true);
		if(enableFireworks)
			GameRegistry.registerFuelHandler(new Fireworks());
		boolean enableGunpowder = config.get(Configuration.CATEGORY_GENERAL, "fuelenableGunpowder", true).getBoolean(true);
		if(enableGunpowder)
			GameRegistry.registerFuelHandler(new Gunpowder());
		boolean enableBlazePowder = config.get(Configuration.CATEGORY_GENERAL, "fuelenableBlazePowder", true).getBoolean(true);
		if(enableBlazePowder)
			GameRegistry.registerFuelHandler(new BlazePowder());
		boolean enableMagmaCream = config.get(Configuration.CATEGORY_GENERAL, "fuelenableMagmaCream", true).getBoolean(true);
		if(enableMagmaCream)
			GameRegistry.registerFuelHandler(new MagmaCream());
		boolean enableGhastTear = config.get(Configuration.CATEGORY_GENERAL, "fuelenableGhastTear", true).getBoolean(true);
		if(enableGhastTear)
			GameRegistry.registerFuelHandler(new GhastTear());
		boolean enableSpawnEgg = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSpawnEgg", false).getBoolean(true);
		if(enableSpawnEgg)
			GameRegistry.registerFuelHandler(new SpawnEgg());
		boolean enablePoisonousPotato = config.get(Configuration.CATEGORY_GENERAL, "fuelenablePoisonousPotato", true).getBoolean(true);
		if(enablePoisonousPotato)
			GameRegistry.registerFuelHandler(new PoisonousPotato());
		boolean enableRottenFlesh = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRottenFlesh", false).getBoolean(true);
		if(enableRottenFlesh)
			GameRegistry.registerFuelHandler(new RottenFlesh());
		boolean enableSpiderEye = config.get(Configuration.CATEGORY_GENERAL, "fuelenableSpiderEye", true).getBoolean(true);
		if(enableSpiderEye)
			GameRegistry.registerFuelHandler(new SpiderEye());
		boolean enableFermentedSpiderEye = config.get(Configuration.CATEGORY_GENERAL, "fuelenableFermentedSpiderEye", true).getBoolean(true);
		if(enableFermentedSpiderEye)
			GameRegistry.registerFuelHandler(new FermentedSpiderEye());
		boolean enableRabbitFoot = config.get(Configuration.CATEGORY_GENERAL, "fuelenableRabitFoot", true).getBoolean(true);
		if(enableRabbitFoot)
			GameRegistry.registerFuelHandler(new RabbitFoot());
		boolean enableLeather = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLeather", true).getBoolean(true);
		if(enableLeather)
			GameRegistry.registerFuelHandler(new Leather());
		boolean enableLeatherArmor = config.get(Configuration.CATEGORY_GENERAL, "fuelenableLeatherArmor", true).getBoolean(true);
		if(enableLeatherArmor)
			GameRegistry.registerFuelHandler(new LeatherArmor());
		boolean enableChorusPlant = config.get(Configuration.CATEGORY_GENERAL, "fuelenableChorusPlant", true).getBoolean(true);
		if(enableChorusPlant)
			GameRegistry.registerFuelHandler(new ChorusPlant());
		boolean enableChorusFlower = config.get(Configuration.CATEGORY_GENERAL, "fuelenableChorusFlower", true).getBoolean(true);
		if(enableChorusFlower)
			GameRegistry.registerFuelHandler(new ChorusFlowers());
		boolean enableShield = config.get(Configuration.CATEGORY_GENERAL, "fuelenableShield", true).getBoolean(true);
		if(enableShield)
			GameRegistry.registerFuelHandler(new Shield());
		boolean enableDragonBreath = config.get(Configuration.CATEGORY_GENERAL, "fuelenableDragonBreath", true).getBoolean(true);
		if(enableDragonBreath)
			GameRegistry.registerFuelHandler(new DragonBreath());
		boolean enableTNT = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTNT", true).getBoolean(true);
		if(enableTNT)
			GameRegistry.registerFuelHandler(new TNT());
		boolean enableTNTMinecart = config.get(Configuration.CATEGORY_GENERAL, "fuelenableTNTMinecart", true).getBoolean(true);
		if(enableTNTMinecart)
			GameRegistry.registerFuelHandler(new TNTMinecart());
		boolean enableExperimentalPotions = config.get(Configuration.CATEGORY_GENERAL, "fuelenableExperimentalPotions", false).getBoolean(true);
		if(enableExperimentalPotions)
			GameRegistry.registerFuelHandler(new ExperimentalPotions());
		//Mod Fuels Start Here
		boolean enablePelletFuel = config.get(Configuration.CATEGORY_GENERAL, "modfuelenablePelletFuel", true).getBoolean(true);
		if(enablePelletFuel)
			GameRegistry.registerFuelHandler(new PelletFuel());
		boolean enableConcentratedPelletFuel = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableConcentratedPelletFuel", true).getBoolean(true);
		if(enableConcentratedPelletFuel)
			GameRegistry.registerFuelHandler(new ConcentratedPelletFuel());
		boolean enableCoke = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableCoke", true).getBoolean(true);
		if(enableCoke)
			GameRegistry.registerFuelHandler(new Coke());
		boolean enableBituminousCoal = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableBituminousCoal", true).getBoolean(true);
		if(enableBituminousCoal)
			GameRegistry.registerFuelHandler(new BituminousCoal());
		boolean enableSlimoline = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableSlimoline", true).getBoolean(true);
		if(enableSlimoline)
			GameRegistry.registerFuelHandler(new Slimoline());
		boolean enableCokeBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableCokeBlock", true).getBoolean(true);
		if(enableCokeBlock)
			GameRegistry.registerFuelHandler(new CokeBlock());
		boolean enablePelletBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelenablePelletBlock", true).getBoolean(true);
		if(enablePelletBlock)
			GameRegistry.registerFuelHandler(new PelletBlock());
		boolean enableConcentratedPelletBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableConcentratedPelletBlock", true).getBoolean(true);
		if(enableConcentratedPelletBlock)
			GameRegistry.registerFuelHandler(new ConcentratedPelletBlock());
		boolean enableCreativeInfiniteFuelBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelenableCreativeInfiniteFuelBlock", true).getBoolean(true);
		if(enableCreativeInfiniteFuelBlock)
			GameRegistry.registerFuelHandler(new InfiniteCreativeFuelBlock());
		boolean enableBituminousCoalBlock = config.get(Configuration.CATEGORY_GENERAL, "modfuelsenableBituminousCoalBlock", true).getBoolean(true);
		if(enableBituminousCoalBlock)
			GameRegistry.registerFuelHandler(new BituminousCoalBlock());
		boolean enableLavaOrb = config.get(Configuration.CATEGORY_GENERAL, "modfuelsenableLavaOrb", true).getBoolean(true);
		if(enableLavaOrb)
			GameRegistry.registerFuelHandler(new LavaOrb());
		config.save();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
	
	@SidedProxy(clientSide = "com.bored.morefuelsmod.proxy.ClientProxy", serverSide = "com.bored.morefuelsmod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final MoreFuelsTab creativeTab = new MoreFuelsTab();

}