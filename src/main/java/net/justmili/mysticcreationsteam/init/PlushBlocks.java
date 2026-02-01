package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.justmili.mysticcreationsteam.block.BaseTestPlush;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public class PlushBlocks {
    public static Block BASE_TEST_PLUSH;

    public static void load() {
        BASE_TEST_PLUSH = register("basetestplush", new BaseTestPlush());
    }

    private static Block register(String registryName, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, MCTPlushies.asResource(registryName), block);
    }
}
