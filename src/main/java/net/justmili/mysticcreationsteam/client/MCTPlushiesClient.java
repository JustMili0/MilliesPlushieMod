package net.justmili.mysticcreationsteam.client;

import net.fabricmc.api.ClientModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MCTPlushiesClient implements ClientModInitializer {
    public static final String MODID = "mct_plushies";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Coloring the plushies...");
    }
}