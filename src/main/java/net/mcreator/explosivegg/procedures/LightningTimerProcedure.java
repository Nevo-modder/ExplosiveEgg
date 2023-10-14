package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class LightningTimerProcedure {
	public static void execute(LevelAccessor world) {
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
				ExplosiveggModVariables.MapVariables.get(world).LTimeSec = ExplosiveggModVariables.MapVariables.get(world).LTimeSec + 1;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
						ExplosiveggModVariables.MapVariables.get(world).LTimeSec = ExplosiveggModVariables.MapVariables.get(world).LTimeSec + 1;
						ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
								ExplosiveggModVariables.MapVariables.get(world).LTimeSec = ExplosiveggModVariables.MapVariables.get(world).LTimeSec
										+ 1;
								ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
										ExplosiveggModVariables.MapVariables
												.get(world).LTimeSec = ExplosiveggModVariables.MapVariables.get(world).LTimeSec + 1;
										ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
												ExplosiveggModVariables.MapVariables
														.get(world).LTimeSec = ExplosiveggModVariables.MapVariables.get(world).LTimeSec + 1;
												ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
														ExplosiveggModVariables.MapVariables
																.get(world).LTimeSec = ExplosiveggModVariables.MapVariables.get(world).LTimeSec + 1;
														ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
																ExplosiveggModVariables.MapVariables.get(
																		world).LTimeSec = ExplosiveggModVariables.MapVariables.get(world).LTimeSec
																				+ 1;
																ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
																		ExplosiveggModVariables.MapVariables
																				.get(world).LTimeSec = ExplosiveggModVariables.MapVariables
																						.get(world).LTimeSec + 1;
																		ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
																				ExplosiveggModVariables.MapVariables
																						.get(world).LTimeSec = ExplosiveggModVariables.MapVariables
																								.get(world).LTimeSec + 1;
																				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
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
																						ExplosiveggModVariables.MapVariables.get(world).LTime = false;
																						ExplosiveggModVariables.MapVariables.get(world)
																								.syncData(world);
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
														}.start(world, 20);
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
						}.start(world, 20);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 20);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 20);
	}
}
