package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.justmili.mysticcreationsteam.block.BaseTestPlush;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public class PlushBlocks {
    public static Block BASETEST_PLUSH;
    public static Block ENO_PLUSH;
    public static Block MILLIE_PLUSH;
    public static Block APPELS_PLUSH;
    public static Block MAHAN_PLUSH;
    public static Block MOCHILA_PLUSH;
    public static Block GAEL_PLUSH;
    public static Block DGIRAFFE_PLUSH;
    public static Block FAYE_PLUSH;
    public static Block JOHN_PLUSH;
    public static Block PLUME_PLUSH;
    public static Block RAZE_PLUSH;
    public static Block MARY_PLUSH;
    public static Block IZYA_PLUSH;
    public static Block BLU_PLUSH; //Contributor
    public static Block NEMESTRO_PLUSH; //Old team member

    public static void load() {
        BASETEST_PLUSH = register("basetestplush", new BaseTestPlush());
    }

    private static Block register(String registryName, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, MCTPlushies.asResource(registryName), block);
    }
}
