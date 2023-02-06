
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.explosivegg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.explosivegg.item.SpikedBallMaceItem;
import net.mcreator.explosivegg.item.SamuraiHelmetItem;
import net.mcreator.explosivegg.item.LightningItemItem;
import net.mcreator.explosivegg.item.KatanaItem;
import net.mcreator.explosivegg.item.HatItem;
import net.mcreator.explosivegg.item.HalberdItem;
import net.mcreator.explosivegg.item.FirechargeItem;
import net.mcreator.explosivegg.ExplosiveggMod;

public class ExplosiveggModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExplosiveggMod.MODID);
	public static final RegistryObject<Item> SKELETON_VINDICATOR = REGISTRY.register("skeleton_vindicator_spawn_egg",
			() -> new ForgeSpawnEggItem(ExplosiveggModEntities.SKELETON_VINDICATOR, -1, -13434829,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HALBERD = REGISTRY.register("halberd", () -> new HalberdItem());
	public static final RegistryObject<Item> SKELETON_EKOVER = REGISTRY.register("skeleton_ekover_spawn_egg",
			() -> new ForgeSpawnEggItem(ExplosiveggModEntities.SKELETON_EKOVER, -39322, -3355444,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FIRECHARGE = REGISTRY.register("firecharge", () -> new FirechargeItem());
	public static final RegistryObject<Item> SPIKED_BALL_MACE = REGISTRY.register("spiked_ball_mace", () -> new SpikedBallMaceItem());
	public static final RegistryObject<Item> SKELETON_VILLAGER = REGISTRY.register("skeleton_villager_spawn_egg",
			() -> new ForgeSpawnEggItem(ExplosiveggModEntities.SKELETON_VILLAGER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SAMURAI_HELMET_HELMET = REGISTRY.register("samurai_helmet_helmet", () -> new SamuraiHelmetItem.Helmet());
	public static final RegistryObject<Item> SAMURAI_HELMET_CHESTPLATE = REGISTRY.register("samurai_helmet_chestplate",
			() -> new SamuraiHelmetItem.Chestplate());
	public static final RegistryObject<Item> SAMURAI_HELMET_BOOTS = REGISTRY.register("samurai_helmet_boots", () -> new SamuraiHelmetItem.Boots());
	public static final RegistryObject<Item> KATANA = REGISTRY.register("katana", () -> new KatanaItem());
	public static final RegistryObject<Item> ZOMBIE_SAMURAI = REGISTRY.register("zombie_samurai_spawn_egg",
			() -> new ForgeSpawnEggItem(ExplosiveggModEntities.ZOMBIE_SAMURAI, -10092544, -16738048,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LIGHTNING_ITEM = REGISTRY.register("lightning_item", () -> new LightningItemItem());
	public static final RegistryObject<Item> MINION = REGISTRY.register("minion_spawn_egg",
			() -> new ForgeSpawnEggItem(ExplosiveggModEntities.MINION, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BONE_DOOR = doubleBlock(ExplosiveggModBlocks.BONE_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> SKELETON_PILLAGER_2 = REGISTRY.register("skeleton_pillager_2_spawn_egg",
			() -> new ForgeSpawnEggItem(ExplosiveggModEntities.SKELETON_PILLAGER_2, -16751104, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HAT_HELMET = REGISTRY.register("hat_helmet", () -> new HatItem.Helmet());

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
