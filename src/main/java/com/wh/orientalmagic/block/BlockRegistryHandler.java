package com.wh.orientalmagic.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class BlockRegistryHandler 
{

	public static final CinnabarOre B_CINNABAR_ORE=new CinnabarOre();
	public static final CinnabarBlock B_CINNABAR_BLOCK=new CinnabarBlock();
	
	@SubscribeEvent
	public static void onRegistry(Register<Block> event) 
	{
		IForgeRegistry<Block> registry=event.getRegistry();
		registry.register(B_CINNABAR_ORE);
		registry.register(B_CINNABAR_BLOCK);
	}
}
