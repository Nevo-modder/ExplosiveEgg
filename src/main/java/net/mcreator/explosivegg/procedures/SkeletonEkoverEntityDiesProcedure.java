package net.mcreator.explosivegg.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.Map;

public class SkeletonEkoverEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency sourceentity for procedure SkeletonEkoverEntityDies!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof PlayerEntity) {
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity)
						.sendStatusMessage(new StringTextComponent("Kill 250 creatures while invisible to get your next ability!"), (true));
			}
		}
	}
}
