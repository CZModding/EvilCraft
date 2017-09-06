package com.github.czmodding.evilcraft.init;

import com.github.czmodding.evilcraft.blocks.BlockRubyBlock;
import com.github.czmodding.evilcraft.blocks.BlockRubyOre;
import com.github.czmodding.evilcraft.help.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static Block rubyOre = new BlockRubyOre();
	public static final void init()
    {RegisterHelper.registerBlock(rubyOre);
    
    }
    
    public static Block rubyBlock = new BlockRubyBlock();
	{RegisterHelper.registerBlock(rubyBlock);

    }

}
