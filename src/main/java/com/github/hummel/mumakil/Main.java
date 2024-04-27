package com.github.hummel.mumakil;

import com.github.hummel.mumakil.init.Entities;
import com.github.hummel.mumakil.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings({"PublicField", "WeakerAccess"})
@Mod(modid = "mumakil", dependencies = "required-after:lotr", useMetadata = true)
public class Main {
	@SidedProxy(serverSide = "com.github.hummel.mumakil.proxy.ServerProxy", clientSide = "com.github.hummel.mumakil.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	@SuppressWarnings("MethodMayBeStatic")
	public void preInit(FMLPreInitializationEvent event) {
		Entities.preInit();

		proxy.preInit();
	}
}