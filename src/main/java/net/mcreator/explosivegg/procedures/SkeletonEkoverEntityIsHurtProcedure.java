package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class SkeletonEkoverEntityIsHurtProcedure {
	public static void execute(LevelAccessor world) {
		if (ExplosiveggModVariables.MapVariables.get(world).evokerattack2 == false) {
			ExplosiveggModVariables.MapVariables.get(world).evokerattack = true;
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			ExplosiveggModVariables.MapVariables.get(world).evokerattack2 = true;
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
