
package net.mcreator.explosivegg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.explosivegg.entity.SkeletonVillagerEntity;

public class SkeletonVillagerRenderer extends MobRenderer<SkeletonVillagerEntity, VillagerModel<SkeletonVillagerEntity>> {
	public SkeletonVillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkeletonVillagerEntity entity) {
		return new ResourceLocation("explosivegg:textures/entities/farmer.png");
	}
}
