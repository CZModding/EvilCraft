package com.czmodding.evilcraft.blocks;

import com.czmodding.evilcraft.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {
	 
	public static Block rubyBlock;
	public static Block rubyOre;

	public static final void init() {
	GameRegistry.registerBlock(rubyBlock = new RubyBlock("rubyBlock", Material.iron), "rubyBlock");
	GameRegistry.registerBlock(rubyOre = new RubyOre("rubyOre", Material.rock, ModItems.ruby, 3, 9), "rubyOre");


	    }

	}
