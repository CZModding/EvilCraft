package com.github.czmodding.evilcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.github.czmodding.evilcraft.init.ModItems;
import com.github.czmodding.evilcraft.tabs.ModTabs;

public class BlockRubyOre extends Block{
	public BlockRubyOre()
    {
            super(Material.iron);
    		setCreativeTab(ModTabs.tabSouls);
    		  setStepSound(soundTypeStone);
    		  setHardness(2.5F);
    		  setResistance(10.0F);
    		  setHarvestLevel("pickaxe", 2);

    }

}
