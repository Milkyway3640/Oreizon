package com.debu922.oreizon.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.debu922.oreizon.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Kiln extends Block {
	
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	
	private static boolean isBurning;
	private final boolean isBurning2;
	private final Random random = new Random();
	
	
	protected Kiln(boolean isActive) {
		super(Material.rock);
		isBurning2 = isActive;
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister){
			this.blockIcon = iconregister.registerIcon(Reference.MODID + ":KilnSide");
			this.front = iconregister.registerIcon(this.isBurning2 ? Reference.MODID + ":KilnActive" : Reference.MODID + ":KilnInactive");
			this.top = iconregister.registerIcon(Reference.MODID + ":KilnTopBottom");
		}

	public IIcon getIcon(int side, int meta){
		if(side == 1){
			return top;
		}else if(side == 3){
			return front;
		}else{
			return this.blockIcon;
		}
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9){
		player.openGui(mod, modGuiId, world, x, y, z);
		return true;
	}
}