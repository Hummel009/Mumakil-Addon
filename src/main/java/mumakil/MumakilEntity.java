package mumakil;

import lotr.common.entity.npc.LOTREntityNPC;
import lotr.common.entity.npc.LOTREntityWarg;
import lotr.common.fac.LOTRFaction;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MumakilEntity
extends LOTREntityWarg {
    public static float HEIGHT = 3.0f;
    public MumakilEntity(World world) {
        super(world);
        this.setSize(3.3f, 9f);
    	this.spawnsInDarkness = false;
    }
	
    @Override
    public LOTREntityNPC createWargRider() {
		return null;
    }

    @Override
    public LOTRFaction getFaction() {
        return LOTRFaction.NEAR_HARAD;
    }

    @Override
    public float getAlignmentBonus() {
        return 10.0f;
    }
    
    @Override
    public boolean canWargBeRidden() {
        return false;
    }
    
    public void knockBack(Entity entity, float f, double d, double d1) {
        super.knockBack(entity, f, d, d1);
        this.motionX /= 4.0;
        this.motionY /= 4.0;
        this.motionZ /= 4.0;
    }
    
    @Override
    public String getLivingSound() {
        return "lotr:troll.say";
    }
    
    @Override
    public String getHurtSound() {
        return "lotr:troll.say";
    }
    
    @Override
    public String getDeathSound() {
        return "lotr:troll.say";
    }
    
    protected void func_145780_a(int i, int j, int k, Block block) {
        this.playSound("lotr:troll.step", 0.75f, this.getSoundPitch());
    }
    
    @Override
    protected float getSoundVolume() {
        return 1.5f;
    }
    
    @Override
    public boolean attackEntityAsMob(Entity entity) {
        if (super.attackEntityAsMob(entity)) {
            float attackDamage = (float)this.getEntityAttribute(LOTREntityNPC.npcAttackDamage).getAttributeValue();
            float knockbackModifier = 0.25f * attackDamage;
            entity.addVelocity((double)(-MathHelper.sin((float)(this.rotationYaw * 3.1415927f / 180.0f)) * knockbackModifier * 0.5f), (double)knockbackModifier * 0.1, (double)(MathHelper.cos((float)(this.rotationYaw * 3.1415927f / 180.0f)) * knockbackModifier * 0.5f));
            return true;
        }
        return false;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0);
    }
}

