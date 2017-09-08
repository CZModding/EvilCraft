package com.github.czmodding.evilcraft;

import com.github.czmodding.evilcraft.event.EventHandlerCommon;
import com.github.czmodding.evilcraft.generation.EvilCraftWorldGeneration;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

	 public void preInit(FMLPreInitializationEvent e) {

	    }

	    public void init(FMLInitializationEvent e) {
	    	   GameRegistry.registerWorldGenerator(new EvilCraftWorldGeneration(), 0);
	    	   MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
	    }

	    public void postInit(FMLPostInitializationEvent e) {

	    }
	}

