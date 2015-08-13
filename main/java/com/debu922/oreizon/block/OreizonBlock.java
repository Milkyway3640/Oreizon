package com.debu922.oreizon.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreizonBlock {

	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
	}
	public static Block hematiteOre;
	public static Block kiln;
	public static Block kilnActive;
	
	public static void initializeBlock(){
		hematiteOre = new HematiteOre(Material.rock).setBlockName("HematiteOre").setCreativeTab(CreativeTabs.tabBlock);
		
		kiln = new Kiln(false).setBlockName("Kiln").setCreativeTab(CreativeTabs.tabDecorations);
		kilnActive = new Kiln(true).setBlockName("KilnActive").setCreativeTab(CreativeTabs.tabDecorations);
		
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(hematiteOre, hematiteOre.getUnlocalizedName());
		GameRegistry.registerBlock(kiln, kiln.getUnlocalizedName());
		GameRegistry.registerBlock(kilnActive, kilnActive.getUnlocalizedName());
	}
	
}
