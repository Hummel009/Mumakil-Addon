package com.github.hummel.mumakil.render;

import com.github.hummel.mumakil.model.ModelMumakil;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderMumakil extends RenderLiving {
	public RenderMumakil() {
		super(new ModelMumakil(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("ma:elephant.png");
	}

	@Override
	public void preRenderCallback(EntityLivingBase entity, float f) {
		super.preRenderCallback(entity, f);
		GL11.glScalef(2.0f, 2.0f, 2.0f);
	}
}