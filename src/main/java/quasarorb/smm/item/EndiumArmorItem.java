
package quasarorb.smm.item;

import quasarorb.smm.init.SmmModTabs;
import quasarorb.smm.init.SmmModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class EndiumArmorItem extends ArmorItem {
	public EndiumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 70;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{17, 8, 10, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 45;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SmmModItems.ENDIUM.get()));
			}

			@Override
			public String getName() {
				return "endium_armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EndiumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(SmmModTabs.TAB_SMM).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "smm:textures/models/armor/endium_layer_1.png";
		}
	}

	public static class Chestplate extends EndiumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(SmmModTabs.TAB_SMM).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "smm:textures/models/armor/endium_layer_1.png";
		}
	}

	public static class Leggings extends EndiumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(SmmModTabs.TAB_SMM).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "smm:textures/models/armor/endium_layer_2.png";
		}
	}

	public static class Boots extends EndiumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(SmmModTabs.TAB_SMM).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "smm:textures/models/armor/endium_layer_1.png";
		}
	}
}
