package com.github.czmodding.evilcraft.blocks;

import com.github.czmodding.evilcraft.help.Reference;
import com.github.czmodding.evilcraft.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRubyBlock extends Block{

	public BlockRubyBlock() 
	{
		this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Reference.MODID + ":" + unlocalizedName);
        this.setCreativeTab(ModTabs.tabBlocks);
        this.setHardness(6.0F);
        this.setResistance(15.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeMetal);
	}

}
