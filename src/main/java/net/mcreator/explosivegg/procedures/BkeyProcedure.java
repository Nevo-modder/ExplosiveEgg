package net.mcreator.explosivegg.procedures;

import org.checkerframework.checker.units.qual.Time;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;
import net.mcreator.explosivegg.init.ExplosiveggModItems;

public class BkeyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean Time = false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ExplosiveggModItems.HAT_HELMET.get() && ExplosiveggModVariables.MapVariables.get(world).Fire == true) {
			if (ExplosiveggModVariables.MapVariables.get(world).Time == false) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LargeFireball(EntityType.FIREBALL, _level);
					entityToSpawn.moveTo(x, (y + 0.7), z, 0, 1);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				{
					double _setval = (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse - 1;
					entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FireUse = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				ExplosiveggModVariables.MapVariables.get(world).FTimeSec = 0;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				TitleProcedure.execute(world, entity);
				ExplosiveggModVariables.MapVariables.get(world).Time = true;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Can't use it right now, wait to the bar to be full."), (true));
			}
		}
	}
}
