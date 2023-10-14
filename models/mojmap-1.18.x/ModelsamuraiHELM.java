// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelsamuraiHELM<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "samuraihelm"), "main");
	private final ModelPart Hat;

	public ModelsamuraiHELM(ModelPart root) {
		this.Hat = root.getChild("Hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Hat = partdefinition.addOrReplaceChild("Hat",
				CubeListBuilder.create().texOffs(36, 122)
						.addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 93)
						.addBox(-4.0F, -8.0F, 4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
						.addBox(-5.0F, -8.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 109)
						.addBox(4.0F, -8.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition Head_r1 = Hat.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(0, 85).addBox(-0.25F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r2 = Hat.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(8, 109).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -9.0F, -6.0F, -0.1745F, -0.0436F, 0.9599F));

		PartDefinition Head_r3 = Hat.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(2, 109).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -11.0F, -6.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r4 = Hat.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(6, 109).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -9.0F, -6.0F, -0.1745F, -0.0436F, -0.9599F));

		PartDefinition Head_r5 = Hat.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(58, 99).addBox(-2.0F, -1.0F, -0.25F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -6.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Hat.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(0, 109).addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -11.0F, -6.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r7 = Hat
				.addOrReplaceChild("Head_r7",
						CubeListBuilder.create().texOffs(12, 99).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 3.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.384F));

		PartDefinition Head_r8 = Hat.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(58, 93).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, -0.9948F, 0.0F, 0.1309F));

		PartDefinition Head_r9 = Hat
				.addOrReplaceChild("Head_r9",
						CubeListBuilder.create().texOffs(0, 96).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 3.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.384F));

		PartDefinition Head_r10 = Hat.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(58, 96).addBox(0.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, -0.9948F, 0.0F, -0.1309F));

		PartDefinition Head_r11 = Hat
				.addOrReplaceChild("Head_r11",
						CubeListBuilder.create().texOffs(18, 122).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 5.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -5.0F, 5.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Hat.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(6, 85).addBox(-2.75F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Hat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}