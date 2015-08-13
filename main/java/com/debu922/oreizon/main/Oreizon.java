package com.debu922.oreizon.main;

import com.debu922.oreizon.block.OreizonBlock;
import com.debu922.oreizon.item.OreizonItem;
import com.debu922.oreizon.lib.Reference;
import com.debu922.oreizon.lib.ServerProxy;
import com.debu922.oreizon.world.OreizonWorld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Oreizon {
	@SidedProxy(clientSide= Reference.CLIENTPROXY, serverSide= Reference.SERVERPROXY)
	public static ServerProxy proxy;
	
	@Instance(Reference.MODID)
	public static MainRegistry modInstance
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){
		OreizonItem.mainRegistry();
		OreizonBlock.mainRegistry();
		OreizonWorld.mainRegistry();
		proxy.RegisterRenderInfo();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event){
		
	}
	
}
