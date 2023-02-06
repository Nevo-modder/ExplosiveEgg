
package net.mcreator.explosivegg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.explosivegg.entity.SkeletonPillagerEntity;
import net.mcreator.explosivegg.client.model.ModelSkeletonVindicator3;

public class SkeletonPillagerRenderer extends MobRenderer<SkeletonPillagerEntity, ModelSkeletonVindicator3<SkeletonPillagerEntity>> {
	public SkeletonPillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSkeletonVindicator3(context.bakeLayer(ModelSkeletonVindicator3.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkeletonPillagerEntity entity) {
		return new ResourceLocation("explosivegg:textures/entities/skeletonpillager1.png");
	}
}
