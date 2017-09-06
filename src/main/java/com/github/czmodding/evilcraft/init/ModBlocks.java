package com.github.czmodding.evilcraft.init;

import com.github.czmodding.evilcraft.blocks.BlockRubyBlock;
import com.github.czmodding.evilcraft.blocks.BlockRubyOre;
import com.github.czmodding.evilcraft.help.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;

public class ModBlocks {
	
	GameRegistry.registerBlock ruby_ore = new BlockRubyOre("ruby_ore", ToolMaterial.ruby, ModItems.ruby, 2, 4, "ruby_ore");
	
	public static Block rubyOre = new BlockRubyOre();
	public static final void init()
    {RegisterHelper.registerBlock(rubyOre);
    
    }
    
    public static Block rubyBlock = new BlockRubyBlock();
	{RegisterHelper.registerBlock(rubyBlock);

    }

}
