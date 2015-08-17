package com.debu922.oreizon.machinery;

import net.minecraft.block.Block;

import com.debu922.oreizon.creativetabs.OreizonCreativeTabs;

public class OreizonMachine {

	public static void mainRegistry(){
		initializeMachine();
		registerMachine();
	}

//Kiln
	public static Block machineKilnIdle;
	public static Block machineKilnActive;
//
	
	public static void initializeMachine(){
	//Kiln
		machineKilnIdle = new Kiln(false).setBlockName("KilnIdle").setCreativeTab(OreizonCreativeTabs.tabBlock);
		machineKilnActive = new Kiln(true).setBlockName("KilnActive").setLightLevel(0.625F);
	}
	
	public static void registerMachine(){
		
	}
}
