package net.justmili.plushies.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.justmili.plushies.Plushies;
import net.justmili.plushies.registries.PlushBlocks;
import net.justmili.plushies.registries.PlushItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;

public class PlushModelProvider extends FabricModelProvider {
    public PlushModelProvider(FabricPackOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockGen) {
        //Generate only Blockstates
        for (Block plush : PlushBlocks.getPlushies()) {
            genBlockstates(blockGen, plush);
        }
    }
    @Override
    public void generateItemModels(ItemModelGenerators itemGen) {
        //Generate Item Models (Flat, "GENERATED")
        for (Block plush : PlushBlocks.getPlushies()) {
            genItemModelFromBlock(itemGen, plush);
        }
        genItemModel(itemGen, PlushItems.FABRIC_GENERIC);
        for (Item fabric : PlushItems.FABRICS.values()) {
            genItemModel(itemGen, fabric);
        }
    }

    //Helper Methods
    private static void genBlockstates(BlockModelGenerators blockGen, Block block) {
        blockGen.blockStateOutput.accept(createPlushBlockstates(block));
    }
    private static BlockModelDefinitionGenerator createPlushBlockstates(Block plushBlock) {
        Identifier id = Plushies.asResource("block/" + BuiltInRegistries.BLOCK.getKey(plushBlock).getPath());
        MultiVariant model = BlockModelGenerators.plainVariant(id);

        return MultiVariantGenerator.dispatch(plushBlock)
            .with(PropertyDispatch.initial(HorizontalDirectionalBlock.FACING)
                .select(Direction.NORTH, model)
                .select(Direction.EAST,  model.with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.SOUTH, model.with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.WEST,  model.with(BlockModelGenerators.Y_ROT_270))
            );
    }
    private static void genItemModelFromBlock(ItemModelGenerators itemGen, Block block) {
        itemGen.generateFlatItem(Item.byBlock(block), ModelTemplates.FLAT_ITEM);
    }
    private static void genItemModel(ItemModelGenerators itemGen, Item item) {
        itemGen.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }
}
