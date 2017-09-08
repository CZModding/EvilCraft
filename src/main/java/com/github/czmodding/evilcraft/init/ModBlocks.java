package com.github.czmodding.evilcraft.init;

import com.github.czmodding.evilcraft.blocks.BlockRubyBlock;
import com.github.czmodding.evilcraft.blocks.BlockRubyOre;
import com.github.czmodding.evilcraft.blocks.EnderBox;
import com.github.czmodding.evilcraft.help.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;

public class ModBlocks {
	
	public static Block rubyOre = new BlockRubyOre(null, null, null, 0, 0, 0);
	public static final void init()
    {RegisterHelper.registerBlock(rubyOre);
    
    }
    
    public static Block rubyBlock = new BlockRubyBlock();
	{RegisterHelper.registerBlock(rubyBlock);
	
	Block boxEnder = new EnderBox(null, null);
	{RegisterHelper.registerBlock(boxEnder);
	GameRegistry.registerBlock(boxEnder = new EnderBox("boxEnder", Material.iron), "boxEnder");
	}

    }

}
