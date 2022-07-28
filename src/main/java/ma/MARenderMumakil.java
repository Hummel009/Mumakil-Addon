package ma;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;

@SideOnly(value = Side.CLIENT)
public class MARenderMumakil extends RenderLiving {

	public MARenderMumakil() {
		super(new MAModelMumakil(), 0.5f);
		setRenderPassModel(new MAModelMumakil());
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("ma:elephant.png");
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entity, float f) {
		super.preRenderCallback(entity, f);
		float height = MAEntityMumakil.HEIGHT;
		GL11.glScalef(height, height, height);
	}
}