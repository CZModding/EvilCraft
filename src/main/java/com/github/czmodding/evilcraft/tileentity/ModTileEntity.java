package com.github.czmodding.evilcraft.tileentity;

import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity ;

public class ModTileEntity extends TileEntity implements IUpdatePlayerListBox{

	@Override
	public void update() {
		if (!this.worldObj.isRemote)
		 System.out.println("Hello, I'm a TileEntity!");
	}

}
