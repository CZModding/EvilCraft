package com.czmodding.evilcraft;

import com.czmodding.evilcraft.blocks.ModBlocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "evilcraft";
    public static final String MODNAME = "EvilCraft Mod";
    public static final String VERSION = "a2.0.0";
        
    @Instance
    public static Main instance = new Main();
        
     
    @SidedProxy(clientSide="com.czmodding.evilcraft.ClientProxy", serverSide="com.czmodding.evilcraft.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e); 
    	ModBlocks.init();
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);        
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);  
    }
}