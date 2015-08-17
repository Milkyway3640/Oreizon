package com.debu922.oreizon.machinery;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Kiln extends BlockContainer {

	private final boolean isActive;
	
	public Kiln(boolean isActive) {
		super(Material.rock);
		
		this.isActive = isActive;
		
	}

	@SideOnly(Side.CLIENT)
	private IIcon
	
	
	
	
	
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return null;
	}

}
