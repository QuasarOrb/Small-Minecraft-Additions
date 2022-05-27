
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package quasarorb.smm.init;

import quasarorb.smm.SmmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class SmmModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SmmMod.MODID);
	public static final RegistryObject<Potion> TEMPHEARTS = REGISTRY.register("temphearts",
			() -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3623, 5, false, false)));
}
