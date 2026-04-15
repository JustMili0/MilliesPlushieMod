package net.justmili.lumynitystudios.init;

import net.justmili.lumynitystudios.LSPlushies;
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
            PlushBlocks.NEMESTRO_PLUSH
        };
    }

    //ResourceKeys - Blocks
    public static final ResourceKey<Block> BASETEST_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("basetestplush"));
    public static final ResourceKey<Block> ENO_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("eno_plush"));
    public static final ResourceKey<Block> MILLIE_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("justmili_plush"));
    public static final ResourceKey<Block> APPELS_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("eetgeenappels_plush"));
    public static final ResourceKey<Block> MAHAN_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("mahan_plush"));
    public static final ResourceKey<Block> MOCHILA_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("mochila_plush"));
    public static final ResourceKey<Block> GAEL_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("gaelfm_plush"));
    public static final ResourceKey<Block> DGIRAFFE_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("dgiraffe_plush"));
    public static final ResourceKey<Block> FAYE_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("flufaye_plush"));
    public static final ResourceKey<Block> JOHN_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("john_roboeye_plush"));
    public static final ResourceKey<Block> PLUME_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("hxplume_plush"));
    public static final ResourceKey<Block> RAZE_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("raze7th_plush"));
    public static final ResourceKey<Block> MARY_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("mary_plush"));
    public static final ResourceKey<Block> IZYA_BLOCK = ResourceKey.create(
        Registries.BLOCK, LSPlushies.asResource("izya_plush"));
    public static final ResourceKey<Block> BLU_BLOCK = ResourceKey.create( //Contributor
        Registries.BLOCK, LSPlushies.asResource("bluspring_plush"));
    public static final ResourceKey<Block> NEMESTRO_BLOCK = ResourceKey.create( //Old team member
        Registries.BLOCK, LSPlushies.asResource("nemestro_plush"));

    //ResourceKeys - Items
    public static final ResourceKey<Item> BASETEST_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("basetestplush"));
    public static final ResourceKey<Item> ENO_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("eno_plush"));
    public static final ResourceKey<Item> MILLIE_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("justmili_plush"));
    public static final ResourceKey<Item> APPELS_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("eetgeenappels_plush"));
    public static final ResourceKey<Item> MAHAN_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("mahan_plush"));
    public static final ResourceKey<Item> MOCHILA_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("mochila_plush"));
    public static final ResourceKey<Item> GAEL_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("gaelfm_plush"));
    public static final ResourceKey<Item> DGIRAFFE_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("dgiraffe_plush"));
    public static final ResourceKey<Item> FAYE_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("flufaye_plush"));
    public static final ResourceKey<Item> JOHN_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("john_roboeye_plush"));
    public static final ResourceKey<Item> PLUME_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("hxplume_plush"));
    public static final ResourceKey<Item> RAZE_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("raze7th_plush"));
    public static final ResourceKey<Item> MARY_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("mary_plush"));
    public static final ResourceKey<Item> IZYA_ITEM = ResourceKey.create(
        Registries.ITEM, LSPlushies.asResource("izya_plush"));
    public static final ResourceKey<Item> BLU_ITEM = ResourceKey.create( //Contributor
        Registries.ITEM, LSPlushies.asResource("bluspring_plush"));
    public static final ResourceKey<Item> NEMESTRO_ITEM = ResourceKey.create( //Old team member
        Registries.ITEM, LSPlushies.asResource("nemestro_plush"));
}
