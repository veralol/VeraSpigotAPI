package lol.vera.spigot.implementation;

import lol.vera.spigot.knockback.KnockbackProfile;
import org.bukkit.entity.Player;

public interface KnockbackImplementation {

    KnockbackProfile getActiveKnockbackProfile();

    KnockbackProfile getKnockbackProfile(String name);

    void setActiveKnockbackProfile(KnockbackProfile knockbackProfile);

    void setActiveKnockbackProfile(Player player, KnockbackProfile knockbackProfile);

    void createKnockbackProfile(String name);

    class DEFAULT implements KnockbackImplementation {

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

        @Override
        public void createKnockbackProfile(String name) {

        }

    }

}