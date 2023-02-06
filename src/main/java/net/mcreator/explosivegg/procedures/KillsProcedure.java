package net.mcreator.explosivegg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.explosivegg.item.HatItem;
import net.mcreator.explosivegg.ExplosiveggModVariables;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collection;

public class KillsProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityDeath(LivingDeathEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency world for procedure Kills!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Kills!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof PlayerEntity) {
			if (ExplosiveggModVariables.MapVariables.get(world).Kills < 2 && ((sourceentity instanceof LivingEntity)
					? ((LivingEntity) sourceentity).getItemStackFromSlot(EquipmentSlotType.HEAD)
					: ItemStack.EMPTY).getItem() == HatItem.helmet && new Object() {
						boolean check(Entity _entity) {
							if (_entity instanceof LivingEntity) {
								Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
								for (EffectInstance effect : effects) {
									if (effect.getPotion() == Effects.INVISIBILITY)
										return true;
								}
							}
							return false;
						}
					}.check(sourceentity)) {
				ExplosiveggModVariables.MapVariables.get(world).Kills = (ExplosiveggModVariables.MapVariables.get(world).Kills + 1);
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(
							new StringTextComponent(((250 - ExplosiveggModVariables.MapVariables.get(world).Kills) + " Kills left")), (true));
				}
			} else if (ExplosiveggModVariables.MapVariables.get(world).Kills == 2 && ((sourceentity instanceof LivingEntity)
					? ((LivingEntity) sourceentity).getItemStackFromSlot(EquipmentSlotType.HEAD)
					: ItemStack.EMPTY).getItem() == HatItem.helmet && new Object() {
						boolean check(Entity _entity) {
							if (_entity instanceof LivingEntity) {
								Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
								for (EffectInstance effect : effects) {
									if (effect.getPotion() == Effects.INVISIBILITY)
										return true;
								}
							}
							return false;
						}
					}.check(sourceentity)) {
				if (sourceentity instanceof ServerPlayerEntity) {
					Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) sourceentity).server).getAdvancementManager()
							.getAdvancement(new ResourceLocation("explosivegg:fire_charge_adv"));
					AdvancementProgress _ap = ((ServerPlayerEntity) sourceentity).getAdvancements().getProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemaningCriteria().iterator();
						while (_iterator.hasNext()) {
							String _criterion = (String) _iterator.next();
							((ServerPlayerEntity) sourceentity).getAdvancements().grantCriterion(_adv, _criterion);
						}
					}
				}
				ExplosiveggModVariables.MapVariables.get(world).Fire = (true);
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
					((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("Use 100 the Fire Charge Ability to get next ability"),
							(true));
				}
			}
		}
	}
}
