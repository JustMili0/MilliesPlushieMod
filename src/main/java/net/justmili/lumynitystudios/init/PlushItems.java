package net.justmili.lumynitystudios.init;

import net.justmili.lumynitystudios.LSPlushies;
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
        BASETEST_PLUSH = registerBlockItem("basetestplush", PlushBlocks.BASETEST_PLUSH, PlushResourceLists.BASETEST_ITEM);
        ENO_PLUSH = registerBlockItem("eno_plush", PlushBlocks.ENO_PLUSH, PlushResourceLists.ENO_ITEM);
        MILLIE_PLUSH = registerBlockItem("justmili_plush", PlushBlocks.MILLIE_PLUSH, PlushResourceLists.MILLIE_ITEM);
        APPELS_PLUSH = registerBlockItem("eetgeenappels_plush", PlushBlocks.APPELS_PLUSH, PlushResourceLists.APPELS_ITEM);
        MAHAN_PLUSH = registerBlockItem("mahan_plush", PlushBlocks.MAHAN_PLUSH, PlushResourceLists.MAHAN_ITEM);
        MOCHILA_PLUSH = registerBlockItem("mochila_plush", PlushBlocks.MOCHILA_PLUSH, PlushResourceLists.MOCHILA_ITEM);
        GAEL_PLUSH = registerBlockItem("gaelfm_plush", PlushBlocks.GAEL_PLUSH, PlushResourceLists.GAEL_ITEM);
        DGIRAFFE_PLUSH = registerBlockItem("dgiraffe_plush", PlushBlocks.DGIRAFFE_PLUSH, PlushResourceLists.DGIRAFFE_ITEM);
        FAYE_PLUSH = registerBlockItem("flufaye_plush", PlushBlocks.FAYE_PLUSH, PlushResourceLists.FAYE_ITEM);
        JOHN_PLUSH = registerBlockItem("john_roboeye_plush", PlushBlocks.JOHN_PLUSH, PlushResourceLists.JOHN_ITEM);
        PLUME_PLUSH = registerBlockItem("hxplume_plush", PlushBlocks.PLUME_PLUSH, PlushResourceLists.PLUME_ITEM);
        RAZE_PLUSH = registerBlockItem("raze7th_plush", PlushBlocks.RAZE_PLUSH, PlushResourceLists.RAZE_ITEM);
        MARY_PLUSH = registerBlockItem("mary_plush", PlushBlocks.MARY_PLUSH, PlushResourceLists.MARY_ITEM);
        IZYA_PLUSH = registerBlockItem("izya_plush", PlushBlocks.IZYA_PLUSH, PlushResourceLists.IZYA_ITEM);
        BLU_PLUSH = registerBlockItem("bluspring_plush", PlushBlocks.BLU_PLUSH, PlushResourceLists.BLU_ITEM);
        NEMESTRO_PLUSH = registerBlockItem("nemestro_plush", PlushBlocks.NEMESTRO_PLUSH, PlushResourceLists.NEMESTRO_ITEM);
    }

    private static Item registerBlockItem(String name, Block block, ResourceKey<Item> key) {
        return Registry.register(BuiltInRegistries.ITEM, LSPlushies.asResource(name),
            new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(key)));
    }
    private static Item registerItem(String name, Item item) { //Just in case
        return Registry.register(BuiltInRegistries.ITEM, LSPlushies.asResource(name), item);
    }
}
