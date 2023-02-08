package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
							.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse + 1;
					entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FireUse = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				ExplosiveggModVariables.MapVariables.get(world).FTimeSec = 0;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				ExplosiveggModVariables.MapVariables.get(world).Time = true;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						ExplosiveggModVariables.MapVariables.get(world).Time = false;
						ExplosiveggModVariables.MapVariables.get(world).syncData(world);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 120);
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Can't use it right now, wait to the bar to be full."), (true));
			}
		}
	}
}
