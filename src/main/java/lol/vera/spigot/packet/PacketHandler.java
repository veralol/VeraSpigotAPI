package lol.vera.spigot.packet;

import org.bukkit.entity.Player;

public interface PacketHandler {

    boolean handleSent(Player player, Object packet);

    boolean handleReceived(Player player, Object packet);

}