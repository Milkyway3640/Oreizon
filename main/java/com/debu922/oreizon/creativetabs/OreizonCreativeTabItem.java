package com.debu922.oreizon.creativetabs;

import com.debu922.oreizon.item.OreizonItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreizonCreativeTabItem extends CreativeTabs {

	public OreizonCreativeTabItem(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return OreizonItem.hematiteChunk;
	}

}
