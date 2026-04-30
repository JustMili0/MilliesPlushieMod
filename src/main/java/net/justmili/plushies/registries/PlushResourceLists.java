package net.justmili.plushies.registries;

import net.justmili.plushies.Plushies;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

@SuppressWarnings("NullableProblems")
public class PlushResourceLists {
    public static Block[] getPlushies() {
        return new Block[] {
            PlushBlocks.BASETEST_PLUSH,
            
            PlushBlocks.ENO_PLUSH,
            PlushBlocks.MILLIE_PLUSH,
            PlushBlocks.APPELS_PLUSH,
            PlushBlocks.MAHAN_PLUSH,
            PlushBlocks.MOCHILA_PLUSH,
            PlushBlocks.GAEL_PLUSH,
            PlushBlocks.DGIRAFFE_PLUSH,
            PlushBlocks.FAYE_PLUSH,
            PlushBlocks.JOHN_PLUSH,
            PlushBlocks.PLUME_PLUSH,
            PlushBlocks.RAZE_PLUSH,
            PlushBlocks.MARY_PLUSH,
            PlushBlocks.IZYA_PLUSH,
            PlushBlocks.BLU_PLUSH,
            PlushBlocks.NEMESTRO_PLUSH,

            PlushBlocks.ZARSAI_PLUSH,
            PlushBlocks.SHADEVT_PLUSH,
            PlushBlocks.WHOISMONIA_PLUSH,
            PlushBlocks.KURAYAMI_PLUSH,
            PlushBlocks.QU1NNT0NZZ_PLUSH,
            PlushBlocks.MEOWYNYAA_PLUSH,
            PlushBlocks.SOOKIECHU_PLUSH,
            PlushBlocks.CHERRYCHIFFON_PLUSH,
            PlushBlocks.AURELIA_STARS_PLUSH,
            PlushBlocks.FUUMIZU_PLUSH,
            PlushBlocks.ANALOGWHISKERS_PLUSH
        };
    }

    // ResourceKeys - Blocks
    public static final ResourceKey<Block> BASETEST_BLOCK = registerBlock("basetestplush");
    
    public static final ResourceKey<Block> ENO_BLOCK = registerBlock("eno_plush");
    public static final ResourceKey<Block> MILLIE_BLOCK = registerBlock("justmili_plush");
    public static final ResourceKey<Block> APPELS_BLOCK = registerBlock("eetgeenappels_plush");
    public static final ResourceKey<Block> MAHAN_BLOCK = registerBlock("mahan_plush");
    public static final ResourceKey<Block> MOCHILA_BLOCK = registerBlock("mochila_plush");
    public static final ResourceKey<Block> GAEL_BLOCK = registerBlock("gaelfm_plush");
    public static final ResourceKey<Block> DGIRAFFE_BLOCK = registerBlock("dgiraffe_plush");
    public static final ResourceKey<Block> FAYE_BLOCK = registerBlock("flufaye_plush");
    public static final ResourceKey<Block> JOHN_BLOCK = registerBlock("john_roboeye_plush");
    public static final ResourceKey<Block> PLUME_BLOCK = registerBlock("hxplume_plush");
    public static final ResourceKey<Block> RAZE_BLOCK = registerBlock("raze7th_plush");
    public static final ResourceKey<Block> MARY_BLOCK = registerBlock("mary_plush");
    public static final ResourceKey<Block> IZYA_BLOCK = registerBlock("izya_plush");
    public static final ResourceKey<Block> BLU_BLOCK = registerBlock("bluspring_plush"); // Contributor
    public static final ResourceKey<Block> NEMESTRO_BLOCK = registerBlock("nemestro_plush"); //Old team member

    public static final ResourceKey<Block> ZARSAI_BLOCK = registerBlock("zarsai_plush");
    public static final ResourceKey<Block> SHADEVT_BLOCK = registerBlock("shadevt_plush");
    public static final ResourceKey<Block> WHOISMONIA_BLOCK = registerBlock("whoismonia_plush");
    public static final ResourceKey<Block> KURAYAMI_BLOCK = registerBlock("kurayamispider_plush");
    public static final ResourceKey<Block> QUINNT0NZZ_BLOCK = registerBlock("qu1nnt0nzz_plush");
    public static final ResourceKey<Block> MEOWYNYAA_BLOCK = registerBlock("meowynyaa_plush");
    public static final ResourceKey<Block> SOOKIECHU_BLOCK = registerBlock("sookiechu_plush");
    public static final ResourceKey<Block> CHERRYCHIFFON_BLOCK = registerBlock("cherrychiffonvt_plush");
    public static final ResourceKey<Block> AURELIA_STARS_BLOCK = registerBlock("aurelia_stars_plush");
    public static final ResourceKey<Block> FUUMIZU_BLOCK = registerBlock("fuumizu_plush");
    public static final ResourceKey<Block> ANALOGWHISKHERS_BLOCK = registerBlock("analogwhiskers_plush");

    // ResourceKeys - Items
    public static final ResourceKey<Item> BASETEST_ITEM = registerItem("basetestplush");
    public static final ResourceKey<Item> ENO_ITEM = registerItem("eno_plush");
    public static final ResourceKey<Item> MILLIE_ITEM = registerItem("justmili_plush");
    public static final ResourceKey<Item> APPELS_ITEM = registerItem("eetgeenappels_plush");
    public static final ResourceKey<Item> MAHAN_ITEM = registerItem("mahan_plush");
    public static final ResourceKey<Item> MOCHILA_ITEM = registerItem("mochila_plush");
    public static final ResourceKey<Item> GAEL_ITEM = registerItem("gaelfm_plush");
    public static final ResourceKey<Item> DGIRAFFE_ITEM = registerItem("dgiraffe_plush");
    public static final ResourceKey<Item> FAYE_ITEM = registerItem("flufaye_plush");
    public static final ResourceKey<Item> JOHN_ITEM = registerItem("john_roboeye_plush");
    public static final ResourceKey<Item> PLUME_ITEM = registerItem("hxplume_plush");
    public static final ResourceKey<Item> RAZE_ITEM = registerItem("raze7th_plush");
    public static final ResourceKey<Item> MARY_ITEM = registerItem("mary_plush");
    public static final ResourceKey<Item> IZYA_ITEM = registerItem("izya_plush");
    public static final ResourceKey<Item> BLU_ITEM = registerItem("bluspring_plush"); // Contributor
    public static final ResourceKey<Item> NEMESTRO_ITEM = registerItem("nemestro_plush"); //Old team member
    
    public static ResourceKey<Block> registerBlock(String id) {
        return ResourceKey.create(Registries.BLOCK, Plushies.asResource(id));
    }
    public static ResourceKey<Item> registerItem(String id) {
        return ResourceKey.create(Registries.ITEM, Plushies.asResource(id));
    }
}
