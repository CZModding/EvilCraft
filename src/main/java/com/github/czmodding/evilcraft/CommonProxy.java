package com.github.czmodding.evilcraft;

import com.github.czmodding.evilcraft.generation.EvilCraftWorldGeneration;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	 public void preInit(FMLPreInitializationEvent e) {

	    }

	    public void init(FMLInitializationEvent e) {
	    	   GameRegistry.registerWorldGenerator(new EvilCraftWorldGeneration(), 0);
	    }

	    public void postInit(FMLPostInitializationEvent e) {

	    }
	}

