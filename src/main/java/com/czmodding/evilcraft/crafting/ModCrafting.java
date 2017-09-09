package com.czmodding.evilcraft.crafting;

import com.czmodding.evilcraft.blocks.ModBlocks;
import com.czmodding.evilcraft.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {
	
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rubyBlock),"##", "##", '#', ModItems.ruby);
		GameRegistry.addSmelting(ModItems.ruby, new ItemStack(ModBlocks.rubyOre), 1.0F);

}
	}
