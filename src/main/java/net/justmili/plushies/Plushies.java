package net.justmili.plushies;

import net.fabricmc.api.ModInitializer;

import net.justmili.plushies.registries.PlushBlocks;
import net.justmili.plushies.registries.PlushItems;
import net.justmili.plushies.registries.PlushTab;
import net.minecraft.resources.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Plushies implements ModInitializer {
	public static final String MODID = "milliesplushiemod";
	public static final Logger LOGGER = LogManager.getLogger(Plushies.class);

	@Override
	public void onInitialize() {
        LOGGER.info("Grabbing the materials...");
        PlushItems.load();
        LOGGER.info("Sewing the plushies...");
        PlushBlocks.load();
        LOGGER.info("Putting them on display...");
        PlushTab.load();
        LOGGER.info("Millie's Plushies Mod initialized! (Hi)");
	}

    public static Identifier asResource(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}