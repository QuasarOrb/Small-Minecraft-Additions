
package quasarorb.smm.item;

import quasarorb.smm.init.SmmModTabs;
import quasarorb.smm.init.SmmModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class EndiumPickaxeItem extends PickaxeItem {
	public EndiumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 9000;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SmmModItems.ENDIUM.get()));
			}
		}, 1, -3f, new Item.Properties().tab(SmmModTabs.TAB_SMM).fireResistant());
	}
}
