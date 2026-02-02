package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PlushItems {
    public static Item BASETEST_PLUSH;
    public static Item ENO_PLUSH;
    public static Item MILLIE_PLUSH;
    public static Item APPELS_PLUSH;
    public static Item MAHAN_PLUSH;
    public static Item MOCHILA_PLUSH;
    public static Item GAEL_PLUSH;
    public static Item DGIRAFFE_PLUSH;
    public static Item FAYE_PLUSH;
    public static Item JOHN_PLUSH;
    public static Item PLUME_PLUSH;
    public static Item RAZE_PLUSH;
    public static Item MARY_PLUSH;
    public static Item IZYA_PLUSH;
    public static Item BLU_PLUSH; //Contributor
    public static Item NEMESTRO_PLUSH; //Old team member

    public static void load() {
        BASETEST_PLUSH = registerBlockItem("basetestplush", PlushBlocks.BASETEST_PLUSH, PlushResourceKeys.BASETEST_ITEM);
        ENO_PLUSH = registerBlockItem("eno_plush", PlushBlocks.ENO_PLUSH, PlushResourceKeys.ENO_ITEM);
        MILLIE_PLUSH = registerBlockItem("justmili_plush", PlushBlocks.MILLIE_PLUSH, PlushResourceKeys.MILLIE_ITEM);
        APPELS_PLUSH = registerBlockItem("eetgeenappels_plush", PlushBlocks.APPELS_PLUSH, PlushResourceKeys.APPELS_ITEM);
        MAHAN_PLUSH = registerBlockItem("mahan_plush", PlushBlocks.MAHAN_PLUSH, PlushResourceKeys.MAHAN_ITEM);
        MOCHILA_PLUSH = registerBlockItem("mochila_plush", PlushBlocks.MOCHILA_PLUSH, PlushResourceKeys.MOCHILA_ITEM);
        GAEL_PLUSH = registerBlockItem("gaelfm_plush", PlushBlocks.GAEL_PLUSH, PlushResourceKeys.GAEL_ITEM);
        DGIRAFFE_PLUSH = registerBlockItem("dgiraffe_plush", PlushBlocks.DGIRAFFE_PLUSH, PlushResourceKeys.DGIRAFFE_ITEM);
        FAYE_PLUSH = registerBlockItem("flufaye_plush", PlushBlocks.FAYE_PLUSH, PlushResourceKeys.FAYE_ITEM);
        JOHN_PLUSH = registerBlockItem("john_roboeye_plush", PlushBlocks.JOHN_PLUSH, PlushResourceKeys.JOHN_ITEM);
        PLUME_PLUSH = registerBlockItem("hxplume_plush", PlushBlocks.PLUME_PLUSH, PlushResourceKeys.PLUME_ITEM);
        RAZE_PLUSH = registerBlockItem("raze7th_plush", PlushBlocks.RAZE_PLUSH, PlushResourceKeys.RAZE_ITEM);
        MARY_PLUSH = registerBlockItem("mary_plush", PlushBlocks.MARY_PLUSH, PlushResourceKeys.MARY_ITEM);
        IZYA_PLUSH = registerBlockItem("izya_plush", PlushBlocks.IZYA_PLUSH, PlushResourceKeys.IZYA_ITEM);
        BLU_PLUSH = registerBlockItem("bluspring_plush", PlushBlocks.BLU_PLUSH, PlushResourceKeys.BLU_ITEM);
        NEMESTRO_PLUSH = registerBlockItem("nemestro_plush", PlushBlocks.NEMESTRO_PLUSH, PlushResourceKeys.NEMESTRO_ITEM);
    }

    private static Item registerBlockItem(String name, Block block, ResourceKey<Item> key) {
        return Registry.register(BuiltInRegistries.ITEM, MCTPlushies.asResource(name),
            new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(key)));
    }
    private static Item registerItem(String name, Item item) { //Just in case
        return Registry.register(BuiltInRegistries.ITEM, MCTPlushies.asResource(name), item);
    }
}
