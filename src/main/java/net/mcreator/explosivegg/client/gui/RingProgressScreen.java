
package net.mcreator.explosivegg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.explosivegg.world.inventory.RingProgressMenu;
import net.mcreator.explosivegg.procedures.ProgProcedure;
import net.mcreator.explosivegg.procedures.Prog9Procedure;
import net.mcreator.explosivegg.procedures.Prog8Procedure;
import net.mcreator.explosivegg.procedures.Prog7Procedure;
import net.mcreator.explosivegg.procedures.Prog6Procedure;
import net.mcreator.explosivegg.procedures.Prog5Procedure;
import net.mcreator.explosivegg.procedures.Prog4Procedure;
import net.mcreator.explosivegg.procedures.Prog3Procedure;
import net.mcreator.explosivegg.procedures.Prog2Procedure;
import net.mcreator.explosivegg.procedures.Prog1Procedure;
import net.mcreator.explosivegg.procedures.Prog13Procedure;
import net.mcreator.explosivegg.procedures.Prog12Procedure;
import net.mcreator.explosivegg.procedures.Prog11Procedure;
import net.mcreator.explosivegg.procedures.Prog10Procedure;
import net.mcreator.explosivegg.procedures.NoneProcedure;
import net.mcreator.explosivegg.procedures.None2Procedure;
import net.mcreator.explosivegg.procedures.MinionFalseProcedure;
import net.mcreator.explosivegg.procedures.LightningFalseProcedure;
import net.mcreator.explosivegg.procedures.FireballFalseProcedure;
import net.mcreator.explosivegg.network.ExplosiveggModVariables;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RingProgressScreen extends AbstractContainerScreen<RingProgressMenu> {
	private final static HashMap<String, Object> guistate = RingProgressMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RingProgressScreen(RingProgressMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 257;
		this.imageHeight = 116;
	}

	private static final ResourceLocation texture = new ResourceLocation("explosivegg:textures/screens/ring_progress.png");

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
		if (Prog13Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar.png"));
			this.blit(ms, this.leftPos + 5, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog12Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar1.png"));
			this.blit(ms, this.leftPos + 5, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog11Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar2.png"));
			this.blit(ms, this.leftPos + 5, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog10Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar3.png"));
			this.blit(ms, this.leftPos + 5, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog9Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar4.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog8Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar5.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog7Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar6.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog6Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar7.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog5Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar8.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog4Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar9.png"));
			this.blit(ms, this.leftPos + 5, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog3Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar10.png"));
			this.blit(ms, this.leftPos + 5, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog2Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar11.png"));
			this.blit(ms, this.leftPos + 5, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (Prog1Procedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar12.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
		if (ProgProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("explosivegg:textures/screens/progbar13.png"));
			this.blit(ms, this.leftPos + 5, this.topPos + 23, 0, 0, 220, 32, 220, 32);
		}
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
		if (NoneProcedure.execute(world))
			this.font.draw(poseStack, "Next Ability:", 8, 7, -12829636);
		if (FireballFalseProcedure.execute(world))
			this.font.draw(poseStack, "Fireball", 80, 8, -10092544);
		if (LightningFalseProcedure.execute(world))
			this.font.draw(poseStack, "Lightning", 80, 8, -3342337);
		if (MinionFalseProcedure.execute(world))
			this.font.draw(poseStack, "Minion", 80, 8, -10066330);
		if (NoneProcedure.execute(world))
			this.font.draw(poseStack, "Your current task:", 8, 41, -12829636);
		if (FireballFalseProcedure.execute(world))
			this.font.draw(poseStack, "Kill 250 mobs/creatures while you're invisible", 8, 57, -16777216);
		if (FireballFalseProcedure.execute(world))
			this.font.draw(poseStack, "" + (int) (ExplosiveggModVariables.MapVariables.get(world).Kills) + "", 9, 79, -12829636);
		if (LightningFalseProcedure.execute(world))
			this.font.draw(poseStack, "" + (int) ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse) + "", 8, 79, -12829636);
		if (MinionFalseProcedure.execute(world))
			this.font.draw(poseStack, "" + (ExplosiveggModVariables.MapVariables.get(world).LightningUse) + "", 8, 79, -12829636);
		if (NoneProcedure.execute(world))
			this.font.draw(poseStack, "Left", 30, 79, -12829636);
		if (LightningFalseProcedure.execute(world))
			this.font.draw(poseStack, "Use the fireball ability 100 times", 8, 57, -16777216);
		if (MinionFalseProcedure.execute(world))
			this.font.draw(poseStack, "Use the lightning ability 80 times", 8, 56, -16777216);
		if (None2Procedure.execute(world))
			this.font.draw(poseStack, "You have unlocked all the abilities!", 33, 49, -16777216);
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
	}
}
