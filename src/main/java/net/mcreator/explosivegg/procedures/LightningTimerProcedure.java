package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class LightningTimerProcedure {
	public static void execute(LevelAccessor world) {
		ExplosiveggModVariables.MapVariables.get(world).LTime = false;
		ExplosiveggModVariables.MapVariables.get(world).syncData(world);
	}
}
