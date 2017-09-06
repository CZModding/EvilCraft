package com.github.czmodding.evilcraft.tabs;

import com.github.czmodding.evilcraft.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SoulsTab extends CreativeTabs{

	String name;
	
	public SoulsTab(int par1, String par2Str)
	{
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if (this.name == "tabSouls") 
		{
			return ModItems.soulYeti;
		} else if (this.name == "tabSoulsTest")
		
		return null;
		return null;
	}

}
