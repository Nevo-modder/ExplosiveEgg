package net.mcreator.explosivegg.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBootsSamurai<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("explosivegg", "model_boots_samurai"),
			"main");
	public final ModelPart Rleg;
	public final ModelPart Lleg;

	public ModelBootsSamurai(ModelPart root) {
		this.Rleg = root.getChild("Rleg");
		this.Lleg = root.getChild("Lleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Rleg = partdefinition.addOrReplaceChild("Rleg",
				CubeListBuilder.create().texOffs(16, 2).addBox(-3.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-2.0F, 10.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-3.0F, 8.0F, -3.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 12.0F, 0.0F));
		PartDefinition Lleg = partdefinition.addOrReplaceChild("Lleg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 8.0F, -3.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 10.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-2.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Rleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Lleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
