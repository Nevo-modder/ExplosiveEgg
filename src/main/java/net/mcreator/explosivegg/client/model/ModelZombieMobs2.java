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

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelZombieMobs2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("explosivegg", "model_zombie_mobs_2"),
			"main");
	public final ModelPart Body;
	public final ModelPart Rleg;
	public final ModelPart Lleg;
	public final ModelPart Helmet;
	public final ModelPart Hands;
	public final ModelPart bb_main;

	public ModelZombieMobs2(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Rleg = root.getChild("Rleg");
		this.Lleg = root.getChild("Lleg");
		this.Helmet = root.getChild("Helmet");
		this.Hands = root.getChild("Hands");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 37).addBox(-4.0F, 0.0F, 2.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
						.addBox(-4.0F, 10.0F, 2.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 26)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
						.addBox(-4.0F, 5.0F, -3.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 27)
						.addBox(1.0F, 0.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 27)
						.addBox(-3.0F, 0.0F, -4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 25)
						.addBox(-1.0F, 3.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, -2.25F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(7.0F, 32.0F, -1.0F, 0.0F, -0.3491F, -0.5236F));
		PartDefinition Body_r1_r1 = Body_r1.addOrReplaceChild("Body_r1_r1",
				CubeListBuilder.create().texOffs(52, 20).addBox(5.5377F, -15.585F, -6.2575F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -8.0F, 1.0F, -0.075F, -0.0279F, 0.0314F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, 32.0F, 0.0F, 0.0F, 0.3927F, 0.3491F));
		PartDefinition Body_r2_r1 = Body_r2.addOrReplaceChild("Body_r2_r1",
				CubeListBuilder.create().texOffs(52, 5).addBox(-5.3411F, -15.3847F, -5.1944F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -8.0F, 0.0F, -0.0762F, 0.0286F, -0.0325F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 28.0F, 6.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition Body_r3_r1 = Body_r3.addOrReplaceChild("Body_r3_r1",
				CubeListBuilder.create().texOffs(0, 60).addBox(-4.0F, -13.0F, 9.85F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -6.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 27.0F, -8.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition Body_r4_r1 = Body_r4.addOrReplaceChild("Body_r4_r1",
				CubeListBuilder.create().texOffs(0, 60).addBox(10.0F, 0.75F, -8.15F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, -18.0F, 8.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(42, 42).addBox(7.0F, -19.75F, -1.95F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.75F, 30.75F, 0.0F, 0.0F, 0.0F, -0.4364F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(32, 41).addBox(5.25F, -20.5F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.0F, 26.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition Rleg = partdefinition.addOrReplaceChild("Rleg",
				CubeListBuilder.create().texOffs(36, 19).addBox(-3.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-2.0F, 10.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 67)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-3.0F, 8.0F, -3.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition Lleg = partdefinition.addOrReplaceChild("Lleg",
				CubeListBuilder.create().texOffs(24, 11).addBox(-2.0F, 8.0F, -3.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 67)
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-1.0F, 10.0F, -3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 27)
						.addBox(-2.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(12, 75)
						.addBox(-4.0F, -8.75F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(4.0F, -8.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-5.0F, -8.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
						.addBox(-4.0F, -8.0F, 4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 37)
						.addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.25F, 0.0F));
		PartDefinition cube_r15 = Helmet.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(2, 24).addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -11.0F, -6.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r16 = Helmet.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(8, 24).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -9.0F, -6.0F, -0.1745F, -0.0436F, 1.0908F));
		PartDefinition cube_r17 = Helmet.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -11.0F, -6.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r18 = Helmet.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(6, 24).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -9.0F, -6.0F, -0.1745F, -0.0436F, -0.9599F));
		PartDefinition cube_r19 = Helmet.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(58, 14).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -6.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r20 = Helmet.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(18, 37).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 5.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r21 = Helmet.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(58, 11).addBox(-1.0F, -1.25F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -5.0F, -5.0F, -1.0036F, 0.0F, -0.1309F));
		PartDefinition cube_r22 = Helmet.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(58, 8).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, -0.9163F, 0.0F, 0.1309F));
		PartDefinition cube_r23 = Helmet.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(6, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r24 = Helmet.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(12, 14).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r26 = Helmet.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r25 = Helmet.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition Hands = partdefinition.addOrReplaceChild("Hands", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Rhand = Hands.addOrReplaceChild("Rhand",
				CubeListBuilder.create().texOffs(52, 13).mirror().addBox(-4.0F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(46, 0).mirror().addBox(-3.0F, 12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(58, 0).mirror().addBox(-3.0F, 9.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 58)
						.mirror().addBox(-3.0F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 14).mirror()
						.addBox(-3.0F, 0.0F, -2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(33, 58).mirror()
						.addBox(-4.0F, 0.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 53).mirror()
						.addBox(-3.0F, 3.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 26)
						.addBox(0.0F, 2.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 51).mirror()
						.addBox(-3.0F, 3.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(57, 57).mirror()
						.addBox(-4.0F, 0.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 14).mirror()
						.addBox(0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 14).mirror()
						.addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 41).mirror()
						.addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 59)
						.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.5F, 1.5F, -1.0612F, -0.1323F, -0.1435F));
		PartDefinition cube_r27 = Rhand
				.addOrReplaceChild(
						"cube_r27", CubeListBuilder.create().texOffs(0, 11).mirror()
								.addBox(0.0F, -2.0F, -1.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(-4.0F, 4.0F, -1.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r28 = Rhand
				.addOrReplaceChild(
						"cube_r28", CubeListBuilder.create().texOffs(24, 51).mirror()
								.addBox(0.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(-4.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r29 = Rhand
				.addOrReplaceChild(
						"cube_r29", CubeListBuilder.create().texOffs(14, 51).mirror()
								.addBox(0.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(-3.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition cube_r30 = Rhand
				.addOrReplaceChild(
						"cube_r30", CubeListBuilder.create().texOffs(56, 34).mirror()
								.addBox(-4.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 6.0F, 3.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r31 = Rhand
				.addOrReplaceChild(
						"cube_r31", CubeListBuilder.create().texOffs(56, 32).mirror()
								.addBox(-4.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 7.0F, 3.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r32 = Rhand
				.addOrReplaceChild(
						"cube_r32", CubeListBuilder.create().texOffs(54, 52).mirror()
								.addBox(-4.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 5.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r33 = Rhand
				.addOrReplaceChild(
						"cube_r33", CubeListBuilder.create().texOffs(0, 32).mirror()
								.addBox(-3.0F, -7.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 6.0F, -6.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition sword = Hands.addOrReplaceChild("sword",
				CubeListBuilder.create().texOffs(0, 92).addBox(-1.0F, 7.0F, -13.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(49, 91)
						.addBox(-1.0F, 7.0F, -28.0F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(5, 95)
						.addBox(-1.0F, 8.0F, -26.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(70, 63)
						.addBox(-1.0F, 7.0F, -30.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 72)
						.addBox(-2.0F, 6.0F, -15.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Lhand = Hands.addOrReplaceChild("Lhand",
				CubeListBuilder.create().texOffs(52, 13).addBox(3.0F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-1.0F, 12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-1.0F, 9.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 58)
						.addBox(-1.0F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 14)
						.addBox(0.0F, 0.0F, -2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 58)
						.addBox(0.0F, 0.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 53)
						.addBox(1.0F, 3.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 51)
						.addBox(1.0F, 3.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 26)
						.addBox(-1.0F, 2.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 57)
						.addBox(0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 14)
						.addBox(-1.0F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
						.addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 41)
						.addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 59).addBox(-1.0F, 0.0F, -2.0F, 4.0F,
								12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, 1.5F, 0.0F, -0.9165F, 0.1451F, 0.3979F));
		PartDefinition cube_r1 = Lhand.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r2 = Lhand.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 51).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 1.0F, -1.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r3 = Lhand.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(14, 51).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, -1.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition cube_r4 = Lhand.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 34).addBox(-1.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 3.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Lhand.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(56, 32).addBox(-1.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 3.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Lhand.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(54, 52).addBox(-1.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Lhand.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -7.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -6.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild(
				"bb_main", CubeListBuilder.create().texOffs(33, 91).addBox(0.0F, -25.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(32, 91).addBox(-4.0F, -25.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Lleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hands.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Hands.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.Lleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
