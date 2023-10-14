package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class Prog8Procedure {
	public static boolean execute(LevelAccessor world) {
		if (ExplosiveggModVariables.MapVariables.get(world).prog == 8) {
			return true;
		}
		return false;
	}
}
