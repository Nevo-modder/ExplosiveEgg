package net.mcreator.explosivegg.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.explosivegg.ExplosiveggModVariables;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.Map;

public class SkeletonEkoverEntityIsHurtProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency world for procedure SkeletonEkoverEntityIsHurt!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (ExplosiveggModVariables.MapVariables.get(world).evokerattack2 == false) {
			ExplosiveggModVariables.MapVariables.get(world).evokerattack = (true);
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			ExplosiveggModVariables.MapVariables.get(world).evokerattack2 = (true);
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
