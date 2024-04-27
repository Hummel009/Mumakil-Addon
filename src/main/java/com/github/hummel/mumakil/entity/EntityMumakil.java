package com.github.hummel.mumakil.entity;

import lotr.common.LOTRAchievement;
import lotr.common.entity.npc.LOTREntityNPC;
import lotr.common.entity.npc.LOTREntityWarg;
import lotr.common.fac.LOTRFaction;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMumakil extends LOTREntityWarg {
	private static final String TROLL_SAY = "lotr:troll.say";

	public EntityMumakil(World world) {
		super(world);
		setSize(2.0f, 5.0f);
		spawnsInDarkness = false;
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
		getEntityAttribute(npcAttackDamage).setBaseValue(7.0);
	}

	@Override
	@SuppressWarnings("NumericCastThatLosesPrecision")
	public boolean attackEntityAsMob(Entity entity) {
		if (super.attackEntityAsMob(entity)) {
			float attackDamage = (float) getEntityAttribute(npcAttackDamage).getAttributeValue();
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
	public void func_145780_a(int i, int j, int k, Block block) {
		playSound("lotr:troll.step", 0.75f, getSoundPitch());
	}

	@Override
	public float getAlignmentBonus() {
		return 10.0f;
	}

	@Override
	public LOTRAchievement getKillAchievement() {
		return null;
	}

	@Override
	public String getDeathSound() {
		return TROLL_SAY;
	}

	@Override
	public LOTRFaction getFaction() {
		return LOTRFaction.NEAR_HARAD;
	}

	@Override
	public String getHurtSound() {
		return TROLL_SAY;
	}

	@Override
	public String getLivingSound() {
		return TROLL_SAY;
	}

	@Override
	public float getSoundVolume() {
		return 2.0f;
	}

	@Override
	public void knockBack(Entity entity, float f, double d, double d1) {
		super.knockBack(entity, f, d, d1);
		motionX /= 4.0;
		motionY /= 4.0;
		motionZ /= 4.0;
	}
}
