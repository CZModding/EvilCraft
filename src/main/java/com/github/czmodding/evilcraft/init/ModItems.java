package com.github.czmodding.evilcraft.init;

import com.github.czmodding.evilcraft.help.RegisterHelper;
import com.github.czmodding.evilcraft.items.EvilCraftItems;
import net.minecraft.item.Item;

public class ModItems {
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

		    }}

