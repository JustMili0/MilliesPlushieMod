package net.justmili.plushies.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.justmili.plushies.registries.PlushBlocks;
import net.justmili.plushies.registries.PlushItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
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

                genRecipe(this, PlushItems.BASETEST_PLUSH, PlushItems.FABRICS.get(DyeColor.WHITE), Items.BLACK_DYE, output);
            }
        };
    }

    @Override
    public String getName() {
        return "PlushRecipeProvider";
    }

    //Helper Methods
    private static void genRecipe(RecipeProvider provider, Item plushie, Item fabric, Item dye, RecipeOutput output) {
        provider.shaped(RecipeCategory.BUILDING_BLOCKS, plushie)
            .pattern("12")
            .pattern("34")
            .define('1', Items.WHITE_WOOL)
            .define('2', fabric)
            .define('3', dye)
            .define('4', PlushItems.SEWING_NEEDLE)
            .group("plushies")
            .unlockedBy("plush", provider.has(fabric))
            .save(output);
    }
}
