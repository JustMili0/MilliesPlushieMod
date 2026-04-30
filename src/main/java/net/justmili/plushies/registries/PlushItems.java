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

public class PlushItems {
    public static final Map<DyeColor, Item> FABRICS = new EnumMap<>(DyeColor.class);
    public static Item SEWING_NEEDLE;
    public static Item FABRIC_GENERIC;

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

    public static Item ZARSAI_PLUSH;
    public static Item SHADEVT_PLUSH;
    public static Item WHOISMONIA_PLUSH;
    public static Item KURAYAMI_PLUSH;
    public static Item QU1NNT0NZZ_PLUSH;
    public static Item MEOWYNYAA_PLUSH;
    public static Item SOOKIECHU_PLUSH;
    public static Item CHERRYCHIFFON_PLUSH;
    public static Item AURELIA_STARS_PLUSH;
    public static Item FUUMIZU_PLUSH;
    public static Item ANALOGWHISKERS_PLUSH;

    public static void load() {
        SEWING_NEEDLE = registerItem("sewing_needle", new SewingNeedle());
        FABRIC_GENERIC = registerItem("fabric", new Fabric(null));
        for (DyeColor color : DyeColor.values()) {
            FABRICS.put(color, registerItem(color.getSerializedName() + "_fabric", new Fabric(color)));
        }
        
        BASETEST_PLUSH = registerBlockItem("basetestplush", PlushBlocks.BASETEST_PLUSH);
        
        ENO_PLUSH = registerBlockItem("eno_plush", PlushBlocks.ENO_PLUSH);
        MILLIE_PLUSH = registerBlockItem("justmili_plush", PlushBlocks.MILLIE_PLUSH);
        APPELS_PLUSH = registerBlockItem("eetgeenappels_plush", PlushBlocks.APPELS_PLUSH);
        MAHAN_PLUSH = registerBlockItem("mahan_plush", PlushBlocks.MAHAN_PLUSH);
        MOCHILA_PLUSH = registerBlockItem("mochila_plush", PlushBlocks.MOCHILA_PLUSH);
        GAEL_PLUSH = registerBlockItem("gaelfm_plush", PlushBlocks.GAEL_PLUSH);
        DGIRAFFE_PLUSH = registerBlockItem("dgiraffe_plush", PlushBlocks.DGIRAFFE_PLUSH);
        FAYE_PLUSH = registerBlockItem("flufaye_plush", PlushBlocks.FAYE_PLUSH);
        JOHN_PLUSH = registerBlockItem("john_roboeye_plush", PlushBlocks.JOHN_PLUSH);
        PLUME_PLUSH = registerBlockItem("hxplume_plush", PlushBlocks.PLUME_PLUSH);
        RAZE_PLUSH = registerBlockItem("raze7th_plush", PlushBlocks.RAZE_PLUSH);
        MARY_PLUSH = registerBlockItem("mary_plush", PlushBlocks.MARY_PLUSH);
        IZYA_PLUSH = registerBlockItem("izya_plush", PlushBlocks.IZYA_PLUSH);
        BLU_PLUSH = registerBlockItem("bluspring_plush", PlushBlocks.BLU_PLUSH);
        NEMESTRO_PLUSH = registerBlockItem("nemestro_plush", PlushBlocks.NEMESTRO_PLUSH);

        ZARSAI_PLUSH = registerBlockItem("zarsai_plush", PlushBlocks.ZARSAI_PLUSH);
        SHADEVT_PLUSH = registerBlockItem("shadevt_plush", PlushBlocks.SHADEVT_PLUSH);
        WHOISMONIA_PLUSH = registerBlockItem("whoismonia_plush", PlushBlocks.WHOISMONIA_PLUSH);
        KURAYAMI_PLUSH = registerBlockItem("kurayamispider_plush", PlushBlocks.KURAYAMI_PLUSH);
        QU1NNT0NZZ_PLUSH = registerBlockItem("qu1nnt0nzz_plush", PlushBlocks.QU1NNT0NZZ_PLUSH);
        MEOWYNYAA_PLUSH = registerBlockItem("meowynyaa_plush", PlushBlocks.MEOWYNYAA_PLUSH);
        SOOKIECHU_PLUSH = registerBlockItem("sookiechu_plush", PlushBlocks.SOOKIECHU_PLUSH);
        CHERRYCHIFFON_PLUSH = registerBlockItem("cherrychiffonvt_plush", PlushBlocks.CHERRYCHIFFON_PLUSH);
        AURELIA_STARS_PLUSH = registerBlockItem("aurelia_stars_plush", PlushBlocks.AURELIA_STARS_PLUSH);
        FUUMIZU_PLUSH = registerBlockItem("fuumizu_plush", PlushBlocks.FUUMIZU_PLUSH);
        ANALOGWHISKERS_PLUSH = registerBlockItem("analogwhiskers_plush", PlushBlocks.ANALOGWHISKERS_PLUSH);
    }

    private static Item registerBlockItem(String name, Block block) {
        var id = Plushies.asResource(name);
        return Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block,
            new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, id))));
    }
    private static Item registerItem(String name, Item item) {
        var id = Plushies.asResource(name);
        return Registry.register(BuiltInRegistries.ITEM, Plushies.asResource(name),
            new Item(item, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)))); // TODO: FIX
    }
}
