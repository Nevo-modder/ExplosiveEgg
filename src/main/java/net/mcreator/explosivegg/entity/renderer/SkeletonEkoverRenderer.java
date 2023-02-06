
package net.mcreator.explosivegg.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.explosivegg.entity.SkeletonEkoverEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SkeletonEkoverRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SkeletonEkoverEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSkeletonEvoker(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("explosivegg:textures/entities/skeletonevoker.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSkeletonEvoker extends EntityModel<Entity> {
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer head;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer bb_main;

		public ModelSkeletonEvoker() {
			textureWidth = 64;
			textureHeight = 64;
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(6.0F, 0.0F, 0.0F);
			leftarm.setTextureOffset(0, 25).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 0.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(11.0F, 0.0F, 0.0F);
			rightarm.addChild(cube_r1);
			setRotationAngle(cube_r1, -3.1416F, 0.0F, 3.1416F);
			cube_r1.setTextureOffset(0, 25).addBox(11.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(24, 17).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 38).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 35).addBox(4.0F, -9.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(8, 33).addBox(-5.0F, -9.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(28, 35).addBox(-5.0F, -9.0F, 4.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(2.0F, 19.0F, 0.0F);
			setRotationAngle(leftleg, 0.0436F, 0.0F, 0.0F);
			leftleg.setTextureOffset(32, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-2.0F, 19.0F, 0.0F);
			setRotationAngle(rightleg, 0.1745F, 0.0F, 0.0F);
			rightleg.setTextureOffset(0, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-5.0F, -24.0F, -3.0F, 10.0F, 19.0F, 6.0F, 0.0F, false);
			bb_main.setTextureOffset(12, 25).addBox(4.0F, -25.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(12, 25).addBox(-8.0F, -25.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
