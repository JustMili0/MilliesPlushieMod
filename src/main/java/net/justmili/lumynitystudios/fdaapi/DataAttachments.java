package net.justmili.lumynitystudios.fdaapi;

import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.justmili.lumynitystudios.LSPlushies;

public final class DataAttachments {
    public static final AttachmentType<Boolean> ANNIVERSARY_MESSAGE_RECEIVED =
        AttachmentRegistry.<Boolean>builder().initializer(() -> false)
            .persistent(Codec.BOOL)
            .copyOnDeath()
            .buildAndRegister(LSPlushies.asResource("anniversary_message_received"));

    private DataAttachments() {}
}
