package com.github.czmodding.evilcraft.blocks;

import com.github.czmodding.evilcraft.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EnderBox extends Block{

	public EnderBox(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Reference.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
		
	}

}
