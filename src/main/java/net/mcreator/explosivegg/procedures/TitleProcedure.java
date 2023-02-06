package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.explosivegg.ExplosiveggModVariables;
import net.mcreator.explosivegg.ExplosiveggMod;

import java.util.Map;
import java.util.Iterator;

public class TitleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency world for procedure Title!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ExplosiveggMod.LOGGER.warn("Failed to load dependency entity for procedure Title!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
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
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("6s To Fire Again"), (true));
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
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("5s To Fire Again"), (true));
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
								if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
									((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("4s To Fire Again"), (true));
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
										if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
											((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("3s To Fire Again"), (true));
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
												if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
													((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("2s To Fire Again"), (true));
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
														if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
															((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("1s To Fire Again"),
																	(true));
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
																if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
																	((PlayerEntity) entity)
																			.sendStatusMessage(new StringTextComponent("0s To Fire Again"), (true));
																}
																if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 0
																		|| (entity
																				.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null)
																				.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 20
																		|| (entity
																				.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null)
																				.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 40
																		|| (entity
																				.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null)
																				.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 60
																		|| (entity
																				.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null)
																				.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 80
																		|| (entity
																				.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null)
																				.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 99) {
																	if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
																		((PlayerEntity) entity).sendStatusMessage(
																				new StringTextComponent(((100 - (entity.getCapability(
																						ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																						.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse)
																						+ " Uses of fire charge to get next ability!")),
																				(true));
																	}
																} else if ((entity
																		.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 100) {
																	if (entity instanceof ServerPlayerEntity) {
																		Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server)
																				.getAdvancementManager()
																				.getAdvancement(new ResourceLocation("explosivegg:lightning_1"));
																		AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements()
																				.getProgress(_adv);
																		if (!_ap.isDone()) {
																			Iterator _iterator = _ap.getRemaningCriteria().iterator();
																			while (_iterator.hasNext()) {
																				String _criterion = (String) _iterator.next();
																				((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv,
																						_criterion);
																			}
																		}
																	}
																	ExplosiveggModVariables.MapVariables.get(world).Lightning = (true);
																	ExplosiveggModVariables.MapVariables.get(world).syncData(world);
																	if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
																		((PlayerEntity) entity).sendStatusMessage(
																				new StringTextComponent(
																						"Use the lightning 80 times to get the next ability!"),
																				(true));
																	}
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
								}.start(world, (int) 20);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 20);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 20);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 20);
	}
}
