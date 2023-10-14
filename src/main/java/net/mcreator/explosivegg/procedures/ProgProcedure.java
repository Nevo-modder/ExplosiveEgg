package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class ProgProcedure {
	public static boolean execute(LevelAccessor world) {
		if (ExplosiveggModVariables.MapVariables.get(world).prog == 0
				&& (ExplosiveggModVariables.MapVariables.get(world).Fire == true && ExplosiveggModVariables.MapVariables.get(world).Minion == true
						&& ExplosiveggModVariables.MapVariables.get(world).Lightning == true) != true) {
			return true;
		}
		return false;
	}
}
