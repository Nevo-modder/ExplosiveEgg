
package net.mcreator.explosivegg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.explosivegg.entity.SkeletonEkoverEntity;
import net.mcreator.explosivegg.client.model.ModelSkeletonEvoker13;

public class SkeletonEkoverRenderer extends MobRenderer<SkeletonEkoverEntity, ModelSkeletonEvoker13<SkeletonEkoverEntity>> {
	public SkeletonEkoverRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSkeletonEvoker13(context.bakeLayer(ModelSkeletonEvoker13.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkeletonEkoverEntity entity) {
		return new ResourceLocation("explosivegg:textures/entities/skeletonevoker.png");
	}
}
