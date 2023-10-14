package net.mcreator.explosivegg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;
import net.mcreator.explosivegg.init.ExplosiveggModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerEntersWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ExplosiveggModItems.HAT_HELMET.get() && ExplosiveggModVariables.MapVariables.get(world).Fire == true) {
			ExplosiveggModVariables.MapVariables.get(world).Time = true;
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			ExplosiveggModVariables.MapVariables.get(world).FTimeSec = 0;
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
					TitleProcedure.execute(world, entity);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ExplosiveggModItems.HAT_HELMET.get() && ExplosiveggModVariables.MapVariables.get(world).Lightning == true) {
			ExplosiveggModVariables.MapVariables.get(world).LTime = true;
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			ExplosiveggModVariables.MapVariables.get(world).LTimeSec = 0;
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
					LightningTimerProcedure.execute(world);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ExplosiveggModItems.HAT_HELMET.get() && ExplosiveggModVariables.MapVariables.get(world).Minion == true) {
			ExplosiveggModVariables.MapVariables.get(world).MTime = true;
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			ExplosiveggModVariables.MapVariables.get(world).MTimer = 0;
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
					MinionTimerProcedure.execute(world);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
		}
	}
}
