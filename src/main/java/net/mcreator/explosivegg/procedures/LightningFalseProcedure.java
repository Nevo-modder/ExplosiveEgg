package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class LightningFalseProcedure {
	public static boolean execute(LevelAccessor world) {
		if (ExplosiveggModVariables.MapVariables.get(world).Lightning == false && ExplosiveggModVariables.MapVariables.get(world).Fire == true) {
			return true;
		}
		return false;
	}
}
