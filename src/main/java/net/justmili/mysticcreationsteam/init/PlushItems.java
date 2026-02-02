package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class PlushItems {
    public static Item BASE_TEST_PLUSH;

    public static void load() {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, MCTPlushies.asResource("basetestplush"));

        BASE_TEST_PLUSH = register("basetestplush", new BlockItem(PlushBlocks.BASE_TEST_PLUSH, new Item.Properties().setId(key)));
    }

    private static Item register(String registryName, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, MCTPlushies.asResource(registryName), item);
    }
}
