package com.debu922.oreizon.lib;

import com.debu922.oreizon.block.OreizonBlock;

import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
    public static void mainRegistry(){
    	blockOreDict();
    	itemOreDict();
    }
    
    public static void blockOreDict(){
    	OreDictionary.registerOre("oreHematite", OreizonBlock.oreHematiteOre);
    }
    
    public static void itemOreDict(){
    	
    }
}
