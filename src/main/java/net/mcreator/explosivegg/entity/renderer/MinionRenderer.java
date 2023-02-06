
package net.mcreator.explosivegg.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.explosivegg.entity.MinionEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MinionRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MinionEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMinion(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("explosivegg:textures/entities/minion.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.4.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMinion extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer leg;
		private final ModelRenderer cube_r2;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r3;

		public ModelMinion() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -25.0F, 1.0F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, -3.1416F, 0.0F, 3.1416F);
			cube_r1.setTextureOffset(0, 0).addBox(-4.5F, -8.0F, -1.5F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			leg = new ModelRenderer(this);
			leg.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -14.0F, 0.0F);
			leg.addChild(cube_r2);
			setRotationAngle(cube_r2, 2.7925F, 0.0F, 3.1416F);
			cube_r2.setTextureOffset(0, 21).addBox(-2.0F, 0.25F, -0.25F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r3);
			setRotationAngle(cube_r3, -3.1416F, 0.0F, 3.1416F);
			cube_r3.setTextureOffset(0, 16).addBox(-4.0F, -25.0F, -0.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(24, 0).addBox(1.0F, -22.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r3.setTextureOffset(24, 4).addBox(1.0F, -19.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r3.setTextureOffset(26, 16).addBox(1.0F, -16.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r3.setTextureOffset(29, 20).addBox(-6.0F, -22.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r3.setTextureOffset(29, 24).addBox(-6.0F, -19.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r3.setTextureOffset(27, 29).addBox(-6.0F, -16.0F, 0.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r3.setTextureOffset(17, 18).addBox(-2.0F, -23.0F, -0.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
