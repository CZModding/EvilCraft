package com.github.czmodding.evilcraft;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.github.czmodding.evilcraft.generation.EvilCraftWorldGeneration;
import com.github.czmodding.evilcraft.help.Reference;
import com.github.czmodding.evilcraft.init.ModArmory;
import com.github.czmodding.evilcraft.init.ModBlocks;
import com.github.czmodding.evilcraft.init.ModEntities;
import com.github.czmodding.evilcraft.init.ModItems;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public public class EvilCraft {
	private static final IWorldGenerator eventWorldGen = null;
	private ModArmory registerModEntity;

	@SidedProxy(clientSide="com.github.czmodding.evilcraft.ClientProxy", serverSide="com.github.czmodding.evilcraft.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{ModItems.init();
	ModBlocks.init();
	ModArmory.init();
	proxy.preInit(e);
	EvilCraftWorldGeneration eventWorldGen = new EvilCraftWorldGeneration();


	GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		registerModEntity.init();
		ModEntities.init();
		proxy.init(e)
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(e)
	}

}
