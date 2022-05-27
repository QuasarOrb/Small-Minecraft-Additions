
package quasarorb.smm.item;

import quasarorb.smm.init.SmmModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class EndiumbulletItem extends Item {
	public EndiumbulletItem() {
		super(new Item.Properties().tab(SmmModTabs.TAB_SMM).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
