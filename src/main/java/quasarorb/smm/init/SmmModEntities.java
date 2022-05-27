
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package quasarorb.smm.init;

import quasarorb.smm.entity.WizardEntity;
import quasarorb.smm.entity.StickguyEntity;
import quasarorb.smm.entity.GunEntity;
import quasarorb.smm.entity.ActivatedStaffEntity;
import quasarorb.smm.SmmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SmmModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, SmmMod.MODID);
	public static final RegistryObject<EntityType<GunEntity>> GUN = register("projectile_gun",
			EntityType.Builder.<GunEntity>of(GunEntity::new, MobCategory.MISC).setCustomClientFactory(GunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StickguyEntity>> STICKGUY = register("stickguy",
			EntityType.Builder.<StickguyEntity>of(StickguyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(StickguyEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<WizardEntity>> WIZARD = register("wizard",
			EntityType.Builder.<WizardEntity>of(WizardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WizardEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ActivatedStaffEntity>> ACTIVATED_STAFF = register("projectile_activated_staff",
			EntityType.Builder.<ActivatedStaffEntity>of(ActivatedStaffEntity::new, MobCategory.MISC).setCustomClientFactory(ActivatedStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			StickguyEntity.init();
			WizardEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(STICKGUY.get(), StickguyEntity.createAttributes().build());
		event.put(WIZARD.get(), WizardEntity.createAttributes().build());
	}
}
