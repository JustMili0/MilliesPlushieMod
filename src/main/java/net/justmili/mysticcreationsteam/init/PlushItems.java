package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class PlushItems {
    public static Item BASE_TEST_PLUSH;

    public static void load() {
        BASE_TEST_PLUSH = register("basetestplush", new BlockItem(PlushBlocks.BASE_TEST_PLUSH, new Item.Properties()));
    }

    private static Item register(String registryName, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, MCTPlushies.asResource(registryName), item);
    }
}
