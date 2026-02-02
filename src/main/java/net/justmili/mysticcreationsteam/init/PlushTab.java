package net.justmili.mysticcreationsteam.init;

import net.justmili.mysticcreationsteam.MCTPlushies;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PlushTab {
    public static final ResourceKey<CreativeModeTab> PLUSHIES_TAB = ResourceKey.create(
        Registries.CREATIVE_MODE_TAB, MCTPlushies.asResource("mct_plushies"));

    public static void load() {
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB, PLUSHIES_TAB,
            CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 0)
                .title(Component.translatable("item_group." + MCTPlushies.MODID + ".mct_plushies"))
                .icon(() -> new ItemStack(PlushBlocks.BASE_TEST_PLUSH))
                .displayItems((params, output) -> {
                    output.accept(PlushBlocks.BASE_TEST_PLUSH);
                })
                .build()
        );
    }
}
