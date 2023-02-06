
package net.mcreator.explosivegg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.explosivegg.entity.MinionEntity;
import net.mcreator.explosivegg.client.model.ModelMinion_M;

public class MinionRenderer extends MobRenderer<MinionEntity, ModelMinion_M<MinionEntity>> {
	public MinionRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMinion_M(context.bakeLayer(ModelMinion_M.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinionEntity entity) {
		return new ResourceLocation("explosivegg:textures/entities/minion.png");
	}
}
