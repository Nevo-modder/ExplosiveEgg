package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.explosivegg.item.HatItem;
import net.mcreator.explosivegg.ExplosiveggModVariables;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class BkeyProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency world for procedure Bkey!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency x for procedure Bkey!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency y for procedure Bkey!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency z for procedure Bkey!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency entity for procedure Bkey!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean Time = false;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
				.getItem() == HatItem.helmet && ExplosiveggModVariables.MapVariables.get(world).Fire == true) {
			if (ExplosiveggModVariables.MapVariables.get(world).Time == false) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new FireballEntity(EntityType.FIREBALL, (World) world);
					entityToSpawn.setLocationAndAngles(x, (y + 0.7), z, (float) 0, (float) 1);
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				{
					double _setval = ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse + 1);
					entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FireUse = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				ExplosiveggModVariables.MapVariables.get(world).Time = (true);
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				TitleProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;

					public void start(IWorld world, int waitTicks) {
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
						ExplosiveggModVariables.MapVariables.get(world).Time = (false);
						ExplosiveggModVariables.MapVariables.get(world).syncData(world);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 140);
			}
		}
	}
}
