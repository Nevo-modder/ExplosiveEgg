package net.mcreator.explosivegg.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class SkeletonEkoverPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (ExplosiveggModVariables.MapVariables.get(world).evokerattack == true) {
			ExplosiveggModVariables.MapVariables.get(world).evokerattack = false;
			ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("explosivegg:skeletonsummon")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("explosivegg:skeletonsummon")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 200, 3, 3, 3, 1);
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
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
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
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new WitherSkeleton(EntityType.WITHER_SKELETON, _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Skeleton(EntityType.SKELETON, _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
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
							ExplosiveggModVariables.MapVariables.get(world).evokerattack = true;
							ExplosiveggModVariables.MapVariables.get(world).syncData(world);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 100);
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("explosivegg:lightning")), SoundSource.NEUTRAL,
											1, 1);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("explosivegg:lightning")), SoundSource.NEUTRAL,
											1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EFFECT, x, (y + 1), z, 300, 3, 3, 3, 1);
							new Object() {
								private int ticks = 0;
								private float waitTicks;
								private LevelAccessor world;

								public void start(LevelAccessor world, int waitTicks) {
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
									LightningProcedure.execute(world, x, y, z);
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private LevelAccessor world;

										public void start(LevelAccessor world, int waitTicks) {
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
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, new BlockPos(x, y, z),
															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("explosivegg:disappear")),
															SoundSource.NEUTRAL, 1, 1);
												} else {
													_level.playLocalSound(x, y, z,
															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("explosivegg:disappear")),
															SoundSource.NEUTRAL, 1, 1, false);
												}
											}
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.CLOUD, x, (y + 1), z, 300, 3, 3, 3, 1);
											if (entity instanceof LivingEntity _entity)
												_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 90, 1));
											{
												Entity _ent = entity;
												_ent.teleportTo((x + 3), (y + 8), (z + 2));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport((x + 3), (y + 8), (z + 2), _ent.getYRot(), _ent.getXRot());
											}
											new Object() {
												private int ticks = 0;
												private float waitTicks;
												private LevelAccessor world;

												public void start(LevelAccessor world, int waitTicks) {
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
													if (world instanceof ServerLevel _level) {
														Entity entityToSpawn = new ThrownPotion(EntityType.POTION, _level);
														entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
														if (entityToSpawn instanceof Mob _mobToSpawn)
															_mobToSpawn.finalizeSpawn(_level,
																	world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
																	MobSpawnType.MOB_SUMMONED, null, null);
														world.addFreshEntity(entityToSpawn);
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 20);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 20);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 20);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 100);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
		}
	}
}
