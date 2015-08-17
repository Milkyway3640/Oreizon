package com.debu922.oreizon.block;

import com.debu922.oreizon.creativetabs.OreizonCreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreizonBlock {

	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
	}
	
	//Ores
	public static Block oreHematiteOre;
	public static Block oreMagnetiteOre;
	public static Block oreCupriteOre;
	
	
	public static void initializeBlock(){
		
//	Ores		
		oreHematiteOre = new HematiteOre(Material.rock).setBlockName("HematiteOre").setHardness(10).setCreativeTab(OreizonCreativeTabs.tabOre);
		oreMagnetiteOre= new MagnetiteOre(Material.rock).setBlockName("MagnetiteOre").setHardness(10).setCreativeTab(OreizonCreativeTabs.tabOre);
		oreCupriteOre= new CupriteOre(Material.rock).setBlockName("CupriteOre").setHardness(10).setCreativeTab(OreizonCreativeTabs.tabOre);

//	Machines
	//	machineKilnIdle = new Kiln(false).setBlockName("Kiln").setCreativeTab(CreativeTabs.tabDecorations);
	//	machineKilnActive = new Kiln(true).setBlockName("KilnActive").setCreativeTab(CreativeTabs.tabDecorations).set;
		
	}
	
	public static void registerBlock(){
	
//	Ores
		GameRegistry.registerBlock(oreHematiteOre, oreHematiteOre.getUnlocalizedName());
		GameRegistry.registerBlock(oreMagnetiteOre, oreMagnetiteOre.getUnlocalizedName());
		GameRegistry.registerBlock(oreCupriteOre, oreCupriteOre.getUnlocalizedName());
		
	//	GameRegistry.registerBlock(kilnIdle, kilnIdle.getUnlocalizedName());
	//	GameRegistry.registerBlock(kilnActive, kilnActive.getUnlocalizedName());
	}
	
}
