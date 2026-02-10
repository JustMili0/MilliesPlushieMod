package net.justmili.mysticcreationsteam.mechanics;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.justmili.mysticcreationsteam.fdaapi.DataAttachments;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AnniversaryMessage { // TODO - FIX BECAUSE IT DOESN'T SEND
    //private static final LocalDate TEAM_FOUNDING_DATE = LocalDate.of(2025, Month.AUGUST, 19);
    /// TEST DATE
    private static final LocalDate TEAM_FOUNDING_DATE = LocalDate.of(2025, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());

    public static void onWorldJoin(ServerGamePacketListenerImpl listener, PacketSender sender, MinecraftServer server) {
        ServerPlayer player = listener.player;
        LocalDate today = LocalDate.now();

        boolean isAnniversary = today.getMonth() == Month.AUGUST && today.getDayOfMonth() == 19;
        if (!isAnniversary) {
            player.setAttached(DataAttachments.ANNIVERSARY_MESSAGE_RECEIVED, false);
            return;
        }
        boolean alreadyReceived = Boolean.TRUE.equals(player.getAttached(DataAttachments.ANNIVERSARY_MESSAGE_RECEIVED));
        if (alreadyReceived) return;
        long years = ChronoUnit.YEARS.between(TEAM_FOUNDING_DATE, today);
        if (years <= 0) return;

        sendMessage(player, years);
        player.setAttached(DataAttachments.ANNIVERSARY_MESSAGE_RECEIVED, true);
    }

    private static String ordinal(long number) {
        if (number % 100 >= 11 && number % 100 <= 13) {
            return "th";
        }
        return switch ((int) (number % 10)) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }
    private static void sendMessage(ServerPlayer player, long years) {
        String suffix = ordinal(years);

        player.sendSystemMessage(
            Component.literal(
                "The §5Mystic Creations Team§r is celebrating its §n"+years+suffix +"§r anniversary!\n" +
                    "Thank you for downloading our mods and supporting us §c<3§r"
            )
        );
    }
}
