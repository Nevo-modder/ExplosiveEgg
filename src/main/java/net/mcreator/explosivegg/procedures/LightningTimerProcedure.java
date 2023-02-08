package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class LightningTimerProcedure {
	public static void execute(LevelAccessor world) {
		ExplosiveggModVariables.MapVariables.get(world).LTime = false;
		ExplosiveggModVariables.MapVariables.get(world).syncData(world);
	}
}
