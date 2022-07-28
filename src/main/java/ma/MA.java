package ma;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import lotr.common.entity.LOTREntities;

@Mod(modid = "ma", dependencies = "required-after:lotr")

public class MA {
	@SidedProxy(serverSide = "ma.MAServerProxy", clientSide = "ma.MAClientProxy")
	public static MAServerProxy proxy;

	@EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit(event);
		LOTREntities.registerCreature(MAEntityMumakil.class, "Mumakil", 1004, 16376764, 11772801);
	}
}
