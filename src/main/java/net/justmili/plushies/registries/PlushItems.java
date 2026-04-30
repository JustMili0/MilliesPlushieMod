package net.justmili.plushies.registries;

import net.justmili.plushies.Plushies;
import net.justmili.plushies.content.item.Fabric;
import net.justmili.plushies.content.item.SewingNeedle;
import net.justmili.plushies.content.plushies.vtubers.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class PlushItems {
    public static final Map<DyeColor, Item> FABRICS = new EnumMap<>(DyeColor.class);
    public static Item SEWING_NEEDLE = registerItem("sewing_needle", SewingNeedle::new);
    public static Item FABRIC_GENERIC = registerItem("fabric", properties -> new Fabric(properties, null));

    public static Item BASETEST_PLUSH = registerBlockItem("basetestplush", PlushBlocks.BASETEST_PLUSH);

    public static Item ENO_PLUSH = registerBlockItem("eno_plush", PlushBlocks.ENO_PLUSH);
    public static Item MILLIE_PLUSH = registerBlockItem("justmili_plush", PlushBlocks.MILLIE_PLUSH);
    public static Item APPELS_PLUSH = registerBlockItem("eetgeenappels_plush", PlushBlocks.APPELS_PLUSH);
    public static Item MAHAN_PLUSH = registerBlockItem("mahan_plush", PlushBlocks.MAHAN_PLUSH);
    public static Item MOCHILA_PLUSH = registerBlockItem("mochila_plush", PlushBlocks.MOCHILA_PLUSH);
    public static Item GAEL_PLUSH = registerBlockItem("gaelfm_plush", PlushBlocks.GAEL_PLUSH);
    public static Item DGIRAFFE_PLUSH = registerBlockItem("dgiraffe_plush", PlushBlocks.DGIRAFFE_PLUSH);
    public static Item FAYE_PLUSH = registerBlockItem("flufaye_plush", PlushBlocks.FAYE_PLUSH);
    public static Item JOHN_PLUSH = registerBlockItem("john_roboeye_plush", PlushBlocks.JOHN_PLUSH);
    public static Item PLUME_PLUSH = registerBlockItem("hxplume_plush", PlushBlocks.PLUME_PLUSH);
    public static Item RAZE_PLUSH = registerBlockItem("raze7th_plush", PlushBlocks.RAZE_PLUSH);
    public static Item MARY_PLUSH = registerBlockItem("mary_plush", PlushBlocks.MARY_PLUSH);
    public static Item IZYA_PLUSH = registerBlockItem("izya_plush", PlushBlocks.IZYA_PLUSH);
    public static Item BLU_PLUSH = registerBlockItem("bluspring_plush", PlushBlocks.BLU_PLUSH);
    public static Item VIKTOR_PLUSH = registerBlockItem("viktor_plush", PlushBlocks.VIKTOR_PLUSH);

    public static Item ZARSAI_PLUSH = registerBlockItem("zarsai_plush", PlushBlocks.ZARSAI_PLUSH);
    public static Item SHADEVT_PLUSH = registerBlockItem("shadevt_plush", PlushBlocks.SHADEVT_PLUSH);
    public static Item WHOISMONIA_PLUSH = registerBlockItem("whoismonia_plush", PlushBlocks.WHOISMONIA_PLUSH);
    public static Item KURAYAMI_PLUSH = registerBlockItem("kurayamispider_plush", PlushBlocks.KURAYAMI_PLUSH);
    public static Item QU1NNT0NZZ_PLUSH = registerBlockItem("qu1nnt0nzz_plush", PlushBlocks.QU1NNT0NZZ_PLUSH);
    public static Item MEOWYNYAA_PLUSH = registerBlockItem("meowynyaa_plush", PlushBlocks.MEOWYNYAA_PLUSH);
    public static Item SOOKIECHU_PLUSH = registerBlockItem("sookiechu_plush", PlushBlocks.SOOKIECHU_PLUSH);
    public static Item CHERRYCHIFFON_PLUSH = registerBlockItem("cherrychiffonvt_plush", PlushBlocks.CHERRYCHIFFON_PLUSH);
    public static Item AURELIA_STARS_PLUSH = registerBlockItem("aurelia_stars_plush", PlushBlocks.AURELIA_STARS_PLUSH);
    public static Item FUUMIZU_PLUSH = registerBlockItem("fuumizu_plush", PlushBlocks.FUUMIZU_PLUSH);
    public static Item ANALOGWHISKERS_PLUSH = registerBlockItem("analogwhiskers_plush", PlushBlocks.ANALOGWHISKERS_PLUSH);

    static {
        for (DyeColor color : DyeColor.values()) {
            FABRICS.put(color, registerItem(color.getSerializedName() + "_fabric", properties -> new Fabric(properties, color)));
        }
    }

    private static Item registerBlockItem(String name, Block block) {
        var id = Plushies.asResource(name);
        return Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block,
            new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, id))));
    }
    private static Item registerItem(String name, Function<Item.Properties, Item> item) {
        var id = Plushies.asResource(name);
        return Registry.register(BuiltInRegistries.ITEM, Plushies.asResource(name),
            item.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id))));
    }

    public static void load() {}
}
