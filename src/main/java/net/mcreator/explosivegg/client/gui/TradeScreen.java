
package net.mcreator.explosivegg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.explosivegg.world.inventory.TradeMenu;
import net.mcreator.explosivegg.network.TradeButtonMessage;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TradeScreen extends AbstractContainerScreen<TradeMenu> {
	private final static HashMap<String, Object> guistate = TradeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TradeScreen(TradeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 147;
		this.imageHeight = 58;
	}

	private static final ResourceLocation texture = new ResourceLocation("explosivegg:textures/screens/trade.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/sa.png"));
		this.blit(ms, this.leftPos + 12, this.topPos + 34, 0, 0, 32, 12, 32, 12);

		RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/ds.png"));
		this.blit(ms, this.leftPos + 44, this.topPos + 34, 0, 0, 32, 12, 32, 12);

		RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/ew.png"));
		this.blit(ms, this.leftPos + 44, this.topPos + 22, 0, 0, 32, 12, 32, 12);

		RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/sadda.png"));
		this.blit(ms, this.leftPos + 12, this.topPos + 22, 0, 0, 32, 12, 32, 12);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Trades", 28, 9, -14942208);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 84, this.topPos + 24, 51, 20, new TextComponent("Trade"), e -> {
			if (true) {
				ExplosiveggMod.PACKET_HANDLER.sendToServer(new TradeButtonMessage(0, x, y, z));
				TradeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
