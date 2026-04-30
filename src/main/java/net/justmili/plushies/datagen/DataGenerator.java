package net.justmili.plushies.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.justmili.plushies.datagen.providers.PlushBlockLootProvider;
import net.justmili.plushies.datagen.providers.PlushModelProvider;
import net.justmili.plushies.datagen.providers.PlushRecipeProvider;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGen) {
        FabricDataGenerator.Pack pack = dataGen.createPack();

        pack.addProvider(PlushBlockLootProvider::new);
        pack.addProvider(PlushRecipeProvider::new);
        pack.addProvider(PlushModelProvider::new);
    }
}
