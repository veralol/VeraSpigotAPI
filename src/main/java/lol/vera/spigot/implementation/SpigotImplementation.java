package lol.vera.spigot.implementation;

import lol.vera.spigot.packet.MovementHandler;
import lol.vera.spigot.packet.PacketHandler;
import org.bukkit.plugin.java.JavaPlugin;

public interface SpigotImplementation {

    void registerPacketHandler(JavaPlugin plugin, PacketHandler handler);

    void registerMovementHandler(JavaPlugin plugin, MovementHandler handler);

    class DEFAULT implements SpigotImplementation {

        @Override
        public void registerPacketHandler(JavaPlugin plugin, PacketHandler handler) {
        }

        @Override
        public void registerMovementHandler(JavaPlugin plugin, MovementHandler handler) {
        }

    }

}