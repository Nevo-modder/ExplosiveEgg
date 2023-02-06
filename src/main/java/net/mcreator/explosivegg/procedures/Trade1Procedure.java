package net.mcreator.explosivegg.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.explosivegg.init.ExplosiveggModItems;

import java.util.concurrent.atomic.AtomicReference;

public class Trade1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
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
			}.getItemStack((int) loopNum, entity)).getItem() == Items.EMERALD) {
				itemNum = ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) loopNum, entity))).getCount();
			} else {
				loopNum = loopNum + 1;
			}
		}
		if (itemNum > 15) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.EMERALD);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 15,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ExplosiveggModItems.SPIKED_BALL_MACE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
