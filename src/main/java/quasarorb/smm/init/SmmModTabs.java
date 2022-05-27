
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package quasarorb.smm.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SmmModTabs {
	public static CreativeModeTab TAB_SMM;

	public static void load() {
		TAB_SMM = new CreativeModeTab("tabsmm") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SmmModItems.ENDIUM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
