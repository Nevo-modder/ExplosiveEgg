// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsteve extends EntityModel<Entity> {
	private final ModelRenderer Rleg;
	private final ModelRenderer Lleg;

	public Modelsteve() {
		textureWidth = 64;
		textureHeight = 64;

		Rleg = new ModelRenderer(this);
		Rleg.setRotationPoint(-1.0F, 12.0F, 0.0F);
		Rleg.setTextureOffset(16, 2).addBox(-3.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);
		Rleg.setTextureOffset(0, 1).addBox(-2.0F, 10.0F, -3.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Rleg.setTextureOffset(0, 8).addBox(-3.0F, 8.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);

		Lleg = new ModelRenderer(this);
		Lleg.setRotationPoint(3.0F, 12.0F, 0.0F);
		Lleg.setTextureOffset(0, 0).addBox(-2.0F, 8.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
		Lleg.setTextureOffset(0, 0).addBox(-1.0F, 10.0F, -3.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Lleg.setTextureOffset(0, 16).addBox(-2.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Rleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Lleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}