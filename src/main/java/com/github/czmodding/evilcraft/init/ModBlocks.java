package com.github.czmodding.evilcraft.init;

import com.github.czmodding.evilcraft.blocks.BlockRubyOre;
import com.github.czmodding.evilcraft.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	public static Block rubyOre = new BlockRubyOre();
	public static void init()
    {RegisterHelper.registerBlock(rubyOre);

    }

}
