package net.justmili.plushies.registries;

import net.justmili.plushies.Plushies;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class PlushTab {
    public static final ResourceKey<CreativeModeTab> PLUSHIES_TAB = ResourceKey.create(
        Registries.CREATIVE_MODE_TAB, Plushies.asResource("plushies_tab"));

    public static void load() {
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB, PLUSHIES_TAB,
            CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 0)
                .title(Component.translatable("item_group." + Plushies.MODID + ".tab"))
                .icon(() -> new ItemStack(PlushItems.SEWING_NEEDLE))
                .displayItems((params, output) -> {
                    output.accept(PlushItems.SEWING_NEEDLE);
                    output.accept(PlushItems.FABRIC_GENERIC);
                    for (Item fabric : PlushItems.FABRICS.values()) {
                        output.accept(fabric);
                    }
                    for (Block plush : PlushBlocks.getPlushies()) {
                        output.accept(plush);
                    }
                })
                .build()
        );
    }
}
