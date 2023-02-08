package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.Event;

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
			ExplosiveggModVariables.MapVariables.get(world).Time = false;
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			ExplosiveggModVariables.MapVariables.get(world).LTimeSec = 10;
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
