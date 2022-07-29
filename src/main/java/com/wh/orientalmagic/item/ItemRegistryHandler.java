package com.wh.orientalmagic.item;
import com.wh.orientalmagic.block.BlockRegistryHandler;
import com.wh.orientalmagic.item.tools.SmiteWoodenSword;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.vertex.VertexFormatElement.EnumUsage;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegistryHandler 
{
	///工具的属性设计 name(材质名称), harvestLevel(挖掘等级), maxUses(工具耐久), efficiency(挖掘效率), damage(工具造成的伤害), enchantability(工具附魔能力,越高附的魔越好
	public static final Item.ToolMaterial SMITE_SWORD=EnumHelper.addToolMaterial("smite_sword", 0, 75, 0, 3, 20);
	///

	private static void registerModel(Item item) 
	{
		ModelResourceLocation modelResourceLocation=new 
				ModelResourceLocation(item.getRegistryName(),"inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
		
	}
public final static SmiteWoodenSword SMITE_WOODEN_SWORD=new SmiteWoodenSword();
public final static BodyDust BODY_DUST=new BodyDust();
public final static Cinnabar CINNABAR=new Cinnabar();
public static final ItemBlock I_CINNABAR_ORE=new ItemBlock(BlockRegistryHandler.B_CINNABAR_ORE);
public static final ItemBlock I_CINNABAR_BLOCK=new ItemBlock(BlockRegistryHandler.B_CINNABAR_BLOCK);
@SubscribeEvent
	public static void onRegistry(Register<Item> event) 
	{
	IForgeRegistry<Item> registry = event.getRegistry();
	registry.register(BODY_DUST);
	registry.register(CINNABAR);
	I_CINNABAR_ORE.setRegistryName(I_CINNABAR_ORE.getBlock().getRegistryName());
	I_CINNABAR_BLOCK.setRegistryName(I_CINNABAR_BLOCK.getBlock().getRegistryName());
	registry.register(I_CINNABAR_ORE);
	registry.register(SMITE_WOODEN_SWORD);
	registry.register(I_CINNABAR_BLOCK);
	}

//方块物品形态的注册
//物品方块都要在上面一个函数加事件监听
@SubscribeEvent
 	@SideOnly(Side.CLIENT)
	public static void onModelRegistry(ModelRegistryEvent event) 	
	{
	//此材质加载方法，如下，参数一为物品，
	//第二参数为meta,例如羊毛有十六种颜色，但是均为同一物品,mate值为15。
		//ModelLoader.setCustomModelResourceLocation(BODY_DUST, 0,
			//	new ModelResourceLocation(BODY_DUST.getRegistryName(),"inventory"));
		//ModelLoader.setCustomModelResourceLocation(CINNABAR, 0,
			//	new ModelResourceLocation(CINNABAR.getRegistryName(),"inventory"));
		//第三参数为模型的定位 ，此对象的第二参数当时物品时则为“inventory”
		//第一参数依旧是依照物品ID获取物品材质
		
		////方块材质监听如下
		//ModelLoader.setCustomModelResourceLocation(I_CINNABAR_ORE, 0,
			//	new ModelResourceLocation(I_CINNABAR_ORE.getRegistryName(),"inventory"));
	
	//已经集成到上方构造函数中，不同时，请另外声明
	registerModel(SMITE_WOODEN_SWORD);
	registerModel(BODY_DUST);	
	registerModel(I_CINNABAR_ORE);	
	registerModel(CINNABAR);	
	registerModel(I_CINNABAR_BLOCK);
	}

	
}
