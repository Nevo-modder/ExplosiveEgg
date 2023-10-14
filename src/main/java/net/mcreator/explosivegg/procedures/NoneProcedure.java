package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class NoneProcedure {
	public static boolean execute(LevelAccessor world) {
		if (ExplosiveggModVariables.MapVariables.get(world).Lightning == true && ExplosiveggModVariables.MapVariables.get(world).Fire == true
				&& ExplosiveggModVariables.MapVariables.get(world).Minion == true) {
			return false;
		}
		return true;
	}
}
