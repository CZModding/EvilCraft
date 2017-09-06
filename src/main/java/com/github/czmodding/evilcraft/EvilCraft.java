package com.github.czmodding.evilcraft;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
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

public class EvilCraft {
	private static final IWorldGenerator eventWorldGen = null;
	private ModArmory registerModEntity;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{ModItems.init();
	ModBlocks.init();
	ModArmory.init();
	
	EvilCraftWorldGeneration eventWorldGen = new EvilCraftWorldGeneration();


	GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		registerModEntity.init();
		ModEntities.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
