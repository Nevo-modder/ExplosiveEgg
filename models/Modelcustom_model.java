// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 1.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(24, 11).addBox(4.0F, -8.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(0, 24).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(30, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(12, 27).addBox(-4.0F, -7.0F, 5.75F, 8.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.setTextureOffset(12, 11).addBox(6.5F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(12, 14).addBox(5.5F, -3.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
		cube_r3.setTextureOffset(0, 11).addBox(-8.5F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 11).addBox(-6.5F, -3.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1745F, -0.0436F, 0.2182F);
		cube_r4.setTextureOffset(6, 11).addBox(0.5F, -13.5F, -7.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, -0.0436F, -0.2182F);
		cube_r5.setTextureOffset(8, 11).addBox(-2.5F, -13.75F, -7.25F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1745F, -0.0436F, -0.9599F);
		cube_r6.setTextureOffset(2, 15).addBox(5.5F, -8.25F, -7.25F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1745F, -0.0436F, 0.9599F);
		cube_r7.setTextureOffset(0, 15).addBox(-7.25F, -8.0F, -6.75F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 6).addBox(-2.0F, -7.75F, -7.75F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.0036F, 0.0F, 0.1309F);
		cube_r9.setTextureOffset(0, 3).addBox(-4.75F, 0.25F, -7.25F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r10);
		setRotationAngle(cube_r10, -1.0036F, 0.0F, -0.1309F);
		cube_r10.setTextureOffset(0, 0).addBox(0.75F, 0.25F, -7.25F, 4.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}