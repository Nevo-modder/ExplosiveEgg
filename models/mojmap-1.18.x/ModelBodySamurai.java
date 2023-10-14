// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBodySamurai<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bodysamurai"), "main");
	private final ModelPart body;
	private final ModelPart Lhand;
	private final ModelPart Rhand;

	public ModelBodySamurai(ModelPart root) {
		this.body = root.getChild("body");
		this.Lhand = root.getChild("Lhand");
		this.Rhand = root.getChild("Rhand");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 0.0F, 1.3F, 8.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-4.0F, 1.0F, -3.45F, 8.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 46)
						.addBox(-3.0F, 1.0F, -4.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(1.0F, 1.0F, -4.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 37)
						.addBox(-1.0F, 4.0F, -4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 28)
						.addBox(-4.0F, 0.0F, -3.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 25)
						.addBox(2.0F, 0.0F, -3.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Skirt_r1 = body.addOrReplaceChild("Skirt_r1",
				CubeListBuilder.create().texOffs(6, 36).addBox(-1.0F, -13.0F, -3.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Skirt = body.addOrReplaceChild("Skirt", CubeListBuilder.create(),
				PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition cube_r1 = Skirt.addOrReplaceChild("cube_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.0F, -0.3927F, -0.3491F));

		PartDefinition cube_r1_r1 = cube_r1.addOrReplaceChild("cube_r1_r1",
				CubeListBuilder.create().texOffs(38, 7).addBox(-11.3413F, -13.2547F, -2.5478F, 5.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.1147F, -0.042F, 0.0495F));

		PartDefinition cube_r2 = Skirt.addOrReplaceChild("cube_r2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.0F, 0.3927F, 0.3491F));

		PartDefinition cube_r2_r1 = cube_r2.addOrReplaceChild("cube_r2_r1",
				CubeListBuilder.create().texOffs(36, 28).addBox(6.3413F, -13.2547F, -2.5478F, 5.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.1147F, 0.042F, -0.0495F));

		PartDefinition cube_r3 = Skirt.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 25).addBox(1.0F, 12.6F, -2.0F, 1.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r4 = Skirt.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 25).addBox(-2.0F, 12.6F, -2.0F, 1.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r5 = Skirt.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(20, 8).addBox(-4.0F, 11.0F, -2.25F, 8.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Skirt.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(20, 8).addBox(-4.0F, 10.0F, 1.25F, 8.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Lhand = partdefinition.addOrReplaceChild("Lhand",
				CubeListBuilder.create().texOffs(32, 18)
						.addBox(-1.0F, -3.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 22)
						.addBox(-1.0F, 10.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(3.0F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 45)
						.addBox(-1.0F, 7.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 45)
						.addBox(-1.0F, 7.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(0.0F, -2.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 38)
						.addBox(1.0F, 1.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-1.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(0.0F, -2.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 37)
						.addBox(1.0F, 1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 20)
						.addBox(-1.0F, 7.0F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r7 = Lhand.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(44, 2).addBox(4.0F, -22.0F, 11.0F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Lhand.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(44, 0).addBox(4.0F, -22.15F, 9.0F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Lhand.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 44).addBox(4.0F, -22.25F, -10.0F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Lhand.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(42, 35).addBox(4.0F, -22.0F, -12.0F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Lhand.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(30, 28).addBox(13.9F, -18.3F, -2.0F, 1.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r12 = Lhand.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(36, 33).addBox(15.65F, -19.3F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r13 = Lhand.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(20, 36).addBox(22.9F, -11.3F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition Rhand = partdefinition.addOrReplaceChild("Rhand",
				CubeListBuilder.create().texOffs(28, 23)
						.addBox(-2.0F, -3.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 17)
						.addBox(-3.0F, 10.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 37)
						.addBox(-4.0F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 17)
						.addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 31)
						.addBox(-3.0F, 7.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 18)
						.addBox(-3.0F, 7.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(-4.0F, -2.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 38)
						.addBox(-3.0F, 1.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(0.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(-4.0F, -2.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 27)
						.addBox(-3.0F, 1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 22)
						.addBox(0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 20)
						.addBox(1.0F, 7.0F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r14 = Rhand.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(38, 14).addBox(4.0F, -22.0F, 11.0F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 22.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Rhand.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(38, 12).addBox(4.0F, -22.15F, 9.0F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 22.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Rhand.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(38, 10).addBox(4.0F, -22.25F, -10.0F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 22.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Rhand.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(37, 16).addBox(4.0F, -22.0F, -12.0F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 22.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Rhand.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(30, 28).addBox(-3.1F, -22.55F, -2.0F, 1.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r19 = Rhand.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(36, 33).addBox(-4.95F, -24.4F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r20 = Rhand.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(20, 36).addBox(-15.85F, -21.3F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Lhand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rhand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}