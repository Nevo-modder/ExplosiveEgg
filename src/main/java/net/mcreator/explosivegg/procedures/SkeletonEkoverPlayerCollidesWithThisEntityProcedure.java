package net.mcreator.explosivegg.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.explosivegg.ExplosiveggModVariables;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.AbstractMap;

public class SkeletonEkoverPlayerCollidesWithThisEntityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency world for procedure SkeletonEkoverPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency x for procedure SkeletonEkoverPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency y for procedure SkeletonEkoverPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency z for procedure SkeletonEkoverPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency entity for procedure SkeletonEkoverPlayerCollidesWithThisEntity!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (ExplosiveggModVariables.MapVariables.get(world).evokerattack == true) {
			ExplosiveggModVariables.MapVariables.get(world).evokerattack = (false);
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("explosivegg:skeletonsummon")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("explosivegg:skeletonsummon")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.DRAGON_BREATH, x, y, z, (int) 200, 3, 3, 3, 1);
			}
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EXPLOSION, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, (x + 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, (x - 1), (y + 1), z, 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, x, (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.WITCH, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.INSTANT_EFFECT, x, (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x + 1), (y + 1), (z - 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			world.addParticle(ParticleTypes.EFFECT, (x - 1), (y + 1), (z + 1), 0, 1, 0);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
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
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new WitherSkeletonEntity(EntityType.WITHER_SKELETON, (World) world);
						entityToSpawn.setLocationAndAngles((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SkeletonEntity(EntityType.SKELETON, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
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
							ExplosiveggModVariables.MapVariables.get(world).evokerattack = (true);
							ExplosiveggModVariables.MapVariables.get(world).syncData(world);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 100);
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos(x, y, z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("explosivegg:lightning")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("explosivegg:lightning")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT, x, (y + 1), z, (int) 300, 3, 3, 3, 1);
							}
							new Object() {
								private int ticks = 0;
								private float waitTicks;
								private IWorld world;

								public void start(IWorld world, int waitTicks) {
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

									LightningProcedure.executeProcedure(Stream
											.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
													new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
											.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private IWorld world;

										public void start(IWorld world, int waitTicks) {
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
											if (world instanceof World && !world.isRemote()) {
												((World) world).playSound(null, new BlockPos(x, y, z),
														(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																.getValue(new ResourceLocation("explosivegg:disappear")),
														SoundCategory.NEUTRAL, (float) 1, (float) 1);
											} else {
												((World) world).playSound(x, y, z,
														(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																.getValue(new ResourceLocation("explosivegg:disappear")),
														SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
											}
											if (world instanceof ServerWorld) {
												((ServerWorld) world).spawnParticle(ParticleTypes.CLOUD, x, (y + 1), z, (int) 300, 3, 3, 3, 1);
											}
											if (entity instanceof LivingEntity)
												((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 90, (int) 1));
											{
												Entity _ent = entity;
												_ent.setPositionAndUpdate((x + 3), (y + 8), (z + 2));
												if (_ent instanceof ServerPlayerEntity) {
													((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 3), (y + 8), (z + 2),
															_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
												}
											}
											new Object() {
												private int ticks = 0;
												private float waitTicks;
												private IWorld world;

												public void start(IWorld world, int waitTicks) {
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
													if (world instanceof ServerWorld) {
														Entity entityToSpawn = new PotionEntity(EntityType.POTION, (World) world);
														entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
														if (entityToSpawn instanceof MobEntity)
															((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																	world.getDifficultyForLocation(entityToSpawn.getPosition()),
																	SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
														world.addEntity(entityToSpawn);
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 20);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 20);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 20);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 100);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 20);
		}
	}
}
