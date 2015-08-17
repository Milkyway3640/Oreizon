package com.debu922.oreizon.creativetabs;

import com.debu922.oreizon.block.OreizonBlock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreizonCreativeTabBlock extends CreativeTabs {

	public OreizonCreativeTabBlock(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(OreizonBlock.oreHematiteOre);
	}

}
