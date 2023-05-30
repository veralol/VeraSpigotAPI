package lol.vera.spigot.packet;

import org.bukkit.entity.Player;

public interface PacketHandler {

    void handleSent(Player player, Object packet);

    void handleReceived(Player player, Object packet);

}