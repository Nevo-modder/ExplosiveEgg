package net.mcreator.explosivegg.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class SkeletonEkoverEntityDiesProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Press TAB to view your tasks!"), (true));
		}
	}
}
