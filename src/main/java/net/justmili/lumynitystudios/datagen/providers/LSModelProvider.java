package net.justmili.lumynitystudios.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.justmili.lumynitystudios.LSPlushies;
import net.justmili.lumynitystudios.init.PlushResourceLists;
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

public class LSModelProvider extends FabricModelProvider {
    public LSModelProvider(FabricPackOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockGen) {
        //Generate only Blockstates
        for (Block plush : PlushResourceLists.getPlushies()) {
            genBlockstates(blockGen, plush);
        }
    }
    @Override
    public void generateItemModels(ItemModelGenerators itemGen) {
        //Generate Item Models (Flat, "GENERATED")
        for (Block plush : PlushResourceLists.getPlushies()) {
            genItemModel(itemGen, plush);
        }
    }

    //Helper Methods
    private static void genBlockstates(BlockModelGenerators blockGen, Block block) {
        blockGen.blockStateOutput.accept(createPlushBlockstates(block));
    }
    private static BlockModelDefinitionGenerator createPlushBlockstates(Block plushBlock) {
        Identifier id = LSPlushies.asResource("block/" + BuiltInRegistries.BLOCK.getKey(plushBlock).getPath());
        MultiVariant model = BlockModelGenerators.plainVariant(id);

        return MultiVariantGenerator.dispatch(plushBlock)
            .with(PropertyDispatch.initial(HorizontalDirectionalBlock.FACING)
                .select(Direction.NORTH, model)
                .select(Direction.EAST,  model.with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.SOUTH, model.with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.WEST,  model.with(BlockModelGenerators.Y_ROT_270))
            );
    }
    private static void genItemModel(ItemModelGenerators itemGen, Block block) {
        itemGen.generateFlatItem(Item.byBlock(block), ModelTemplates.FLAT_ITEM);
    }
}
