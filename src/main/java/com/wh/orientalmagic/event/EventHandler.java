package com.wh.orientalmagic.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class EventHandler
{
	@SubscribeEvent
	public static void onPlayerJion(EntityJoinWorldEvent event) 
	{
		Entity entity=event.getEntity();
		if(entity instanceof EntityPlayer) //玩家加入世界事件
		{
			//§ =alt+167 § 详情使用见注释文件
			String message ="§6§o@东洋魔法 §r§4此mod处于测试阶段，如有bug及好的建议。\n"+
							"§4欢迎反馈至 §e§n邮箱3555617336@163.com";
			TextComponentString txet=new TextComponentString(message);
			entity.sendMessage(txet);
			//打开世界会自动弹出的话
		}
	}
}
