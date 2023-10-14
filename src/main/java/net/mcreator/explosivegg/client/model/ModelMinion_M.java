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
public class ModelMinion_M<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("explosivegg", "model_minion_m"), "main");
	public final ModelPart head;
	public final ModelPart leg;
	public final ModelPart bb_main;

	public ModelMinion_M(ModelPart root) {
		this.head = root.getChild("head");
		this.leg = root.getChild("leg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -8.0F, -1.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.0F, 1.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition leg = partdefinition.addOrReplaceChild("leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = leg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, 0.25F, -0.25F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 0.0F, 2.7925F, 0.0F, 3.1416F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -25.0F, -0.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(1.0F, -22.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 4)
						.addBox(1.0F, -19.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 16)
						.addBox(1.0F, -16.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 20)
						.addBox(-6.0F, -22.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 24)
						.addBox(-6.0F, -19.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-6.0F, -16.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 18).addBox(-2.0F, -23.0F, -0.5F, 3.0F,
								10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
