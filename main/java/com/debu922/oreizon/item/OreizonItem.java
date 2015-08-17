package com.debu922.oreizon.item;

import com.debu922.oreizon.creativetabs.OreizonCreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreizonItem {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item hematiteChunk;
	public static Item woodenHammer;
	
	public static void initializeItem(){
		hematiteChunk = new Item().setUnlocalizedName("HematiteChunk").setCreativeTab(OreizonCreativeTabs.tabItem);
		woodenHammer = new Item().setUnlocalizedName("WoodenHammer").setCreativeTab(OreizonCreativeTabs.tabItem);
	}
	
	public static void registerItem(){
		
		GameRegistry.registerItem(hematiteChunk, hematiteChunk.getUnlocalizedName());
		GameRegistry.registerItem(woodenHammer, woodenHammer.getUnlocalizedName());
	}
	
}
