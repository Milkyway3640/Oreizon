package com.debu922.oreizon.handler;

import com.debu922.oreizon.item.OreizonItem;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreizonFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == OreizonItem.woodenHammer) return 800;
		
		return 0;
	}
	
	public static void registerFuelHandler(){
		GameRegistry.registerFuelHandler(new OreizonFuelHandler());	
	}

}
