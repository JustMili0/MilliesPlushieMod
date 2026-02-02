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
    }

    private static Item registerBlockItem(String name, Block block, ResourceKey<Item> key) {
        return Registry.register(BuiltInRegistries.ITEM, MCTPlushies.asResource(name),
            new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(key)));
    }
    private static Item registerItem(String name, Item item) { //Just in case
        return Registry.register(BuiltInRegistries.ITEM, MCTPlushies.asResource(name), item);
    }
}
