package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.explosivegg.item.HatItem;
import net.mcreator.explosivegg.ExplosiveggModVariables;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.Map;
import java.util.Iterator;

public class LKeyProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency world for procedure LKey!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency x for procedure LKey!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency y for procedure LKey!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency z for procedure LKey!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency entity for procedure LKey!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean Time = false;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
				.getItem() == HatItem.helmet && ExplosiveggModVariables.MapVariables.get(world).Lightning == true) {
			if (ExplosiveggModVariables.MapVariables.get(world).LTime == false) {
				ExplosiveggModVariables.MapVariables.get(world).LTime = (true);
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x + 3, y, z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x - 3, y, z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, y, z + 3)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, y, z - 3)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 80) {
					ExplosiveggModVariables.MapVariables.get(world).LightningUse = (ExplosiveggModVariables.MapVariables.get(world).LightningUse + 1);
					ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				}
				if (ExplosiveggModVariables.MapVariables.get(world).LightningUse == 60
						|| ExplosiveggModVariables.MapVariables.get(world).LightningUse == 30) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
								(ExplosiveggModVariables.MapVariables.get(world).LightningUse + "Uses left to get next ability!")), (true));
					}
				}
				if (ExplosiveggModVariables.MapVariables.get(world).LightningUse == 80) {
					ExplosiveggModVariables.MapVariables.get(world).Minion = (true);
					ExplosiveggModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof ServerPlayerEntity) {
						Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
								.getAdvancement(new ResourceLocation("explosivegg:minion_adv"));
						AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemaningCriteria().iterator();
							while (_iterator.hasNext()) {
								String _criterion = (String) _iterator.next();
								((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
							}
						}
					}
				}
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
						ExplosiveggModVariables.MapVariables.get(world).LTime = (false);
						ExplosiveggModVariables.MapVariables.get(world).syncData(world);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 200);
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Can't use it right now, wait."), (true));
				}
			}
		}
	}
}
