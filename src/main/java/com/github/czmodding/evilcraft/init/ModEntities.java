package com.github.czmodding.evilcraft.init;

import com.github.czmodding.evilcraft.EvilCraft;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class ModEntities {

	public static void registerEntities() {
		registerEntity(EntityYeti.class, "yeti", 64, 20, true);
	}
	
	public static void setEntityToSpawn() {
		EntityRegistry.addSpawn(EntityYeti.class, 6, 1, 5, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.hell, BiomeGenBase.jungle, BiomeGenBase.plains);
	}
	
	public static void generateSpawnEgg() {
		EntityRegistry.registerEgg(EntityYeti.class, 250, 198);
	}
	
	private static int entityID = 0;
	
	/**
	 * Register an entity with the specified tracking values.
	 *
	 * @param entityClass          The entity's class
	 * @param entityName           The entity's unique name
	 * @param trackingRange        The range at which MC will send tracking updates
	 * @param updateFrequency      The frequency of tracking updates
	 * @param sendsVelocityUpdates Whether to send velocity information packets as well
	 */
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(entityClass, entityName, entityID++, EvilCraft.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}

}
