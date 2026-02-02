package net.justmili.mysticcreationsteam;

import net.fabricmc.api.ModInitializer;

import net.justmili.mysticcreationsteam.init.PlushBlocks;
import net.justmili.mysticcreationsteam.init.PlushItems;
import net.justmili.mysticcreationsteam.init.PlushTab;
import net.minecraft.resources.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MCTPlushies implements ModInitializer {
	public static final String MODID = "mct_plushies";
	public static final Logger LOGGER = LogManager.getLogger(MCTPlushies.class);

	@Override
	public void onInitialize() {
		LOGGER.info("Sewing the plushies...");
        PlushBlocks.load();
        PlushItems.load();
        PlushTab.load();
	}

    public static Identifier asResource(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
    public static Identifier asModelResource(String path) {
        return Identifier.parse(path);
    }
}