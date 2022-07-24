package com.wh.orientalmagic.block;

import net.minecraft.block.Block;
import com.wh.orientalmagic.util.Reference;
import net.minecraft.block.material.*;



public class CinnabarOre extends Block
{
	public CinnabarOre() 
	{
	super(Material.ROCK);//方块类型
	this.setUnlocalizedName(Reference.Mod_ID+":cinnabar_ore");
	this.setRegistryName("cinnabar_ore");
	this.setHarvestLevel("pickaxe", 1);//挖掘工具，及等级，详见注释 
	this.setHardness(2.5F);//硬度	
	}
}
