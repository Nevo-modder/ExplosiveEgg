package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;
import net.mcreator.explosivegg.init.ExplosiveggModItems;

public class LBar92DisplayProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (ExplosiveggModVariables.MapVariables.get(world).LTimeSec == 10
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == ExplosiveggModItems.HAT_HELMET.get()) {
			return true;
		}
		return false;
	}
}
