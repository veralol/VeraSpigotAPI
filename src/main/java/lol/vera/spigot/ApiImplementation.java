package lol.vera.spigot;

import lol.vera.spigot.knockback.KnockbackProfile;

public interface ApiImplementation {

    KnockbackProfile getActiveKnockbackProfile();

    KnockbackProfile getKnockbackProfile(String name);

    void setActiveKnockbackProfile(KnockbackProfile knockbackProfile);

    class DEFAULT implements ApiImplementation {

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

    }

}