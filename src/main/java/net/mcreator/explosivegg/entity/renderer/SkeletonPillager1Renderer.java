
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

import net.mcreator.explosivegg.entity.SkeletonPillager1Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SkeletonPillager1Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SkeletonPillager1Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSkeletonPillager5(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("explosivegg:textures/entities/skeletonpillager5.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSkeletonPillager5 extends EntityModel<Entity> {
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		private final ModelRenderer head;
		private final ModelRenderer bb_main;

		public ModelSkeletonPillager5() {
			textureWidth = 64;
			textureHeight = 64;
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftarm.setTextureOffset(32, 0).addBox(5.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 41).addBox(6.5F, 10.0F, -7.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			leftarm.setTextureOffset(14, 44).addBox(5.5F, 9.0F, -10.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			leftarm.setTextureOffset(29, 1).addBox(6.5F, 8.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(20, 25).addBox(6.5F, 12.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(16, 25).addBox(4.5F, 10.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 25).addBox(6.5F, 10.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(12, 25).addBox(8.5F, 9.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(20, 27).addBox(5.0F, 8.0F, -10.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(26, 2).addBox(5.0F, 12.0F, -10.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(16, 27).addBox(5.25F, 8.0F, -7.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(26, 0).addBox(5.0F, 12.0F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(12, 27).addBox(8.0F, 8.0F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 4).addBox(8.0F, 12.0F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 27).addBox(8.0F, 8.0F, -10.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(26, 4).addBox(8.0F, 12.0F, -10.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
			rightarm.setTextureOffset(32, 0).addBox(-9.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 19.0F, 0.0F);
			rightleg.setTextureOffset(32, 35).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 19.0F, 0.0F);
			leftleg.setTextureOffset(32, 35).addBox(0.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(24, 17).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-5.0F, -24.0F, -3.0F, 10.0F, 19.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
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
