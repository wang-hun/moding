package com.wh.orientalmagic.item;

import net.minecraft.item.Item;

import com.wh.orientalmagic.creativetab.TabOrientalmagic;
import com.wh.orientalmagic.util.Reference;

public class BodyDust extends Item 
{
	public BodyDust() 
	{
		this.setUnlocalizedName(Reference.Mod_ID+":body_dust");
		this.setRegistryName("body_dust");
		this.setMaxStackSize(64);
		this.setCreativeTab(TabOrientalmagic.TAB_ORIENTALMAGIC);//添加创造物品栏
	}

}
