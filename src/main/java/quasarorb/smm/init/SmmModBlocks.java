
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package quasarorb.smm.init;

import quasarorb.smm.block.EndwoodWoodBlock;
import quasarorb.smm.block.EndwoodStairsBlock;
import quasarorb.smm.block.EndwoodSlabBlock;
import quasarorb.smm.block.EndwoodPressurePlateBlock;
import quasarorb.smm.block.EndwoodPlanksBlock;
import quasarorb.smm.block.EndwoodLogBlock;
import quasarorb.smm.block.EndwoodLeavesBlock;
import quasarorb.smm.block.EndwoodFenceGateBlock;
import quasarorb.smm.block.EndwoodFenceBlock;
import quasarorb.smm.block.EndwoodButtonBlock;
import quasarorb.smm.block.EndiumOreBlock;
import quasarorb.smm.block.EndiumBlockBlock;
import quasarorb.smm.SmmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class SmmModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SmmMod.MODID);
	public static final RegistryObject<Block> ENDIUM_ORE = REGISTRY.register("endium_ore", () -> new EndiumOreBlock());
	public static final RegistryObject<Block> ENDIUM_BLOCK = REGISTRY.register("endium_block", () -> new EndiumBlockBlock());
	public static final RegistryObject<Block> ENDWOOD_WOOD = REGISTRY.register("endwood_wood", () -> new EndwoodWoodBlock());
	public static final RegistryObject<Block> ENDWOOD_LOG = REGISTRY.register("endwood_log", () -> new EndwoodLogBlock());
	public static final RegistryObject<Block> ENDWOOD_PLANKS = REGISTRY.register("endwood_planks", () -> new EndwoodPlanksBlock());
	public static final RegistryObject<Block> ENDWOOD_LEAVES = REGISTRY.register("endwood_leaves", () -> new EndwoodLeavesBlock());
	public static final RegistryObject<Block> ENDWOOD_STAIRS = REGISTRY.register("endwood_stairs", () -> new EndwoodStairsBlock());
	public static final RegistryObject<Block> ENDWOOD_SLAB = REGISTRY.register("endwood_slab", () -> new EndwoodSlabBlock());
	public static final RegistryObject<Block> ENDWOOD_FENCE = REGISTRY.register("endwood_fence", () -> new EndwoodFenceBlock());
	public static final RegistryObject<Block> ENDWOOD_FENCE_GATE = REGISTRY.register("endwood_fence_gate", () -> new EndwoodFenceGateBlock());
	public static final RegistryObject<Block> ENDWOOD_PRESSURE_PLATE = REGISTRY.register("endwood_pressure_plate",
			() -> new EndwoodPressurePlateBlock());
	public static final RegistryObject<Block> ENDWOOD_BUTTON = REGISTRY.register("endwood_button", () -> new EndwoodButtonBlock());
}
