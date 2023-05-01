package lol.vera.spigot.handler;

import net.minecraft.server.PacketPlayInFlying;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface IMovementHandler {

    /**
     * @param player The {@link Player} who has moved
     * @param to The {@link Location} the player came from
     * @param from The {@link Location} the player is going to
     * @param packet The {@link PacketPlayInFlying} flying packet
     */
    void handleMove(Player player, Location to, Location from, PacketPlayInFlying packet);

}