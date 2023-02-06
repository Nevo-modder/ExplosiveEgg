package net.mcreator.explosivegg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.explosivegg.item.HatItem;
import net.mcreator.explosivegg.ExplosiveggModVariables;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.Map;
import java.util.HashMap;

public class PlayeLeaveswProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency world for procedure PlayeLeavesw!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency entity for procedure PlayeLeavesw!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
				.getItem() == HatItem.helmet && ExplosiveggModVariables.MapVariables.get(world).Fire == true) {
			ExplosiveggModVariables.MapVariables.get(world).Time = (false);
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
				.getItem() == HatItem.helmet && ExplosiveggModVariables.MapVariables.get(world).Lightning == true) {
			ExplosiveggModVariables.MapVariables.get(world).LTime = (false);
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
				.getItem() == HatItem.helmet && ExplosiveggModVariables.MapVariables.get(world).Minion == true) {
			ExplosiveggModVariables.MapVariables.get(world).MTime = (false);
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"kill @e[type=explosivegg:minion]");
			}
		}
	}
}
