package net.justmili.lumynitystudios.init;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.justmili.lumynitystudios.mechanics.AnniversaryMessage;

public class Events {
    public static void register() {
        ServerPlayConnectionEvents.JOIN.register(AnniversaryMessage::onWorldJoin);
    }
}
