
package net.mcreator.explosivegg.client.gui;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FBar4Overlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();

			int posX = w / 2;
			int posY = h / 2;

			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;

			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}

			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;

			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);

			if (

			FBar4DisplayProcedure.execute(world)) {

				RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/fbar4.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 180, posY + 68, 0, 0, 32, 64, 32, 64);

			}

			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}

}
