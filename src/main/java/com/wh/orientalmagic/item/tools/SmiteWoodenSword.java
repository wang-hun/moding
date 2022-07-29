package com.wh.orientalmagic.item.tools;

import com.wh.orientalmagic.creativetab.TabOrientalmagic;
import com.wh.orientalmagic.item.ItemRegistryHandler;
import com.wh.orientalmagic.util.IHasModel;
import com.wh.orientalmagic.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.NonNullList;
import net.minecraft.init.Enchantments;


public class SmiteWoodenSword extends ItemSword 
{

	public SmiteWoodenSword() 
	{
		super(ItemRegistryHandler.SMITE_SWORD);
		
		this.setUnlocalizedName(Reference.Mod_ID+":smite_wooden_sword");
		this.setRegistryName("smite_wooden_sword");
		this.setMaxDamage(105);
		this.setCreativeTab(TabOrientalmagic.TAB_ORIENTALMAGIC);
	}
		@Override
		public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) 
		{//来自暮色森林mod的他山之石，让物品栏带附魔确实挺神奇！！！
			if (isInCreativeTab(tab)) 
			{
				ItemStack istack = new ItemStack(this);
				istack.addEnchantment(Enchantments.SMITE, 5);
				list.add(istack);
			}
		
	
		}
		
}

