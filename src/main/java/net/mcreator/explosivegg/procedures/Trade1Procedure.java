package net.mcreator.explosivegg.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.explosivegg.item.SpikedBallMaceItem;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class Trade1Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency entity for procedure Trade1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double loopNum = 0;
		double itemNum = 0;
		loopNum = 0;
		itemNum = 0;
		for (int index0 = 0; index0 < (int) (36); index0++) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) (loopNum), entity)).getItem() == Items.EMERALD) {
				itemNum = (((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) (loopNum), entity))).getCount());
			} else {
				loopNum = (loopNum + 1);
			}
		}
		if (itemNum > 15) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(Items.EMERALD);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 15,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(SpikedBallMaceItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
