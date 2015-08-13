package com.debu922.oreizon.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreizonWorld {
	
	public static void mainRegistry(){
		initializeWorldGen();
	}

	public static void initializeWorldGen(){
		registerWorldGen(new OreizonWorldGenOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}
