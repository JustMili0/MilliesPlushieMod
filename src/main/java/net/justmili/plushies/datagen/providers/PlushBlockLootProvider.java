package net.justmili.plushies.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.justmili.plushies.registries.PlushBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class PlushBlockLootProvider extends FabricBlockLootSubProvider {
    public PlushBlockLootProvider(FabricPackOutput dataOut, CompletableFuture<HolderLookup.Provider> future) {
        super(dataOut, future);
    }

    @Override
    public void generate() {
        for (Block plush : PlushBlocks.getPlushies()) {
            dropSelf(plush);
        }
    }
}
