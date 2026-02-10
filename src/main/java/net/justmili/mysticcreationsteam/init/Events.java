package net.justmili.mysticcreationsteam.init;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.justmili.mysticcreationsteam.mechanics.AnniversaryMessage;

public class Events {
    public static void register() {
        ServerPlayConnectionEvents.JOIN.register(AnniversaryMessage::onWorldJoin);
    }
}
