package net.mcreator.explosivegg.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelSkeletonVindicator3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("explosivegg", "model_skeleton_vindicator_3"),
			"main");
	public final ModelPart LEFTHAND;
	public final ModelPart RIGHTHAND;
	public final ModelPart LEFTLEG;
	public final ModelPart RIGHTLEG;
	public final ModelPart HEAD;
	public final ModelPart bb_main;

	public ModelSkeletonVindicator3(ModelPart root) {
		this.LEFTHAND = root.getChild("LEFTHAND");
		this.RIGHTHAND = root.getChild("RIGHTHAND");
		this.LEFTLEG = root.getChild("LEFTLEG");
		this.RIGHTLEG = root.getChild("RIGHTLEG");
		this.HEAD = root.getChild("HEAD");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LEFTHAND = partdefinition.addOrReplaceChild("LEFTHAND",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.0F, 9.0F, -33.0F, 2.0F, 2.0F, 39.0F, new CubeDeformation(0.0F)).texOffs(41, 41)
						.addBox(5.5F, 8.5F, -31.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(55, 41)
						.addBox(5.5F, 8.5F, -37.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 25)
						.addBox(6.5F, 7.0F, -30.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 48)
						.addBox(6.5F, 8.0F, -29.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 32)
						.addBox(6.5F, 6.0F, -29.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(13, 25)
						.addBox(6.5F, 4.0F, -29.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 41)
						.addBox(6.5F, 2.0F, -28.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.5F, 0.0F, -27.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 52)
						.addBox(6.5F, 11.0F, -29.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 41)
						.addBox(6.5F, 14.0F, -37.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(6.5F, 18.0F, -32.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(43, 4)
						.addBox(6.5F, 12.0F, -28.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(6.5F, 13.0F, -29.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(6.5F, 15.0F, -39.0F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(6.5F, 17.0F, -34.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(41, 52)
						.addBox(6.5F, 16.0F, -26.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(13, 25)
						.addBox(6.5F, 16.0F, -36.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(6.5F, 12.0F, -34.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(6.5F, 19.0F, -30.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(13, 31)
						.addBox(6.5F, 13.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 41)
						.addBox(6.5F, 13.0F, -24.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 18)
						.addBox(6.0F, 9.0F, -40.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(6.5F, 9.5F, -43.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 27)
						.addBox(6.5F, 9.5F, 6.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(5.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RIGHTHAND = partdefinition.addOrReplaceChild("RIGHTHAND",
				CubeListBuilder.create().texOffs(0, 41).addBox(-9.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LEFTLEG = partdefinition.addOrReplaceChild("LEFTLEG",
				CubeListBuilder.create().texOffs(54, 55).addBox(0.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition RIGHTLEG = partdefinition.addOrReplaceChild("RIGHTLEG",
				CubeListBuilder.create().texOffs(57, 23).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition HEAD = partdefinition
				.addOrReplaceChild("HEAD",
						CubeListBuilder.create().texOffs(43, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(25, 25).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -24.0F, -3.0F, 10.0F, 19.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		LEFTHAND.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RIGHTHAND.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LEFTLEG.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RIGHTLEG.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HEAD.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RIGHTHAND.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.HEAD.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.HEAD.xRot = headPitch / (180F / (float) Math.PI);
		this.LEFTHAND.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.LEFTLEG.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RIGHTLEG.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
