package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class PlushItems {
    public static Item BASIC_TEST_PLUSH;

    public static void load() {
        BASIC_TEST_PLUSH = register("basictestplush", new BlockItem(PlushBlocks.BASIC_TEST_PLUSH, new Item.Properties()));
    }

    private static Item register(String registryName, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, MCTPlushies.asResource(registryName), item);
    }
}
