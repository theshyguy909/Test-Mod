package com.dinokiller909.wildbeastsmod.init;

import com.dinokiller909.wildbeastsmod.Main;
import com.dinokiller909.wildbeastsmod.entity.EntityMerry;
import com.dinokiller909.wildbeastsmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
		public static void registerEntities()
		{
				registerEntity("merry", EntityMerry.class, Reference.ENTITY_MERRY, 50, 16777215, 37119);
		}

		private static void registerEntity (String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
		{
				EntityRegistry.registerModEntity(new ResourceLocation (Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
		}
}
