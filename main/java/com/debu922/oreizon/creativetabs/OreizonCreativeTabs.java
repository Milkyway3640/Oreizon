package com.debu922.oreizon.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class OreizonCreativeTabs {

	public static CreativeTabs tabBlock;
	public static CreativeTabs tabItem;
	public static CreativeTabs tabOre;
	
	public static void initializeTabs(){
	tabBlock = new OreizonCreativeTabBlock("OreizonBlockTab");
	tabItem = new OreizonCreativeTabItem("OreizonItemTab");
	tabOre = new OreizonCreativeTabItem("OreizonOreTab");
	
	}

}
