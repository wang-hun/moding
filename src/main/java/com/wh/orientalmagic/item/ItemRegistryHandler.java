package com.wh.orientalmagic.item;
import com.wh.orientalmagic.block.BlockRegistryHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegistryHandler 
{
public final static BodyDust BODY_DUST=new BodyDust();

@SubscribeEvent
	public static void onRegistry(Register<Item> event) 
	{
	IForgeRegistry<Item> registry = event.getRegistry();
	registry.register(BODY_DUST);
	I_CINNABAR_ORE.setRegistryName(I_CINNABAR_ORE.getBlock().getRegistryName());
	registry.register(I_CINNABAR_ORE);
	}
public static final ItemBlock I_CINNABAR_ORE=new ItemBlock(BlockRegistryHandler.B_CINNABAR_ORE);
//方块物品形态的注册
//物品方块都要在上面一个函数加事件监听
@SubscribeEvent
 	@SideOnly(Side.CLIENT)
	public static void onModelRegistry(ModelRegistryEvent event) 	
	{
	//此材质加载方法，如下，参数一为物品，
	//第二参数为meta,例如羊毛有十六种颜色，但是均为同一物品,mate值为15。
		ModelLoader.setCustomModelResourceLocation(BODY_DUST, 0,
				new ModelResourceLocation(BODY_DUST.getRegistryName(),"inventory"));
		//第三参数为模型的定位 ，此对象的第二参数当时物品时则为“inventory”
		//第一参数依旧是依照物品ID获取物品材质
		
		////方块材质监听如下
		ModelLoader.setCustomModelResourceLocation(I_CINNABAR_ORE, 0,
				new ModelResourceLocation(I_CINNABAR_ORE.getRegistryName(),"inventory"));
		
	}

	
}
