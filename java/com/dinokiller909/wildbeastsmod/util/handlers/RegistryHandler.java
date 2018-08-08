package com.dinokiller909.wildbeastsmod.util.handlers;

import com.dinokiller909.wildbeastsmod.init.EntityInit;

public class RegistryHandler {

		public static void preInitRegistries()
		{
				EntityInit.registerEntities();
				RenderHandler.registerEntityRenders();
		}
}
