package com.github.hummel.mumakil.proxy;

import com.github.hummel.mumakil.entity.EntityMumakil;
import com.github.hummel.mumakil.render.RenderMumakil;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityMumakil.class, new RenderMumakil());
	}
}