package ma;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import lotr.common.entity.LOTREntities;

@Mod(modid = "ma", dependencies = "required-after:lotr", useMetadata = true)
public class MA {
	@SidedProxy(serverSide = "ma.MAServerProxy", clientSide = "ma.MAClientProxy")
	private static MAServerProxy proxy;

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit(event);
		LOTREntities.registerCreature(MAEntityMumakil.class, "Mumakil", 1004, 16376764, 11772801);
	}
}
