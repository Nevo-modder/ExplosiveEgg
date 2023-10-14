package net.mcreator.explosivegg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

public class ProgChangeNumProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ExplosiveggModVariables.MapVariables.get(world).Lightning == false && ExplosiveggModVariables.MapVariables.get(world).Minion == false
				&& ExplosiveggModVariables.MapVariables.get(world).Fire == false) {
			if (ExplosiveggModVariables.MapVariables.get(world).Kills < 231 && ExplosiveggModVariables.MapVariables.get(world).Kills > 211) {
				ExplosiveggModVariables.MapVariables.get(world).prog = 1;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
			} else {
				if (ExplosiveggModVariables.MapVariables.get(world).Kills < 211 && ExplosiveggModVariables.MapVariables.get(world).Kills > 191) {
					ExplosiveggModVariables.MapVariables.get(world).prog = 2;
					ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				} else {
					if (ExplosiveggModVariables.MapVariables.get(world).Kills < 191 && ExplosiveggModVariables.MapVariables.get(world).Kills > 171) {
						ExplosiveggModVariables.MapVariables.get(world).prog = 3;
						ExplosiveggModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (ExplosiveggModVariables.MapVariables.get(world).Kills < 171
								&& ExplosiveggModVariables.MapVariables.get(world).Kills > 151) {
							ExplosiveggModVariables.MapVariables.get(world).prog = 4;
							ExplosiveggModVariables.MapVariables.get(world).syncData(world);
						} else {
							if (ExplosiveggModVariables.MapVariables.get(world).Kills < 151
									&& ExplosiveggModVariables.MapVariables.get(world).Kills > 131) {
								ExplosiveggModVariables.MapVariables.get(world).prog = 5;
								ExplosiveggModVariables.MapVariables.get(world).syncData(world);
							} else {
								if (ExplosiveggModVariables.MapVariables.get(world).Kills < 131
										&& ExplosiveggModVariables.MapVariables.get(world).Kills > 111) {
									ExplosiveggModVariables.MapVariables.get(world).prog = 6;
									ExplosiveggModVariables.MapVariables.get(world).syncData(world);
								} else {
									if (ExplosiveggModVariables.MapVariables.get(world).Kills < 111
											&& ExplosiveggModVariables.MapVariables.get(world).Kills > 91) {
										ExplosiveggModVariables.MapVariables.get(world).prog = 7;
										ExplosiveggModVariables.MapVariables.get(world).syncData(world);
									} else {
										if (ExplosiveggModVariables.MapVariables.get(world).Kills < 91
												&& ExplosiveggModVariables.MapVariables.get(world).Kills > 71) {
											ExplosiveggModVariables.MapVariables.get(world).prog = 8;
											ExplosiveggModVariables.MapVariables.get(world).syncData(world);
										} else {
											if (ExplosiveggModVariables.MapVariables.get(world).Kills < 71
													&& ExplosiveggModVariables.MapVariables.get(world).Kills > 51) {
												ExplosiveggModVariables.MapVariables.get(world).prog = 9;
												ExplosiveggModVariables.MapVariables.get(world).syncData(world);
											} else {
												if (ExplosiveggModVariables.MapVariables.get(world).Kills < 51
														&& ExplosiveggModVariables.MapVariables.get(world).Kills > 31) {
													ExplosiveggModVariables.MapVariables.get(world).prog = 10;
													ExplosiveggModVariables.MapVariables.get(world).syncData(world);
												} else {
													if (ExplosiveggModVariables.MapVariables.get(world).Kills < 31
															&& ExplosiveggModVariables.MapVariables.get(world).Kills > 11) {
														ExplosiveggModVariables.MapVariables.get(world).prog = 11;
														ExplosiveggModVariables.MapVariables.get(world).syncData(world);
													} else {
														if (ExplosiveggModVariables.MapVariables.get(world).Kills < 11
																&& ExplosiveggModVariables.MapVariables.get(world).Kills > 4) {
															ExplosiveggModVariables.MapVariables.get(world).prog = 12;
															ExplosiveggModVariables.MapVariables.get(world).syncData(world);
														} else if (ExplosiveggModVariables.MapVariables.get(world).Kills < 4
																&& ExplosiveggModVariables.MapVariables.get(world).Kills > 2) {
															ExplosiveggModVariables.MapVariables.get(world).prog = 13;
															ExplosiveggModVariables.MapVariables.get(world).syncData(world);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			if (ExplosiveggModVariables.MapVariables.get(world).Lightning == false && ExplosiveggModVariables.MapVariables.get(world).Minion == false
					&& ExplosiveggModVariables.MapVariables.get(world).Fire == true) {
				if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 94
						&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 87) {
					ExplosiveggModVariables.MapVariables.get(world).prog = 1;
					ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				} else {
					if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 87
							&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 80) {
						ExplosiveggModVariables.MapVariables.get(world).prog = 2;
						ExplosiveggModVariables.MapVariables.get(world).syncData(world);
					} else {
						if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 80
								&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 73) {
							ExplosiveggModVariables.MapVariables.get(world).prog = 3;
							ExplosiveggModVariables.MapVariables.get(world).syncData(world);
						} else {
							if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 73
									&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 66) {
								ExplosiveggModVariables.MapVariables.get(world).prog = 4;
								ExplosiveggModVariables.MapVariables.get(world).syncData(world);
							} else {
								if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 66
										&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 59) {
									ExplosiveggModVariables.MapVariables.get(world).prog = 5;
									ExplosiveggModVariables.MapVariables.get(world).syncData(world);
								} else {
									if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 59
											&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 52) {
										ExplosiveggModVariables.MapVariables.get(world).prog = 6;
										ExplosiveggModVariables.MapVariables.get(world).syncData(world);
									} else {
										if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 52
												&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 45) {
											ExplosiveggModVariables.MapVariables.get(world).prog = 7;
											ExplosiveggModVariables.MapVariables.get(world).syncData(world);
										} else {
											if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 45
													&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 38) {
												ExplosiveggModVariables.MapVariables.get(world).prog = 8;
												ExplosiveggModVariables.MapVariables.get(world).syncData(world);
											} else {
												if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 38
														&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 31) {
													ExplosiveggModVariables.MapVariables.get(world).prog = 9;
													ExplosiveggModVariables.MapVariables.get(world).syncData(world);
												} else {
													if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 31
															&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 24) {
														ExplosiveggModVariables.MapVariables.get(world).prog = 10;
														ExplosiveggModVariables.MapVariables.get(world).syncData(world);
													} else {
														if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 24
																&& (entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 17) {
															ExplosiveggModVariables.MapVariables.get(world).prog = 11;
															ExplosiveggModVariables.MapVariables.get(world).syncData(world);
														} else {
															if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 17
																	&& (entity
																			.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 10) {
																ExplosiveggModVariables.MapVariables.get(world).prog = 12;
																ExplosiveggModVariables.MapVariables.get(world).syncData(world);
															} else if ((entity
																	.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse < 10
																	&& (entity
																			.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse > 2) {
																ExplosiveggModVariables.MapVariables.get(world).prog = 13;
																ExplosiveggModVariables.MapVariables.get(world).syncData(world);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				if (ExplosiveggModVariables.MapVariables.get(world).Lightning == true
						&& ExplosiveggModVariables.MapVariables.get(world).Minion == false
						&& ExplosiveggModVariables.MapVariables.get(world).Fire == true) {
					if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 74
							&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 68) {
						ExplosiveggModVariables.MapVariables.get(world).prog = 1;
						ExplosiveggModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 68
								&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 62) {
							ExplosiveggModVariables.MapVariables.get(world).prog = 2;
							ExplosiveggModVariables.MapVariables.get(world).syncData(world);
						} else {
							if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 62
									&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 56) {
								ExplosiveggModVariables.MapVariables.get(world).prog = 3;
								ExplosiveggModVariables.MapVariables.get(world).syncData(world);
							} else {
								if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 56
										&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 50) {
									ExplosiveggModVariables.MapVariables.get(world).prog = 4;
									ExplosiveggModVariables.MapVariables.get(world).syncData(world);
								} else {
									if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 50
											&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 44) {
										ExplosiveggModVariables.MapVariables.get(world).prog = 5;
										ExplosiveggModVariables.MapVariables.get(world).syncData(world);
									} else {
										if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 44
												&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 38) {
											ExplosiveggModVariables.MapVariables.get(world).prog = 6;
											ExplosiveggModVariables.MapVariables.get(world).syncData(world);
										} else {
											if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 38
													&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 32) {
												ExplosiveggModVariables.MapVariables.get(world).prog = 7;
												ExplosiveggModVariables.MapVariables.get(world).syncData(world);
											} else {
												if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 32
														&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 26) {
													ExplosiveggModVariables.MapVariables.get(world).prog = 8;
													ExplosiveggModVariables.MapVariables.get(world).syncData(world);
												} else {
													if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 26
															&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 20) {
														ExplosiveggModVariables.MapVariables.get(world).prog = 9;
														ExplosiveggModVariables.MapVariables.get(world).syncData(world);
													} else {
														if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 20
																&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 14) {
															ExplosiveggModVariables.MapVariables.get(world).prog = 10;
															ExplosiveggModVariables.MapVariables.get(world).syncData(world);
														} else {
															if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 14
																	&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 8) {
																ExplosiveggModVariables.MapVariables.get(world).prog = 11;
																ExplosiveggModVariables.MapVariables.get(world).syncData(world);
															} else {
																if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 8
																		&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 5) {
																	ExplosiveggModVariables.MapVariables.get(world).prog = 12;
																	ExplosiveggModVariables.MapVariables.get(world).syncData(world);
																} else {
																	if (ExplosiveggModVariables.MapVariables.get(world).LightningUse < 5
																			&& ExplosiveggModVariables.MapVariables.get(world).LightningUse > 2) {
																		ExplosiveggModVariables.MapVariables.get(world).prog = 13;
																		ExplosiveggModVariables.MapVariables.get(world).syncData(world);
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
