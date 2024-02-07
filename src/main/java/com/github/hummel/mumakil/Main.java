package com.github.hummel.mumakil;

import com.github.hummel.mumakil.content.MumakilEntity;
import com.github.hummel.mumakil.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import lotr.common.entity.LOTREntities;

@Mod(modid = "mumakil", dependencies = "required-after:lotr", useMetadata = true)
public class Main {
	@SidedProxy(serverSide = "com.github.hummel.mumakil.proxy.ServerProxy", clientSide = "com.github.hummel.mumakil.proxy.ClientProxy")
	private static CommonProxy proxy;

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit(event);
		LOTREntities.registerCreature(MumakilEntity.class, "Mumakil", 1004, 16376764, 11772801);
	}
}