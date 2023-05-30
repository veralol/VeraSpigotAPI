package lol.vera.spigot;

import lol.vera.spigot.implementation.KnockbackImplementation;
import lol.vera.spigot.implementation.SpigotImplementation;
import lombok.Data;

@Data
public class VeraSpigotAPI {

    public static VeraSpigotAPI INSTANCE = new VeraSpigotAPI();

    private KnockbackImplementation knockback
            = new KnockbackImplementation.DEFAULT();

    private SpigotImplementation spigot
            = new SpigotImplementation.DEFAULT();

}