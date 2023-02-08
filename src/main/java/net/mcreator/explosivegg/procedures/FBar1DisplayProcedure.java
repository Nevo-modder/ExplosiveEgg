package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FBar1DisplayProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if ((ExplosiveggModVariables.MapVariables.get(world).Time == false || ExplosiveggModVariables.MapVariables.get(world).FTimeSec == 6)
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == ExplosiveggModItems.HAT_HELMET.get()) {
			return true;
		}
		return false;
	}
}
