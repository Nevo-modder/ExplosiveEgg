// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSkeletonPillager3 extends EntityModel<Entity> {
	private final ModelRenderer LEFTHAND;
	private final ModelRenderer RIGHTHAND;
	private final ModelRenderer LEFTLEG;
	private final ModelRenderer RIGHTLEG;
	private final ModelRenderer HEAD;
	private final ModelRenderer bb_main;

	public ModelSkeletonPillager3() {
		textureWidth = 128;
		textureHeight = 128;

		LEFTHAND = new ModelRenderer(this);
		LEFTHAND.setRotationPoint(0.0F, 0.0F, 0.0F);
		LEFTHAND.setTextureOffset(0, 0).addBox(6.0F, 9.0F, -33.0F, 2.0F, 2.0F, 39.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(41, 41).addBox(5.5F, 8.5F, -31.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(55, 41).addBox(5.5F, 8.5F, -37.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(25, 25).addBox(6.5F, 7.0F, -30.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(58, 48).addBox(6.5F, 8.0F, -29.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(56, 32).addBox(6.5F, 6.0F, -29.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(13, 25).addBox(6.5F, 4.0F, -29.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(41, 41).addBox(6.5F, 2.0F, -28.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(0, 0).addBox(6.5F, 0.0F, -27.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(48, 52).addBox(6.5F, 11.0F, -29.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(22, 41).addBox(6.5F, 14.0F, -37.0F, 1.0F, 1.0F, 17.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(43, 18).addBox(6.5F, 18.0F, -32.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(43, 4).addBox(6.5F, 12.0F, -28.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(0, 31).addBox(6.5F, 13.0F, -29.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(0, 41).addBox(6.5F, 15.0F, -39.0F, 1.0F, 1.0F, 20.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(0, 25).addBox(6.5F, 17.0F, -34.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(41, 52).addBox(6.5F, 16.0F, -26.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(13, 25).addBox(6.5F, 16.0F, -36.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(0, 25).addBox(6.5F, 12.0F, -34.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(26, 0).addBox(6.5F, 19.0F, -30.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(13, 31).addBox(6.5F, 13.0F, -36.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(12, 41).addBox(6.5F, 13.0F, -24.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(53, 18).addBox(6.0F, 9.0F, -40.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(43, 18).addBox(6.5F, 9.5F, -43.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(43, 27).addBox(6.5F, 9.5F, 6.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		LEFTHAND.setTextureOffset(0, 41).addBox(5.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		RIGHTHAND = new ModelRenderer(this);
		RIGHTHAND.setRotationPoint(0.0F, 0.0F, 0.0F);
		RIGHTHAND.setTextureOffset(0, 41).addBox(-9.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LEFTLEG = new ModelRenderer(this);
		LEFTLEG.setRotationPoint(0.0F, 19.0F, 0.0F);
		LEFTLEG.setTextureOffset(54, 55).addBox(0.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		RIGHTLEG = new ModelRenderer(this);
		RIGHTLEG.setRotationPoint(0.0F, 19.0F, 0.0F);
		RIGHTLEG.setTextureOffset(57, 23).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		HEAD = new ModelRenderer(this);
		HEAD.setRotationPoint(0.0F, 0.0F, 0.0F);
		HEAD.setTextureOffset(43, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		HEAD.setTextureOffset(25, 25).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -24.0F, -3.0F, 10.0F, 19.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		LEFTHAND.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHTHAND.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHTLEG.render(matrixStack, buffer, packedLight, packedOverlay);
		HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.RIGHTHAND.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.HEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.HEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LEFTHAND.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.LEFTLEG.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RIGHTLEG.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}