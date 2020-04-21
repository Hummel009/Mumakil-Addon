package mumakil;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import lotr.common.entity.LOTREntities;

@Mod(modid="got", version=Mumakil.UPDATE, name=Mumakil.NAME, dependencies="required-after:lotr")

public class Mumakil {
	    public static final String ID = "mumakil";
	    public static final String AID = ID.toLowerCase();
	    public static final String UPDATE = "Version 1.0";
	    public static final String NAME = "Mumakil Submod";
	    @SidedProxy(serverSide = "mumakil.ServerProxy", clientSide = "mumakil.ClientProxy")
		public static ServerProxy proxy;
	    

     @EventHandler
     public void onInit(FMLInitializationEvent event) {   
         proxy.onInit(event);
         LOTREntities.registerCreature(MumakilEntity.class, "Mumakil", 1004, 16376764, 11772801);
     }
}

