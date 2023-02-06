
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.explosivegg.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.explosivegg.network.MinionKeyMessage;
import net.mcreator.explosivegg.network.LightninMessage;
import net.mcreator.explosivegg.network.InvisMessage;
import net.mcreator.explosivegg.network.FireballMessage;
import net.mcreator.explosivegg.ExplosiveggMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ExplosiveggModKeyMappings {
	public static final KeyMapping FIREBALL = new KeyMapping("key.explosivegg.fireball", GLFW.GLFW_KEY_UP, "key.categories.misc");
	public static final KeyMapping INVIS = new KeyMapping("key.explosivegg.invis", GLFW.GLFW_KEY_DOWN, "key.categories.misc");
	public static final KeyMapping LIGHTNIN = new KeyMapping("key.explosivegg.lightnin", GLFW.GLFW_KEY_RIGHT, "key.categories.misc");
	public static final KeyMapping MINION_KEY = new KeyMapping("key.explosivegg.minion_key", GLFW.GLFW_KEY_LEFT, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(FIREBALL);
		ClientRegistry.registerKeyBinding(INVIS);
		ClientRegistry.registerKeyBinding(LIGHTNIN);
		ClientRegistry.registerKeyBinding(MINION_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == FIREBALL.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ExplosiveggMod.PACKET_HANDLER.sendToServer(new FireballMessage(0, 0));
						FireballMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == INVIS.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ExplosiveggMod.PACKET_HANDLER.sendToServer(new InvisMessage(0, 0));
						InvisMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == LIGHTNIN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ExplosiveggMod.PACKET_HANDLER.sendToServer(new LightninMessage(0, 0));
						LightninMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == MINION_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ExplosiveggMod.PACKET_HANDLER.sendToServer(new MinionKeyMessage(0, 0));
						MinionKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
