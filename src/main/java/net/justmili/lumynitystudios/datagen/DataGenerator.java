package net.justmili.lumynitystudios.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.justmili.lumynitystudios.datagen.providers.LSBlockLootProvider;
import net.justmili.lumynitystudios.datagen.providers.LSModelProvider;
import net.justmili.lumynitystudios.datagen.providers.LSRecipeProvider;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGen) {
        FabricDataGenerator.Pack pack = dataGen.createPack();

        pack.addProvider(LSBlockLootProvider::new);
        pack.addProvider(LSRecipeProvider::new);
        pack.addProvider(LSModelProvider::new);
    }
}
