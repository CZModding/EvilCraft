package com.github.czmodding.evilcraft.init;

import com.github.czmodding.evilcraft.help.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import com.github.czmodding.evilcraft.init.ModItems;

public class ModArmory {
	static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 512, 2.0F, 2.0F, 14);
	public static Item rubySword = new ItemEvilCraftRubySword(RUBY).setUnlocalizedName("rubySword");
	public static Item rubyPick = new ItemEvilCraftRubyPickaxe(RUBY).setUnlocalizedName("rubyPick");
	
	public static Item rubyAxe = new ItemEvilCraftRubyAxe(RUBY).setUnlocalizedName("rubyAxe");
	
	public static void init(
			RegisterHelper.registerItem(rubySword);
			RegisterHelper.registerItem(rubyPick);
			RegisterHelper.registerItem(rubyAxe);
	
}
