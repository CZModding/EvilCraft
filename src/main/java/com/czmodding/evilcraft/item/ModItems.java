package com.czmodding.evilcraft.item;

import com.czmodding.evilcraft.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {

	public static ToolMaterial obsTool = EnumHelper.addToolMaterial("obsTool", 6, 4312, 15.0F, 15.0F, 56);
	public static ToolMaterial rubyTool = EnumHelper.addToolMaterial("rubyTool", 5, 2156, 13.0F, 12.0F, 28);
	public static ToolMaterial emeraldTool = EnumHelper.addToolMaterial("emeraldTool", 4, 2000, 12.0F, 10.0F, 24);
	public static Item ruby;
	public static final void init() {
    	ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":ruby");;
    	GameRegistry.registerItem(ruby, "ruby");
    }
}
