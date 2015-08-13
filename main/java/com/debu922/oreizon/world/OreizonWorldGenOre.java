/**
	package com.debu922.oreizon.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.debu922.oreizon.block.OreizonBlock;

import cpw.mods.fml.common.IWorldGenerator;

public class OreizonWorldGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
			case -1: 
				generateNether(random, chunkX * 16, chunkZ * 16, world);
				break;
			case 0:
				generateSurface(random, chunkX * 16, chunkZ * 16, world);
				break;
			case 1:
				generateEnd(random, chunkX * 16, chunkZ * 16, world);
				break;
			default:
				;
		}
	}

	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int maxVeinSize, int minVeinSize, int spawnChance){
		for (int i = 0; 1 < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
			
		}
	}
	
	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {

	}

	private void generateSurface(Random random, int chunkX, int chunkZ, World world) {
		addOre(OreizonBlock.hematiteOre, Blocks.stone, random, world, chunkX, chunkZ, 16, 42, 2, 8, 20);
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) {

	}

}
**/
package com.debu922.oreizon.world;

import java.util.Random;

import com.debu922.oreizon.block.OreizonBlock;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreizonWorldGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateSurface(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		default:
			;
		}

	}

	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		for (int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub

	}

	private void generateSurface(Random random, int chunkX, int chunkZ, World world) {
		addOre(OreizonBlock.hematiteOre, Blocks.stone, random, world, chunkX, chunkZ, 16, 48, 5, 25, 5);
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub

	}

}