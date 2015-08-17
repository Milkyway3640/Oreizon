package com.debu922.oreizon.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class OreizonCreativeTabOre extends CreativeTabs {

	public OreizonCreativeTabOre(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Blocks.gold_ore);
	}
}
