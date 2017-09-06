package com.github.czmodding.evilcraft.tabs;

import com.github.czmodding.evilcraft.init.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OresTab extends CreativeTabs{
String name;
	
	public BlocksTab(int par1, String par2Str)
	{
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if (this.name == "tabBlocks") 
		{
			return ModBlocks.rubyBlock;
		} else if (this.name == "tabBlocksTest")
		
		return null;
		return null;
	}

}

}

