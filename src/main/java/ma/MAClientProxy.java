package ma;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class MAClientProxy extends MAServerProxy {
	@Override
	public void onInit(FMLInitializationEvent event) {
		super.onInit(event);
		RenderingRegistry.registerEntityRenderingHandler(MAEntityMumakil.class, new MARenderMumakil());
	}
}
