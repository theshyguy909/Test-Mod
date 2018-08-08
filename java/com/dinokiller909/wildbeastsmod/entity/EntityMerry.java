package com.dinokiller909.wildbeastsmod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityMerry extends EntityCow 
{
		public EntityMerry(World worldIn) 
		{
				super(worldIn);
				this.setSize(0.9, 2.8);
		}

		@Override
		public EntityCow createChild(EntityAgeable ageable)
		{
		return new EntityMerry(world);
		}
	
		@Override
		protected SoundEvent getAmbientSound() 
		{
			return super.getAmbientSound();
		}

		@Override
		protected SoundEvent getHurtSound(DamageSource source)
		{
			return super.getHurtSound(source);
		}
	
		@Override
		protected SoundEvent getDeathSound() 
		{
			return super.getDeathSound();
		}
}
