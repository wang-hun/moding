package com.wh.orientalmagic.block;

import com.wh.orientalmagic.creativetab.TabOrientalmagic;
import com.wh.orientalmagic.util.Reference;
import net.minecraft.block.Block;

import java.util.Random;

import javax.annotation.Nonnull;



import com.wh.orientalmagic.creativetab.TabOrientalmagic;
import com.wh.orientalmagic.item.ItemRegistryHandler;
import com.wh.orientalmagic.util.Reference;
import net.minecraft.block.material.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


import net.minecraft.block.material.Material;

public class CinnabarBlock extends Block {
	public CinnabarBlock() 
	{
	super(Material.ROCK);//方块类型
	this.setUnlocalizedName(Reference.Mod_ID+":cinnabar_block");
	this.setRegistryName("cinnabar_block");
	this.setHarvestLevel("pickaxe", 1);//挖掘工具，及等级，详见注释 
	this.setHardness(5F);//硬度	
	this.setCreativeTab(TabOrientalmagic.TAB_ORIENTALMAGIC);
	}
	 @Override  //添加可以做信标基座
	  public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
	    return true;//true
	  }
}
