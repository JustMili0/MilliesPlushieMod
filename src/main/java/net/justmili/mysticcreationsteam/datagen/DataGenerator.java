package net.justmili.mysticcreationsteam.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.justmili.mysticcreationsteam.datagen.providers.MCTBlockLootProvider;
import net.justmili.mysticcreationsteam.datagen.providers.MCTModelProvider;
import net.justmili.mysticcreationsteam.datagen.providers.MCTRecipeProvider;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGen) {
        FabricDataGenerator.Pack pack = dataGen.createPack();

        pack.addProvider(MCTBlockLootProvider::new);
        pack.addProvider(MCTRecipeProvider::new);
        pack.addProvider(MCTModelProvider::new);
    }
}
