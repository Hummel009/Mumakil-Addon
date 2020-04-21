package mumakil;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends ServerProxy {
    @Override
    public void onInit(FMLInitializationEvent event) {
        super.onInit(event);
        RenderingRegistry.registerEntityRenderingHandler(MumakilEntity.class, new MumakilRender());
    }
}
