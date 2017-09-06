package com.github.czmodding.evilcraft.init;

import com.github.czmodding.evilcraft.help.Reference;
import com.github.czmodding.evilcraft.help.RegisterHelper;
import com.github.czmodding.evilcraft.items.EvilCraftItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
public final class ModItems {
	
	public static ToolMaterial Ruby = EnumHelper.addToolMaterial("Ruby", 5, 2341, 14, 5, 24);
	public static Item soulYeti = new EvilCraftItems().setUnlocalizedName("soulYeti");
	public static void init()
    {RegisterHelper.registerItem(soulYeti);}

    public static Item ruby = new EvilCraftItems().setUnlocalizedName("ruby");
	{RegisterHelper.registerItem(ruby);

    }

	 public static Item rubySword = new EvilCraftItems().setUnlocalizedName("rubySword");
		{RegisterHelper.registerItem(rubySword);

	    }
		 public static Item rubyPick = new EvilCraftItems().setUnlocalizedName("rubyPick");
			{RegisterHelper.registerItem(rubyPick);

			GameRegistry.registerItem(ruby = new Item()
			        .setUnlocalizedName("ruby")
			        .setTextureName(Reference.MODID + ":" + "ruby")
			        .setCreativeTab(CreativeTabs.tabMaterials)
			        , "ruby");
		    }}

