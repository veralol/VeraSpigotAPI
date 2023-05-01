package lol.vera.spigot.handler;

import net.minecraft.server.Packet;
import net.minecraft.server.PlayerConnection;

public interface IPacketHandler {

    /**
     * @param connection The player who we are sending the packet to
     * @param packet The {@link Packet} which has been sent
     */
    void handleSent(PlayerConnection connection, Packet<?> packet);

    /**
     * @param connection The player who receives the packet
     * @param packet The {@link Packet} which has been received
     */
    void handleReceived(PlayerConnection connection, Packet<?> packet);

}