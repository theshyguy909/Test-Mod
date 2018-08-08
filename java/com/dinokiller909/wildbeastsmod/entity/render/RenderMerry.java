package com.dinokiller909.wildbeastsmod.entity.render;

import com.dinokiller909.wildbeastsmod.entity.EntityMerry;
import com.dinokiller909.wildbeastsmod.entity.model.ModelMerry;
import com.dinokiller909.wildbeastsmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderMerry extends RenderLiving<EntityMerry> 
{
		public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/merry.png");
	
		public RenderMerry (RenderManager manager)
		{
				super (manager, new ModelMerry(), 0.5f);
		}

		@Override
		protected ResourceLocation getEntityTexture(EntityMerry entity)
		{
				return TEXTURES;
		}
	
		@Override
		protected void applyRotations(EntityMerry entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
		{
				super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
		}
}
