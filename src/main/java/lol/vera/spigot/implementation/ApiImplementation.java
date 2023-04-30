package lol.vera.spigot.implementation;

import lol.vera.spigot.handler.IMovementHandler;
import lol.vera.spigot.handler.IPacketHandler;
import lol.vera.spigot.knockback.KnockbackProfile;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public interface ApiImplementation {

    void registerMovementHandlers(JavaPlugin plugin, IMovementHandler... movementHandlers);

    void registerPacketHandlers(JavaPlugin plugin, IPacketHandler... packetHandlers);

    KnockbackProfile getActiveKnockbackProfile();

    KnockbackProfile getKnockbackProfile(String name);

    void setActiveKnockbackProfile(KnockbackProfile knockbackProfile);

    void setActiveKnockbackProfile(Player player, KnockbackProfile knockbackProfile);

    class DEFAULT implements ApiImplementation {

        @Override
        public void registerMovementHandlers(JavaPlugin plugin, IMovementHandler... movementHandlers) {

        }

        @Override
        public void registerPacketHandlers(JavaPlugin plugin, IPacketHandler... packetHandlers) {

        }

        @Override
        public KnockbackProfile getActiveKnockbackProfile() {
            return null;
        }

        @Override
        public KnockbackProfile getKnockbackProfile(String name) {
            return null;
        }

        @Override
        public void setActiveKnockbackProfile(KnockbackProfile knockbackProfile) {

        }

        @Override
        public void setActiveKnockbackProfile(Player player, KnockbackProfile knockbackProfile) {

        }

    }

}