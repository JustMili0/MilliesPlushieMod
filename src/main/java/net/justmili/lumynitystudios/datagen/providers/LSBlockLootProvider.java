package net.justmili.lumynitystudios.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.justmili.lumynitystudios.init.PlushResourceLists;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class LSBlockLootProvider extends FabricBlockLootSubProvider {
    public LSBlockLootProvider(FabricPackOutput dataOut, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOut, registryLookup);
    }

    @Override
    public void generate() {
        for (Block plush : PlushResourceLists.getPlushies()) {
            dropSelf(plush);
        }
    }
}
