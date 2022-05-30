
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package quasarorb.smm.init;

import quasarorb.smm.item.WizardSummonerItem;
import quasarorb.smm.item.StaffItem;
import quasarorb.smm.item.ISeeADreamerItem;
import quasarorb.smm.item.GunItem;
import quasarorb.smm.item.EndiumbulletItem;
import quasarorb.smm.item.EndiumSwordItem;
import quasarorb.smm.item.EndiumShovelItem;
import quasarorb.smm.item.EndiumPickaxeItem;
import quasarorb.smm.item.EndiumItem;
import quasarorb.smm.item.EndiumHoeItem;
import quasarorb.smm.item.EndiumAxeItem;
import quasarorb.smm.item.EndiumArmorItem;
import quasarorb.smm.item.ActivatedStaffItem;
import quasarorb.smm.SmmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class SmmModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SmmMod.MODID);
	public static final RegistryObject<Item> ENDIUM = REGISTRY.register("endium", () -> new EndiumItem());
	public static final RegistryObject<Item> ENDIUM_ORE = block(SmmModBlocks.ENDIUM_ORE, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDIUM_BLOCK = block(SmmModBlocks.ENDIUM_BLOCK, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDIUM_PICKAXE = REGISTRY.register("endium_pickaxe", () -> new EndiumPickaxeItem());
	public static final RegistryObject<Item> ENDIUM_AXE = REGISTRY.register("endium_axe", () -> new EndiumAxeItem());
	public static final RegistryObject<Item> ENDIUM_SWORD = REGISTRY.register("endium_sword", () -> new EndiumSwordItem());
	public static final RegistryObject<Item> ENDIUM_SHOVEL = REGISTRY.register("endium_shovel", () -> new EndiumShovelItem());
	public static final RegistryObject<Item> ENDIUM_HOE = REGISTRY.register("endium_hoe", () -> new EndiumHoeItem());
	public static final RegistryObject<Item> ENDIUM_ARMOR_HELMET = REGISTRY.register("endium_armor_helmet", () -> new EndiumArmorItem.Helmet());
	public static final RegistryObject<Item> ENDIUM_ARMOR_CHESTPLATE = REGISTRY.register("endium_armor_chestplate",
			() -> new EndiumArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDIUM_ARMOR_LEGGINGS = REGISTRY.register("endium_armor_leggings", () -> new EndiumArmorItem.Leggings());
	public static final RegistryObject<Item> ENDIUM_ARMOR_BOOTS = REGISTRY.register("endium_armor_boots", () -> new EndiumArmorItem.Boots());
	public static final RegistryObject<Item> ENDIUMBULLET = REGISTRY.register("endiumbullet", () -> new EndiumbulletItem());
	public static final RegistryObject<Item> GUN = REGISTRY.register("gun", () -> new GunItem());
	public static final RegistryObject<Item> ENDWOOD_WOOD = block(SmmModBlocks.ENDWOOD_WOOD, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_LOG = block(SmmModBlocks.ENDWOOD_LOG, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_PLANKS = block(SmmModBlocks.ENDWOOD_PLANKS, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_LEAVES = block(SmmModBlocks.ENDWOOD_LEAVES, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_STAIRS = block(SmmModBlocks.ENDWOOD_STAIRS, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_SLAB = block(SmmModBlocks.ENDWOOD_SLAB, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_FENCE = block(SmmModBlocks.ENDWOOD_FENCE, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_FENCE_GATE = block(SmmModBlocks.ENDWOOD_FENCE_GATE, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_PRESSURE_PLATE = block(SmmModBlocks.ENDWOOD_PRESSURE_PLATE, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> ENDWOOD_BUTTON = block(SmmModBlocks.ENDWOOD_BUTTON, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> STICKGUY = REGISTRY.register("stickguy_spawn_egg",
			() -> new ForgeSpawnEggItem(SmmModEntities.STICKGUY, -3407668, -3342388, new Item.Properties().tab(SmmModTabs.TAB_SMM)));
	public static final RegistryObject<Item> I_SEE_A_DREAMER = REGISTRY.register("i_see_a_dreamer", () -> new ISeeADreamerItem());
	public static final RegistryObject<Item> STAFF = REGISTRY.register("staff", () -> new StaffItem());
	public static final RegistryObject<Item> WIZARD = REGISTRY.register("wizard_spawn_egg",
			() -> new ForgeSpawnEggItem(SmmModEntities.WIZARD, -13421569, -3407668, new Item.Properties().tab(SmmModTabs.TAB_SMM)));
	public static final RegistryObject<Item> ACTIVATED_STAFF = REGISTRY.register("activated_staff", () -> new ActivatedStaffItem());
	public static final RegistryObject<Item> SPEED = block(SmmModBlocks.SPEED, SmmModTabs.TAB_SMM);
	public static final RegistryObject<Item> WIZARD_SUMMONER = REGISTRY.register("wizard_summoner", () -> new WizardSummonerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
