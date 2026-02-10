package net.justmili.mysticcreationsteam.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.justmili.mysticcreationsteam.init.PlushResourceLists;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class MCTBlockLootProvider extends FabricBlockLootSubProvider {
    public MCTBlockLootProvider(FabricPackOutput dataOut, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOut, registryLookup);
    }

    @Override
    public void generate() {
        for (Block plush : PlushResourceLists.getPlushies()) {
            dropSelf(plush);
        }
    }
}
