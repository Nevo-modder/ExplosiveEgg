
package net.mcreator.explosivegg.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TradeGuiWindow extends ContainerScreen<TradeGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = TradeGui.guistate;

	public TradeGuiWindow(TradeGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 147;
		this.ySize = 58;
	}

	private static final ResourceLocation texture = new ResourceLocation("explosivegg:textures/screens/trade.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("explosivegg:textures/screens/sa.png"));
		this.blit(ms, this.guiLeft + 12, this.guiTop + 34, 0, 0, 32, 12, 32, 12);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("explosivegg:textures/screens/ds.png"));
		this.blit(ms, this.guiLeft + 44, this.guiTop + 34, 0, 0, 32, 12, 32, 12);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("explosivegg:textures/screens/ew.png"));
		this.blit(ms, this.guiLeft + 44, this.guiTop + 22, 0, 0, 32, 12, 32, 12);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("explosivegg:textures/screens/sadda.png"));
		this.blit(ms, this.guiLeft + 12, this.guiTop + 22, 0, 0, 32, 12, 32, 12);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Trades", 28, 9, -14942208);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 84, this.guiTop + 24, 51, 20, new StringTextComponent("Trade"), e -> {
			if (true) {
				ExplosiveggMod.PACKET_HANDLER.sendToServer(new TradeGui.ButtonPressedMessage(0, x, y, z));
				TradeGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
