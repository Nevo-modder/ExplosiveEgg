package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class LBar92DisplayProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (ExplosiveggModVariables.MapVariables.get(world).LTime == false
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == ExplosiveggModItems.HAT_HELMET.get()
				&& ExplosiveggModVariables.MapVariables.get(world).Lightning == true) {
			return true;
		}
		return false;
	}
}
