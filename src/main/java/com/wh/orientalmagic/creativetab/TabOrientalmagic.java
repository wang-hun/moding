
package com.wh.orientalmagic.creativetab;

import com.wh.orientalmagic.item.ItemRegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabOrientalmagic extends CreativeTabs
{
	public static final TabOrientalmagic TAB_ORIENTALMAGIC =new TabOrientalmagic();

	public TabOrientalmagic()
	{
		super("Orientalmagic");//物品栏名称
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemRegistryHandler.BODY_DUST);//创造物品栏显示物品
	}

}
