package com.debu922.oreizon.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.debu922.oreizon.item.OreizonItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class OreizonVanillaRecipes {

	public static void mainRegistry(){
		craftingRecipes();
		smeltingRecipes();
	}
	
	public static void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(OreizonItem.woodenHammer), new Object[]{"www","wsw"," s ",'w', Blocks.planks,'s',Items.stick});
	}
	
	public static void smeltingRecipes(){
		
	}
}
