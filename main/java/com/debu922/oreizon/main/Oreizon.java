package com.debu922.oreizon.main;

import com.debu922.oreizon.block.OreizonBlock;
import com.debu922.oreizon.creativetabs.OreizonCreativeTabs;
import com.debu922.oreizon.handler.OreizonFuelHandler;
import com.debu922.oreizon.item.OreizonItem;
import com.debu922.oreizon.lib.OreDict;
import com.debu922.oreizon.lib.Reference;
import com.debu922.oreizon.lib.ServerProxy;
import com.debu922.oreizon.recipes.OreizonVanillaRecipes;
import com.debu922.oreizon.world.OreizonWorld;

import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Oreizon {
	@SidedProxy(clientSide= Reference.CLIENTPROXY, serverSide= Reference.SERVERPROXY)
	public static ServerProxy proxy;
		
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){
		OreizonCreativeTabs.initializeTabs();
		OreizonItem.mainRegistry();
		OreizonBlock.mainRegistry();
		OreizonWorld.mainRegistry();	
		
		proxy.RegisterRenderInfo();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event){
		OreizonVanillaRecipes.mainRegistry();
		OreizonFuelHandler.registerFuelHandler();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event){
		OreDict.mainRegistry();
	}
	
}
