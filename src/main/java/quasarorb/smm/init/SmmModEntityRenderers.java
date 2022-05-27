
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package quasarorb.smm.init;

import quasarorb.smm.client.renderer.WizardRenderer;
import quasarorb.smm.client.renderer.StickguyRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SmmModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SmmModEntities.GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SmmModEntities.STICKGUY.get(), StickguyRenderer::new);
		event.registerEntityRenderer(SmmModEntities.WIZARD.get(), WizardRenderer::new);
		event.registerEntityRenderer(SmmModEntities.ACTIVATED_STAFF.get(), ThrownItemRenderer::new);
	}
}
