package net.justmili.mysticcreationsteam.fdaapi;

import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.justmili.mysticcreationsteam.MCTPlushies;

public final class DataAttachments {
    public static final AttachmentType<Boolean> ANNIVERSARY_MESSAGE_RECEIVED =
        AttachmentRegistry.<Boolean>builder().initializer(() -> false)
            .persistent(Codec.BOOL)
            .copyOnDeath()
            .buildAndRegister(MCTPlushies.asResource("anniversary_message_received"));

    private DataAttachments() {}
}
