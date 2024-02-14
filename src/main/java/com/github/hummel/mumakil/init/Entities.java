package com.github.hummel.mumakil.init;

import com.github.hummel.mumakil.entity.EntityMumakil;
import lotr.common.entity.LOTREntities;

public class Entities {
	private Entities() {
	}

	public static void preInit() {
		LOTREntities.registerCreature(EntityMumakil.class, "Mumakil", 1004, 16376764, 11772801);
	}
}