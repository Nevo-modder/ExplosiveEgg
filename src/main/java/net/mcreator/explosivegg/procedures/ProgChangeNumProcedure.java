package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class ProgChangeNumProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ExplosiveggModVariables.MapVariables.get(world).Lightning == false && ExplosiveggModVariables.MapVariables.get(world).Minion == false
				&& ExplosiveggModVariables.MapVariables.get(world).Fire == false) {
			if (ExplosiveggModVariables.MapVariables.get(world).Kills == 230 || ExplosiveggModVariables.MapVariables.get(world).Kills == 210
					|| ExplosiveggModVariables.MapVariables.get(world).Kills == 190 || ExplosiveggModVariables.MapVariables.get(world).Kills == 170
					|| ExplosiveggModVariables.MapVariables.get(world).Kills == 150 || ExplosiveggModVariables.MapVariables.get(world).Kills == 130
					|| ExplosiveggModVariables.MapVariables.get(world).Kills == 110 || ExplosiveggModVariables.MapVariables.get(world).Kills == 90
					|| ExplosiveggModVariables.MapVariables.get(world).Kills == 70 || ExplosiveggModVariables.MapVariables.get(world).Kills == 50
					|| ExplosiveggModVariables.MapVariables.get(world).Kills == 30 || ExplosiveggModVariables.MapVariables.get(world).Kills == 10
					|| ExplosiveggModVariables.MapVariables.get(world).Kills == 1) {
				ExplosiveggModVariables.MapVariables.get(world).prog = ExplosiveggModVariables.MapVariables.get(world).prog + 1;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			}
		} else {
			if (ExplosiveggModVariables.MapVariables.get(world).Lightning == false && ExplosiveggModVariables.MapVariables.get(world).Minion == false
					&& ExplosiveggModVariables.MapVariables.get(world).Fire == true) {
				if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 93
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 86
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 79
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 72
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 65
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 58
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 51
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 44
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 37
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 30
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 23
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 16
						|| (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 3) {
					ExplosiveggModVariables.MapVariables.get(world).prog = ExplosiveggModVariables.MapVariables.get(world).prog + 1;
					ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
