package com.wh.orientalmagic.item;
import net.minecraft.item.Item;

import com.wh.orientalmagic.creativetab.TabOrientalmagic;
import com.wh.orientalmagic.util.Reference;
public class Cinnabar extends Item 
{
	

		public Cinnabar() 
		{
			this.setUnlocalizedName(Reference.Mod_ID+":cinnabar");
			this.setRegistryName("cinnabar");
			this.setMaxStackSize(64);
			this.setCreativeTab(TabOrientalmagic.TAB_ORIENTALMAGIC);//添加创造物品栏
		}

	
}
