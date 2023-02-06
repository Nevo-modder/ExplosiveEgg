// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSkirt extends EntityModel<Entity> {
	private final ModelRenderer Skirt;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public ModelSkirt() {
		textureWidth = 32;
		textureHeight = 32;

		Skirt = new ModelRenderer(this);
		Skirt.setRotationPoint(0.0F, 12.0F, 0.0F);
		Skirt.setTextureOffset(6, 16).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -12.0F, 0.0F);
		Skirt.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.3927F, -0.3491F);
		cube_r1.setTextureOffset(18, 0).addBox(-10.5F, 10.5F, -0.75F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -12.0F, 0.0F);
		Skirt.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.3927F, 0.3491F);
		cube_r2.setTextureOffset(18, 3).addBox(5.5F, 10.5F, -0.75F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -12.0F, 0.0F);
		Skirt.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.4363F);
		cube_r3.setTextureOffset(14, 12).addBox(1.0F, 12.6F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -12.0F, 0.0F);
		Skirt.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
		cube_r4.setTextureOffset(0, 16).addBox(-2.0F, 12.6F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -12.0F, 0.0F);
		Skirt.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-4.0F, 12.0F, -2.25F, 8.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -12.0F, 0.0F);
		Skirt.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 8).addBox(-4.0F, 12.0F, 1.25F, 8.0F, 7.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Skirt.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}