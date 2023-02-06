
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.explosivegg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.explosivegg.client.renderer.ZombieSamuraiRenderer;
import net.mcreator.explosivegg.client.renderer.SkeletonVillagerRenderer;
import net.mcreator.explosivegg.client.renderer.SkeletonPillagerRenderer;
import net.mcreator.explosivegg.client.renderer.SkeletonPillager2Renderer;
import net.mcreator.explosivegg.client.renderer.SkeletonEkoverRenderer;
import net.mcreator.explosivegg.client.renderer.MinionRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExplosiveggModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ExplosiveggModEntities.SKELETON_VINDICATOR.get(), SkeletonPillagerRenderer::new);
		event.registerEntityRenderer(ExplosiveggModEntities.SKELETON_EKOVER.get(), SkeletonEkoverRenderer::new);
		event.registerEntityRenderer(ExplosiveggModEntities.FIRECHARGE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ExplosiveggModEntities.SKELETON_VILLAGER.get(), SkeletonVillagerRenderer::new);
		event.registerEntityRenderer(ExplosiveggModEntities.ZOMBIE_SAMURAI.get(), ZombieSamuraiRenderer::new);
		event.registerEntityRenderer(ExplosiveggModEntities.MINION.get(), MinionRenderer::new);
		event.registerEntityRenderer(ExplosiveggModEntities.SKELETON_PILLAGER_2.get(), SkeletonPillager2Renderer::new);
	}
}
