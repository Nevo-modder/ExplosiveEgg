package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FBar6DisplayProcedure {
	public static boolean execute(LevelAccessor world) {
		if (ExplosiveggModVariables.MapVariables.get(world).FTimeSec == 0) {
			return true;
		}
		return false;
	}
}
