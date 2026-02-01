package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.justmili.mysticcreationsteam.block.BasicTestPlush;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public class PlushBlocks {
    public static Block BASIC_TEST_PLUSH;

    public static void load() {
        BASIC_TEST_PLUSH = register("basictestplush", new BasicTestPlush());
    }

    private static Block register(String registryName, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, MCTPlushies.asResource(registryName), block);
    }
}
