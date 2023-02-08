
package net.mcreator.explosivegg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.explosivegg.entity.SkeletonPillager2Entity;
import net.mcreator.explosivegg.client.model.ModelSkeletonPillager_1;

public class SkeletonPillager2Renderer extends MobRenderer<SkeletonPillager2Entity, ModelSkeletonPillager_1<SkeletonPillager2Entity>> {
	public SkeletonPillager2Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelSkeletonPillager_1(context.bakeLayer(ModelSkeletonPillager_1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkeletonPillager2Entity entity) {
		return new ResourceLocation("explosivegg:textures/entities/skeletonpillager5.png");
	}
}
