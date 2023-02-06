
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.explosivegg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExplosiveggModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("explosivegg", "skeletonpillagerlivingsound"),
				new SoundEvent(new ResourceLocation("explosivegg", "skeletonpillagerlivingsound")));
		REGISTRY.put(new ResourceLocation("explosivegg", "skeletonpillagerhurtsound"),
				new SoundEvent(new ResourceLocation("explosivegg", "skeletonpillagerhurtsound")));
		REGISTRY.put(new ResourceLocation("explosivegg", "skeletonsummon"), new SoundEvent(new ResourceLocation("explosivegg", "skeletonsummon")));
		REGISTRY.put(new ResourceLocation("explosivegg", "lightning"), new SoundEvent(new ResourceLocation("explosivegg", "lightning")));
		REGISTRY.put(new ResourceLocation("explosivegg", "disappear"), new SoundEvent(new ResourceLocation("explosivegg", "disappear")));
		REGISTRY.put(new ResourceLocation("explosivegg", "skeletonevokersound"),
				new SoundEvent(new ResourceLocation("explosivegg", "skeletonevokersound")));
		REGISTRY.put(new ResourceLocation("explosivegg", "skeletonevokerhurt"),
				new SoundEvent(new ResourceLocation("explosivegg", "skeletonevokerhurt")));
		REGISTRY.put(new ResourceLocation("explosivegg", "pillagersound"), new SoundEvent(new ResourceLocation("explosivegg", "pillagersound")));
		REGISTRY.put(new ResourceLocation("explosivegg", "hurt"), new SoundEvent(new ResourceLocation("explosivegg", "hurt")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
