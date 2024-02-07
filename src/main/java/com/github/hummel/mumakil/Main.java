package com.github.hummel.mumakil;

import com.github.hummel.mumakil.entity.EntityMumakil;
import com.github.hummel.mumakil.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lotr.common.entity.LOTREntities;

@Mod(modid = "mumakil", dependencies = "required-after:lotr", useMetadata = true)
public class Main {
	@SidedProxy(serverSide = "com.github.hummel.mumakil.proxy.ServerProxy", clientSide = "com.github.hummel.mumakil.proxy.ClientProxy")
	private static CommonProxy proxy;

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit(event);
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOTREntities.registerCreature(EntityMumakil.class, "Mumakil", 1004, 16376764, 11772801);
	}
}