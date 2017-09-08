package com.github.czmodding.evilcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import java.util.Random;

import com.github.czmodding.evilcraft.help.Reference;
import com.github.czmodding.evilcraft.init.ModItems;
import com.github.czmodding.evilcraft.tabs.ModTabs;

public class BlockRubyOre extends Block{
	
	private Item drop;
	private int least_quantity;
	private int most_quantity;
	private int meta;

	public BlockRubyOre(String unlocalizedName, Material mat, Item drop, int meta, int least_quantity, int most_quantity) 
	
	
	{
        super(mat);
        this.drop = drop;
        this.meta = meta;
        this.least_quantity = 1;
        this.most_quantity = 8;
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Reference.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeStone);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 2);
    }

	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
	    return this.drop;
	}

	@Override
	public int damageDropped(int metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
	}
