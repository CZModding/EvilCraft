package com.github.czmodding.evilcraft.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModTileEntities {

    public static void init() {
        GameRegistry.registerTileEntity(ModTileEntity.class, "tutorial_tile_entity");
    }

}
