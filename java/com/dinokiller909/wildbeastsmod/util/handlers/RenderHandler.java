package com.dinokiller909.wildbeastsmod.util.handlers;

import com.dinokiller909.wildbeastsmod.entity.EntityMerry;
import com.dinokiller909.wildbeastsmod.entity.render.RenderMerry;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
		public static void registerEntityRenders()
		{
				RenderingRegistry.registerEntityRenderingHandler(EntityMerry.class, new IRenderFactory<EntityMerry>()
				{
						@Override
						public Render<? super EntityMerry> createRenderFor(RenderManager manager)
						{
								return new RenderMerry(manager);
						}
				});
		}
}
