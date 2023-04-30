package lol.vera.spigot.implementation;

import lol.vera.spigot.handler.IMovementHandler;
import lol.vera.spigot.handler.IPacketHandler;
import org.bukkit.plugin.java.JavaPlugin;

public interface PacketHandlerImplementation {

    void registerMovementHandlers(JavaPlugin plugin, IMovementHandler... movementHandlers);

    void registerPacketHandlers(JavaPlugin plugin, IPacketHandler... packetHandlers);


    class DEFAULT implements PacketHandlerImplementation {

        @Override
        public void registerMovementHandlers(JavaPlugin plugin, IMovementHandler... movementHandlers) {

        }

        @Override
        public void registerPacketHandlers(JavaPlugin plugin, IPacketHandler... packetHandlers) {

        }

    }

}