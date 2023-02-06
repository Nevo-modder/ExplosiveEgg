
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.explosivegg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.explosivegg.entity.ZombieSamuraiEntity;
import net.mcreator.explosivegg.entity.SkeletonVillagerEntity;
import net.mcreator.explosivegg.entity.SkeletonPillagerEntity;
import net.mcreator.explosivegg.entity.SkeletonPillager2Entity;
import net.mcreator.explosivegg.entity.SkeletonEkoverEntity;
import net.mcreator.explosivegg.entity.MinionEntity;
import net.mcreator.explosivegg.entity.FirechargeEntity;
import net.mcreator.explosivegg.ExplosiveggMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExplosiveggModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ExplosiveggMod.MODID);
	public static final RegistryObject<EntityType<SkeletonPillagerEntity>> SKELETON_VINDICATOR = register("skeleton_vindicator",
			EntityType.Builder.<SkeletonPillagerEntity>of(SkeletonPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeletonPillagerEntity::new)

					.sized(1.6f, 1.8f));
	public static final RegistryObject<EntityType<SkeletonEkoverEntity>> SKELETON_EKOVER = register("skeleton_ekover",
			EntityType.Builder.<SkeletonEkoverEntity>of(SkeletonEkoverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeletonEkoverEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FirechargeEntity>> FIRECHARGE = register("projectile_firecharge",
			EntityType.Builder.<FirechargeEntity>of(FirechargeEntity::new, MobCategory.MISC).setCustomClientFactory(FirechargeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SkeletonVillagerEntity>> SKELETON_VILLAGER = register("skeleton_villager",
			EntityType.Builder.<SkeletonVillagerEntity>of(SkeletonVillagerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeletonVillagerEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<ZombieSamuraiEntity>> ZOMBIE_SAMURAI = register("zombie_samurai",
			EntityType.Builder.<ZombieSamuraiEntity>of(ZombieSamuraiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieSamuraiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MinionEntity>> MINION = register("minion",
			EntityType.Builder.<MinionEntity>of(MinionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MinionEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SkeletonPillager2Entity>> SKELETON_PILLAGER_2 = register("skeleton_pillager_2",
			EntityType.Builder.<SkeletonPillager2Entity>of(SkeletonPillager2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeletonPillager2Entity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SkeletonPillagerEntity.init();
			SkeletonEkoverEntity.init();
			SkeletonVillagerEntity.init();
			ZombieSamuraiEntity.init();
			MinionEntity.init();
			SkeletonPillager2Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SKELETON_VINDICATOR.get(), SkeletonPillagerEntity.createAttributes().build());
		event.put(SKELETON_EKOVER.get(), SkeletonEkoverEntity.createAttributes().build());
		event.put(SKELETON_VILLAGER.get(), SkeletonVillagerEntity.createAttributes().build());
		event.put(ZOMBIE_SAMURAI.get(), ZombieSamuraiEntity.createAttributes().build());
		event.put(MINION.get(), MinionEntity.createAttributes().build());
		event.put(SKELETON_PILLAGER_2.get(), SkeletonPillager2Entity.createAttributes().build());
	}
}
