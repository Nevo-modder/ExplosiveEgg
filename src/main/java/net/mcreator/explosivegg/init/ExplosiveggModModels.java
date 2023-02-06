
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.explosivegg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.explosivegg.client.model.Modelsamurai4;
import net.mcreator.explosivegg.client.model.Modelring;
import net.mcreator.explosivegg.client.model.ModelSkeletonVindicator3;
import net.mcreator.explosivegg.client.model.ModelSkeletonPillager_1;
import net.mcreator.explosivegg.client.model.ModelMinion_M;
import net.mcreator.explosivegg.client.model.ModelBootsSamurai;
import net.mcreator.explosivegg.client.model.ModelBodySamurai;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ExplosiveggModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSkeletonVindicator3.LAYER_LOCATION, ModelSkeletonVindicator3::createBodyLayer);
		event.registerLayerDefinition(ModelMinion_M.LAYER_LOCATION, ModelMinion_M::createBodyLayer);
		event.registerLayerDefinition(ModelBootsSamurai.LAYER_LOCATION, ModelBootsSamurai::createBodyLayer);
		event.registerLayerDefinition(Modelsamurai4.LAYER_LOCATION, Modelsamurai4::createBodyLayer);
		event.registerLayerDefinition(ModelSkeletonPillager_1.LAYER_LOCATION, ModelSkeletonPillager_1::createBodyLayer);
		event.registerLayerDefinition(ModelBodySamurai.LAYER_LOCATION, ModelBodySamurai::createBodyLayer);
		event.registerLayerDefinition(Modelring.LAYER_LOCATION, Modelring::createBodyLayer);
	}
}
