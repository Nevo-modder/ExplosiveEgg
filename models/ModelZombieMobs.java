// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelZombieMobs extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Body_r7;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r1_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Body_r2_r1;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Body_r3_r1;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Body_r4_r1;
	private final ModelRenderer Body_r5;
	private final ModelRenderer Body_r6;
	private final ModelRenderer Rleg;
	private final ModelRenderer Lleg;
	private final ModelRenderer Helmet;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r25;
	private final ModelRenderer Hands;
	private final ModelRenderer Rhand;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer sword;
	private final ModelRenderer Lhand;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bb_main;

	public ModelZombieMobs() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 37).addBox(-4.0F, 0.0F, 2.0F, 8.0F, 10.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(12, 11).addBox(-4.0F, 10.0F, 2.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(36, 26).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 19).addBox(-4.0F, 5.0F, -3.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(28, 27).addBox(1.0F, 0.0F, -4.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(12, 27).addBox(-3.0F, 0.0F, -4.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(57, 25).addBox(-1.0F, 3.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Body_r7 = new ModelRenderer(this);
		Body_r7.setRotationPoint(0.0F, 24.0F, -2.25F);
		Body.addChild(Body_r7);
		setRotationAngle(Body_r7, -0.0873F, 0.0F, 0.0F);
		Body_r7.setTextureOffset(30, 0).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(7.0F, 32.0F, -1.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, -0.3491F, -0.5236F);

		Body_r1_r1 = new ModelRenderer(this);
		Body_r1_r1.setRotationPoint(-7.0F, -8.0F, 1.0F);
		Body_r1.addChild(Body_r1_r1);
		setRotationAngle(Body_r1_r1, -0.075F, -0.0279F, 0.0314F);
		Body_r1_r1.setTextureOffset(52, 20).addBox(5.5377F, -15.585F, -6.2575F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(-5.0F, 32.0F, 0.0F);
		Body.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 0.3927F, 0.3491F);

		Body_r2_r1 = new ModelRenderer(this);
		Body_r2_r1.setRotationPoint(5.0F, -8.0F, 0.0F);
		Body_r2.addChild(Body_r2_r1);
		setRotationAngle(Body_r2_r1, -0.0762F, 0.0286F, -0.0325F);
		Body_r2_r1.setTextureOffset(52, 5).addBox(-5.3411F, -15.3847F, -5.1944F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(0.0F, 28.0F, 6.0F);
		Body.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.3491F, 0.0F, 0.0F);

		Body_r3_r1 = new ModelRenderer(this);
		Body_r3_r1.setRotationPoint(0.0F, -4.0F, -6.0F);
		Body_r3.addChild(Body_r3_r1);
		setRotationAngle(Body_r3_r1, 0.1309F, 0.0F, 0.0F);
		Body_r3_r1.setTextureOffset(0, 60).addBox(-4.0F, -13.0F, 9.85F, 8.0F, 7.0F, 1.0F, 0.0F, false);

		Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(0.0F, 27.0F, -8.0F);
		Body.addChild(Body_r4);
		setRotationAngle(Body_r4, -0.3054F, 0.0F, 0.0F);

		Body_r4_r1 = new ModelRenderer(this);
		Body_r4_r1.setRotationPoint(-14.0F, -18.0F, 8.0F);
		Body_r4.addChild(Body_r4_r1);
		setRotationAngle(Body_r4_r1, -0.0873F, 0.0F, 0.0F);
		Body_r4_r1.setTextureOffset(0, 60).addBox(10.0F, 0.75F, -8.15F, 8.0F, 7.0F, 1.0F, 0.0F, false);

		Body_r5 = new ModelRenderer(this);
		Body_r5.setRotationPoint(4.75F, 30.75F, 0.0F);
		Body.addChild(Body_r5);
		setRotationAngle(Body_r5, 0.0F, 0.0F, -0.4364F);
		Body_r5.setTextureOffset(42, 42).addBox(7.0F, -19.75F, -1.95F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		Body_r6 = new ModelRenderer(this);
		Body_r6.setRotationPoint(-17.0F, 26.0F, 0.0F);
		Body.addChild(Body_r6);
		setRotationAngle(Body_r6, 0.0F, 0.0F, 0.4363F);
		Body_r6.setTextureOffset(32, 41).addBox(5.25F, -20.5F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		Rleg = new ModelRenderer(this);
		Rleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Rleg.setTextureOffset(36, 19).addBox(-3.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);
		Rleg.setTextureOffset(0, 20).addBox(-2.0F, 10.0F, -3.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Rleg.setTextureOffset(36, 67).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		Rleg.setTextureOffset(30, 0).addBox(-3.0F, 8.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);

		Lleg = new ModelRenderer(this);
		Lleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		Lleg.setTextureOffset(24, 11).addBox(-2.0F, 8.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
		Lleg.setTextureOffset(36, 67).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		Lleg.setTextureOffset(0, 9).addBox(-1.0F, 10.0F, -3.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Lleg.setTextureOffset(12, 27).addBox(-2.0F, 11.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(0.0F, -0.25F, 0.0F);
		Helmet.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		Helmet.setTextureOffset(12, 75).addBox(-4.0F, -8.75F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Helmet.setTextureOffset(24, 24).addBox(4.0F, -8.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
		Helmet.setTextureOffset(0, 24).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);
		Helmet.setTextureOffset(40, 8).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		Helmet.setTextureOffset(36, 37).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(3.0F, -11.0F, -6.0F);
		Helmet.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.2182F);
		cube_r15.setTextureOffset(2, 24).addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(3.0F, -9.0F, -6.0F);
		Helmet.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1745F, -0.0436F, 1.0908F);
		cube_r16.setTextureOffset(8, 24).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-4.0F, -11.0F, -6.0F);
		Helmet.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.2182F);
		cube_r17.setTextureOffset(0, 24).addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.0F, -9.0F, -6.0F);
		Helmet.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.1745F, -0.0436F, -0.9599F);
		cube_r18.setTextureOffset(6, 24).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -8.0F, -6.0F);
		Helmet.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.2182F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(58, 14).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -5.0F, 5.0F);
		Helmet.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(18, 37).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.0F, -5.0F, -5.0F);
		Helmet.addChild(cube_r21);
		setRotationAngle(cube_r21, -1.0036F, 0.0F, -0.1309F);
		cube_r21.setTextureOffset(58, 11).addBox(-1.0F, -1.25F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -5.0F, -5.0F);
		Helmet.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.9163F, 0.0F, 0.1309F);
		cube_r22.setTextureOffset(58, 8).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-5.0F, -5.0F, 0.0F);
		Helmet.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.3491F);
		cube_r23.setTextureOffset(6, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-4.0F, -5.0F, 0.0F);
		Helmet.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.3491F);
		cube_r24.setTextureOffset(12, 14).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(5.0F, -5.0F, 0.0F);
		Helmet.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.3927F);
		cube_r26.setTextureOffset(0, 11).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 3.0F, 10.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(6.0F, -5.0F, 0.0F);
		Helmet.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.3927F);
		cube_r25.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Hands = new ModelRenderer(this);
		Hands.setRotationPoint(-1.0F, 0.0F, 0.0F);
		setRotationAngle(Hands, 0.0873F, 0.0F, 0.0F);

		Rhand = new ModelRenderer(this);
		Rhand.setRotationPoint(-4.0F, 2.5F, 1.5F);
		Hands.addChild(Rhand);
		setRotationAngle(Rhand, -1.0612F, -0.1323F, -0.1435F);
		Rhand.setTextureOffset(52, 13).addBox(-4.0F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, true);
		Rhand.setTextureOffset(46, 0).addBox(-3.0F, 12.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		Rhand.setTextureOffset(58, 0).addBox(-3.0F, 9.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, true);
		Rhand.setTextureOffset(43, 58).addBox(-3.0F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, true);
		Rhand.setTextureOffset(24, 14).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 3.0F, 0.0F, 0.0F, true);
		Rhand.setTextureOffset(33, 58).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, true);
		Rhand.setTextureOffset(20, 53).addBox(-3.0F, 3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Rhand.setTextureOffset(36, 26).addBox(0.0F, 2.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Rhand.setTextureOffset(20, 51).addBox(-3.0F, 3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Rhand.setTextureOffset(57, 57).addBox(-4.0F, 0.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, true);
		Rhand.setTextureOffset(18, 14).addBox(0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Rhand.setTextureOffset(12, 14).addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		Rhand.setTextureOffset(48, 41).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		Rhand.setTextureOffset(20, 59).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-4.0F, 4.0F, -1.0F);
		Rhand.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.3491F);
		cube_r27.setTextureOffset(0, 11).addBox(0.0F, -2.0F, -1.0F, 1.0F, 5.0F, 4.0F, 0.0F, true);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-4.0F, 1.0F, -1.0F);
		Rhand.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.3927F);
		cube_r28.setTextureOffset(24, 51).addBox(0.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, true);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-3.0F, -1.0F, -1.0F);
		Rhand.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.8727F);
		cube_r29.setTextureOffset(14, 51).addBox(0.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, true);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 6.0F, 3.0F);
		Rhand.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.3491F, 0.0F, 0.0F);
		cube_r30.setTextureOffset(56, 34).addBox(-4.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 7.0F, 3.0F);
		Rhand.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.3054F, 0.0F, 0.0F);
		cube_r31.setTextureOffset(56, 32).addBox(-4.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 5.0F, -6.0F);
		Rhand.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.3927F, 0.0F, 0.0F);
		cube_r32.setTextureOffset(54, 52).addBox(-4.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 6.0F, -6.0F);
		Rhand.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.3491F, 0.0F, 0.0F);
		cube_r33.setTextureOffset(0, 32).addBox(-3.0F, -7.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		sword = new ModelRenderer(this);
		sword.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hands.addChild(sword);
		sword.setTextureOffset(0, 92).addBox(-1.0F, 7.0F, -13.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		sword.setTextureOffset(49, 91).addBox(-1.0F, 7.0F, -28.0F, 2.0F, 1.0F, 13.0F, 0.0F, false);
		sword.setTextureOffset(5, 95).addBox(-1.0F, 8.0F, -26.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		sword.setTextureOffset(70, 63).addBox(-1.0F, 7.0F, -30.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		sword.setTextureOffset(1, 72).addBox(-2.0F, 6.0F, -15.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		Lhand = new ModelRenderer(this);
		Lhand.setRotationPoint(5.5F, 1.5F, 0.0F);
		Hands.addChild(Lhand);
		setRotationAngle(Lhand, -0.9165F, 0.1451F, 0.3979F);
		Lhand.setTextureOffset(52, 13).addBox(3.0F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Lhand.setTextureOffset(46, 0).addBox(-1.0F, 12.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Lhand.setTextureOffset(58, 0).addBox(-1.0F, 9.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(43, 58).addBox(-1.0F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(24, 14).addBox(0.0F, 0.0F, -2.0F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		Lhand.setTextureOffset(33, 58).addBox(0.0F, 0.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(20, 53).addBox(1.0F, 3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(20, 51).addBox(1.0F, 3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(36, 26).addBox(-1.0F, 2.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(57, 57).addBox(0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(18, 14).addBox(-1.0F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(12, 14).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Lhand.setTextureOffset(48, 41).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Lhand.setTextureOffset(20, 59).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.0F, 4.0F, -1.0F);
		Lhand.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
		cube_r1.setTextureOffset(0, 11).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, 1.0F, -1.0F);
		Lhand.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.setTextureOffset(24, 51).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.0F, -1.0F, -1.0F);
		Lhand.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8727F);
		cube_r3.setTextureOffset(14, 51).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 6.0F, 3.0F);
		Lhand.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(56, 34).addBox(-1.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 7.0F, 3.0F);
		Lhand.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(56, 32).addBox(-1.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 5.0F, -6.0F);
		Lhand.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(54, 52).addBox(-1.0F, -7.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 6.0F, -6.0F);
		Lhand.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 32).addBox(-1.0F, -7.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(33, 91).addBox(0.0F, -25.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(32, 91).addBox(-4.0F, -25.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Rleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Lleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Helmet.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Hands.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Helmet.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Helmet.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Rleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Lleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}