package net.justmili.plushies.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.justmili.plushies.registries.PlushBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class PlushRecipeProvider extends FabricRecipeProvider {
    public PlushRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider lookup, RecipeOutput output) {
        return new RecipeProvider(lookup, output) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = lookup.lookupOrThrow(Registries.ITEM);
                genRecipe(this, PlushBlocks.BASETEST_PLUSH, Items.COMMAND_BLOCK, Items.WHITE_WOOL, output);
                genRecipe(this, PlushBlocks.ENO_PLUSH, Items.ENDER_PEARL, Items.BLACK_WOOL, output);
                genRecipeTagged(this, PlushBlocks.MILLIE_PLUSH, ItemTags.FISHES, Items.YELLOW_WOOL, output);
                genRecipe(this, PlushBlocks.APPELS_PLUSH, Items.APPLE, Items.RED_WOOL, output);
                genRecipe(this, PlushBlocks.MAHAN_PLUSH, Items.BONE, Items.ORANGE_WOOL, output);
                genRecipe(this, PlushBlocks.MOCHILA_PLUSH, Items.BARRIER, Items.LIGHT_GRAY_WOOL, output); ///CHANGE LATER
                genRecipe(this, PlushBlocks.GAEL_PLUSH, Items.SLIME_BALL, Items.LIME_WOOL, output);
                genRecipe(this, PlushBlocks.DGIRAFFE_PLUSH, Items.MUSIC_DISC_CHIRP, Items.CYAN_WOOL, output);
                genRecipe(this, PlushBlocks.FAYE_PLUSH, Items.FEATHER, Items.MAGENTA_WOOL, output);
                genRecipe(this, PlushBlocks.JOHN_PLUSH, Items.REDSTONE, Items.GRAY_WOOL, output);
                genRecipe(this, PlushBlocks.PLUME_PLUSH, Items.JUNGLE_SAPLING, Items.PURPLE_WOOL, output);
                genRecipe(this, PlushBlocks.RAZE_PLUSH, Items.LEAF_LITTER, Items.GREEN_WOOL, output);
                genRecipe(this, PlushBlocks.MARY_PLUSH, Items.GLOWSTONE_DUST, Items.WHITE_WOOL, output);
                genRecipeTagged(this, PlushBlocks.IZYA_PLUSH, ItemTags.FISHES, Items.BLACK_WOOL, output);
                genRecipeTagged(this, PlushBlocks.BLU_PLUSH, ItemTags.EGGS, Items.BLUE_WOOL, output);
                genRecipe(this, PlushBlocks.NEMESTRO_PLUSH, Items.IRON_SWORD, Items.RED_WOOL, output);


            }
        };
    }

    @Override
    public String getName() {
        return "MCTRecipeProvider";
    }

    //Helper Methods
    private static void genRecipe(RecipeProvider provider, Block plushie, Item brandItem, Item wool, RecipeOutput output) {
        provider.shaped(RecipeCategory.BUILDING_BLOCKS, plushie)
            .pattern("x")
            .pattern("#")
            .define('x', brandItem)
            .define('#', wool)
            .group("vplushies")
            .unlockedBy("plush", provider.has(wool))
            .save(output);
    }
    private static void genRecipeTagged(RecipeProvider provider, Block plushie, TagKey<Item> brandItem, Item wool, RecipeOutput output) {
        provider.shaped(RecipeCategory.BUILDING_BLOCKS, plushie)
            .pattern("x")
            .pattern("#")
            .define('x', brandItem)
            .define('#', wool)
            .group("vplushies")
            .unlockedBy("plush", provider.has(wool))
            .save(output);
    }
}
