package net.justmili.lumynitystudios;

import net.fabricmc.api.ModInitializer;

import net.justmili.lumynitystudios.init.Events;
import net.justmili.lumynitystudios.init.PlushBlocks;
import net.justmili.lumynitystudios.init.PlushItems;
import net.justmili.lumynitystudios.init.PlushTab;
import net.minecraft.resources.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LSPlushies implements ModInitializer {
	public static final String MODID = "lumynity_plushies";
	public static final Logger LOGGER = LogManager.getLogger(LSPlushies.class);

	@Override
	public void onInitialize() {
		LOGGER.info("Sewing the plushies...");
        PlushBlocks.load();
        PlushItems.load();
        PlushTab.load();
        Events.register();
	}

    public static Identifier asResource(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}