package com.debu922.oreizon.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreizonItem {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item hematiteChunk;
	
	public static void initializeItem(){
		hematiteChunk = new Item().setUnlocalizedName("HematiteChunk").setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public static void registerItem(){
		
		GameRegistry.registerItem(hematiteChunk, hematiteChunk.getUnlocalizedName());
	}
	
}
