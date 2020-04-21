package mumakil;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(value=Side.CLIENT)
public class MumakilRender
extends RenderLiving {

    public MumakilRender() {
        super((ModelBase)new MumakilModel(), 0.5f);
        this.setRenderPassModel((ModelBase)new MumakilModel());
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return new ResourceLocation("mumakil:elephant.png");
    }
    
    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f) {
        super.preRenderCallback(entity, f);
        float height = MumakilEntity.HEIGHT;
        GL11.glScalef(height, height, height);
    }
}