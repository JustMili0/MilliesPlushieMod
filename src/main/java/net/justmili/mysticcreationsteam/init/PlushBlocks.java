package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.justmili.mysticcreationsteam.block.*;
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
        ENO_PLUSH = register("eno_plush", new EnoPlush());
        MILLIE_PLUSH = register("justmili_plush", new MilliePlush());
        APPELS_PLUSH = register("eetgeenappels_plush", new AppelsPlush());
        MAHAN_PLUSH = register("mahan_plush", new MahanPlush());
        MOCHILA_PLUSH = register("mochila_plush", new MochilaPlush());
        GAEL_PLUSH = register("gaelfm_plush", new GaelPlush());
        DGIRAFFE_PLUSH = register("dgiraffe_plush", new DGiraffePlush());
        FAYE_PLUSH = register("flufaye_plush", new FayePlush());
        JOHN_PLUSH = register("john_roboeye_plush", new JohnPlush());
        PLUME_PLUSH = register("hxplume_plush", new PlumePlush());
        RAZE_PLUSH = register("raze7th_plush", new RazePlush());
        MARY_PLUSH = register("mary_plush", new MaryPlush());
        IZYA_PLUSH = register("izya_plush", new IzyaPlush());
        BLU_PLUSH = register("bluspring_plush", new BluSpringPlush());
        NEMESTRO_PLUSH = register("nemestro_plush", new NemestroPlush());
    }

    private static Block register(String registryName, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, MCTPlushies.asResource(registryName), block);
    }
}
