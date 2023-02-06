// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer Skirt_r1;
	private final ModelRenderer Skirt;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Lhand;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer Rhand;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public ModelBody() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, 1.3F, 8.0F, 12.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 14).addBox(-4.0F, 1.0F, -3.45F, 8.0F, 9.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(6, 46).addBox(-3.0F, 1.0F, -4.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 46).addBox(1.0F, 1.0F, -4.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 37).addBox(-1.0F, 4.0F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 28).addBox(-4.0F, 0.0F, -3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(6, 25).addBox(2.0F, 0.0F, -3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		Skirt_r1 = new ModelRenderer(this);
		Skirt_r1.setRotationPoint(0.0F, 23.0F, -2.0F);
		body.addChild(Skirt_r1);
		setRotationAngle(Skirt_r1, -0.1309F, 0.0F, 0.0F);
		Skirt_r1.setTextureOffset(6, 36).addBox(-1.0F, -13.0F, -3.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Skirt = new ModelRenderer(this);
		Skirt.setRotationPoint(0.0F, 10.0F, 0.0F);
		body.addChild(Skirt);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -11.0F, 0.0F);
		Skirt.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.3927F, -0.3491F);

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
		cube_r1.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, -0.1147F, -0.042F, 0.0495F);
		cube_r1_r1.setTextureOffset(38, 7).addBox(-11.3413F, -13.2547F, -2.5478F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -11.0F, 0.0F);
		Skirt.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.3927F, 0.3491F);

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
		cube_r2.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -0.1147F, 0.042F, -0.0495F);
		cube_r2_r1.setTextureOffset(36, 28).addBox(6.3413F, -13.2547F, -2.5478F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -11.0F, 0.0F);
		Skirt.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.4363F);
		cube_r3.setTextureOffset(0, 25).addBox(1.0F, 12.6F, -2.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -11.0F, 0.0F);
		Skirt.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
		cube_r4.setTextureOffset(0, 25).addBox(-2.0F, 12.6F, -2.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -11.0F, 0.0F);
		Skirt.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(20, 8).addBox(-4.0F, 11.0F, -2.25F, 8.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -11.0F, 0.0F);
		Skirt.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(20, 8).addBox(-4.0F, 10.0F, 1.25F, 8.0F, 8.0F, 1.0F, 0.0F, false);

		Lhand = new ModelRenderer(this);
		Lhand.setRotationPoint(5.0F, 2.0F, 0.0F);
		Lhand.setTextureOffset(32, 18).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Lhand.setTextureOffset(16, 22).addBox(-1.0F, 10.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Lhand.setTextureOffset(38, 0).addBox(3.0F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Lhand.setTextureOffset(42, 45).addBox(-1.0F, 7.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(32, 45).addBox(-1.0F, 7.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(12, 44).addBox(0.0F, -2.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(0, 25).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(16, 38).addBox(1.0F, 1.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(38, 0).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(12, 44).addBox(0.0F, -2.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(26, 37).addBox(1.0F, 1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(0, 36).addBox(-1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(48, 20).addBox(-1.0F, 7.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-5.0F, 22.0F, 0.0F);
		Lhand.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(44, 2).addBox(4.0F, -22.0F, 11.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.0F, 22.0F, 0.0F);
		Lhand.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(44, 0).addBox(4.0F, -22.15F, 9.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-5.0F, 22.0F, 0.0F);
		Lhand.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 44).addBox(4.0F, -22.25F, -10.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-5.0F, 22.0F, 0.0F);
		Lhand.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(42, 35).addBox(4.0F, -22.0F, -12.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-5.0F, 22.0F, 0.0F);
		Lhand.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
		cube_r11.setTextureOffset(30, 28).addBox(13.9F, -18.3F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-5.0F, 22.0F, 0.0F);
		Lhand.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
		cube_r12.setTextureOffset(36, 33).addBox(15.65F, -19.3F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-5.0F, 22.0F, 0.0F);
		Lhand.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.8727F);
		cube_r13.setTextureOffset(20, 36).addBox(22.9F, -11.3F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		Rhand = new ModelRenderer(this);
		Rhand.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Rhand.setTextureOffset(28, 23).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Rhand.setTextureOffset(20, 17).addBox(-3.0F, 10.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Rhand.setTextureOffset(30, 37).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Rhand.setTextureOffset(20, 17).addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(42, 31).addBox(-3.0F, 7.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(42, 18).addBox(-3.0F, 7.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(12, 44).addBox(-4.0F, -2.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(16, 38).addBox(-3.0F, 1.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(38, 0).addBox(0.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(12, 44).addBox(-4.0F, -2.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(16, 27).addBox(-3.0F, 1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(28, 22).addBox(0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(48, 20).addBox(1.0F, 7.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-8.0F, 22.0F, 0.0F);
		Rhand.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(38, 14).addBox(4.0F, -22.0F, 11.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-8.0F, 22.0F, 0.0F);
		Rhand.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.3054F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(38, 12).addBox(4.0F, -22.15F, 9.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-8.0F, 22.0F, 0.0F);
		Rhand.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(38, 10).addBox(4.0F, -22.25F, -10.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-8.0F, 22.0F, 0.0F);
		Rhand.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(37, 16).addBox(4.0F, -22.0F, -12.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-8.0F, 22.0F, 0.0F);
		Rhand.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.3491F);
		cube_r18.setTextureOffset(30, 28).addBox(-3.1F, -22.55F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-8.0F, 22.0F, 0.0F);
		Rhand.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.3927F);
		cube_r19.setTextureOffset(36, 33).addBox(-4.95F, -24.4F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-8.0F, 22.0F, 0.0F);
		Rhand.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.8727F);
		cube_r20.setTextureOffset(20, 36).addBox(-15.85F, -21.3F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Lhand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Rhand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}