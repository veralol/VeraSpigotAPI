package lol.vera.spigot.packet;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface MovementHandler {

    /**
     * @param player The {@link Player} who has moved
     * @param to The {@link Location} the player came from
     * @param from The {@link Location} the player is going to
     * @param packet The flying packet
     */
    void handleMove(Player player, Location to, Location from, Object packet);

}