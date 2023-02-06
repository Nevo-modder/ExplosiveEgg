package net.mcreator.explosivegg.procedures;

import org.checkerframework.checker.units.qual.Time;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;
import net.mcreator.explosivegg.init.ExplosiveggModItems;

import java.util.Iterator;

public class LKeyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean Time = false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ExplosiveggModItems.HAT_HELMET.get() && ExplosiveggModVariables.MapVariables.get(world).Lightning == true) {
			if (ExplosiveggModVariables.MapVariables.get(world).LTime == false) {
				ExplosiveggModVariables.MapVariables.get(world).LTimeSec = 0;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				ExplosiveggModVariables.MapVariables.get(world).LTime = true;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + 3, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - 3, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z + 3)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z - 3)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 80) {
					ExplosiveggModVariables.MapVariables.get(world).LightningUse = ExplosiveggModVariables.MapVariables.get(world).LightningUse + 1;
					ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				}
				if (ExplosiveggModVariables.MapVariables.get(world).LightningUse == 60
						|| ExplosiveggModVariables.MapVariables.get(world).LightningUse == 30) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(
								new TextComponent(
										(ExplosiveggModVariables.MapVariables.get(world).LightningUse + "Uses left to get the next ability!")),
								(true));
				}
				if (ExplosiveggModVariables.MapVariables.get(world).LightningUse == 80) {
					ExplosiveggModVariables.MapVariables.get(world).Minion = true;
					ExplosiveggModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("explosivegg:minion_adv"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
				LightningTimerProcedure.execute(world);
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Can't use it right now, wait."), (true));
			}
		}
	}
}
