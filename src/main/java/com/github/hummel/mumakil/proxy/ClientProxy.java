package com.github.hummel.mumakil.proxy;

import com.github.hummel.mumakil.content.MumakilEntity;
import com.github.hummel.mumakil.content.MumakilRender;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class ClientProxy implements CommonProxy {
	@Override
	public void onInit(FMLInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(MumakilEntity.class, new MumakilRender());
	}
}