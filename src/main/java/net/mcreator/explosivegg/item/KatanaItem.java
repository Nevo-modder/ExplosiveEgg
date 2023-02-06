
package net.mcreator.explosivegg.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.explosivegg.ExplosiveggModElements;

@ExplosiveggModElements.ModElement.Tag
public class KatanaItem extends ExplosiveggModElements.ModElement {
	@ObjectHolder("explosivegg:katana")
	public static final Item block = null;

	public KatanaItem(ExplosiveggModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 8572;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 16f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, 0f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("katana"));
	}
}
