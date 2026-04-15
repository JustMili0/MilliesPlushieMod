package net.justmili.lumynitystudios.init;

import net.justmili.lumynitystudios.LSPlushies;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class PlushTab {
    public static final ResourceKey<CreativeModeTab> PLUSHIES_TAB = ResourceKey.create(
        Registries.CREATIVE_MODE_TAB, LSPlushies.asResource("mct_plushies"));

    public static void load() {
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB, PLUSHIES_TAB,
            CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 0)
                .title(Component.translatable("item_group." + LSPlushies.MODID + ".mct_plushies"))
                .icon(() -> new ItemStack(PlushBlocks.ENO_PLUSH))
                .displayItems((params, output) -> {
                    for (Block plush : PlushResourceLists.getPlushies()) {
                        output.accept(plush);
                    }
                })
                .build()
        );
    }
}
