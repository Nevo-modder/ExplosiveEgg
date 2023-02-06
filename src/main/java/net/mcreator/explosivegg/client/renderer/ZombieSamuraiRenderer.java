
package net.mcreator.explosivegg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.explosivegg.entity.ZombieSamuraiEntity;
import net.mcreator.explosivegg.client.model.ModelZombieMobs2;

public class ZombieSamuraiRenderer extends MobRenderer<ZombieSamuraiEntity, ModelZombieMobs2<ZombieSamuraiEntity>> {
	public ZombieSamuraiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelZombieMobs2(context.bakeLayer(ModelZombieMobs2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZombieSamuraiEntity entity) {
		return new ResourceLocation("explosivegg:textures/entities/samuraizombie.png");
	}
}
