package ma;

import lotr.common.entity.npc.*;
import lotr.common.fac.LOTRFaction;
import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MAEntityMumakil extends LOTREntityWarg {
	public static float HEIGHT = 3.0f;

	public MAEntityMumakil(World world) {
		super(world);
		setSize(3.3f, 9f);
		spawnsInDarkness = false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0);
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (super.attackEntityAsMob(entity)) {
			float attackDamage = (float) getEntityAttribute(LOTREntityNPC.npcAttackDamage).getAttributeValue();
			float knockbackModifier = 0.25f * attackDamage;
			entity.addVelocity(-MathHelper.sin(rotationYaw * 3.1415927f / 180.0f) * knockbackModifier * 0.5f, knockbackModifier * 0.1, MathHelper.cos(rotationYaw * 3.1415927f / 180.0f) * knockbackModifier * 0.5f);
			return true;
		}
		return false;
	}

	@Override
	public boolean canWargBeRidden() {
		return false;
	}

	@Override
	public LOTREntityNPC createWargRider() {
		return null;
	}

	@Override
	protected void func_145780_a(int i, int j, int k, Block block) {
		playSound("lotr:troll.step", 0.75f, getSoundPitch());
	}

	@Override
	public float getAlignmentBonus() {
		return 10.0f;
	}

	@Override
	public String getDeathSound() {
		return "lotr:troll.say";
	}

	@Override
	public LOTRFaction getFaction() {
		return LOTRFaction.NEAR_HARAD;
	}

	@Override
	public String getHurtSound() {
		return "lotr:troll.say";
	}

	@Override
	public String getLivingSound() {
		return "lotr:troll.say";
	}

	@Override
	protected float getSoundVolume() {
		return 1.5f;
	}

	@Override
	public void knockBack(Entity entity, float f, double d, double d1) {
		super.knockBack(entity, f, d, d1);
		motionX /= 4.0;
		motionY /= 4.0;
		motionZ /= 4.0;
	}
}
