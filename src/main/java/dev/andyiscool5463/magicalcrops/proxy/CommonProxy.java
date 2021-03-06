package dev.andyiscool5463.magicalcrops.proxy;

import dev.andyiscool5463.magicalcrops.MagicalCropsCore;
import dev.andyiscool5463.magicalcrops.Reference;
import dev.andyiscool5463.magicalcrops.TutorialGuiHandler;
import dev.andyiscool5463.magicalcrops.gen.OreGen;
import dev.andyiscool5463.magicalcrops.init.ModBlocks;
import dev.andyiscool5463.magicalcrops.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
	
		ModItems.init();
		ModBlocks.init();

	}
	
	// Init - Do your mod setup. Build whatever data structures you care aboutandler
	public void init(FMLInitializationEvent event) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new TutorialGuiHandler());
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
	
	
	// postInit "Handle interaction with other mods, complete your setup based on this."
	public void postInit(FMLPostInitializationEvent event) {
	}
	
	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void serverStarting(FMLServerStartingEvent event) {
	}	
	public void registerItemRenderer(Item item, int meta, String id) {}
}
