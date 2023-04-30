package lol.vera.spigot;

import lol.vera.spigot.implementation.PacketHandlerImplementation;
import lol.vera.spigot.implementation.KnockbackImplementation;
import lombok.Data;


@Data
public class VeraSpigotAPI {

    public static VeraSpigotAPI INSTANCE = new VeraSpigotAPI();

    private KnockbackImplementation knockback
            = new KnockbackImplementation.DEFAULT();

    private PacketHandlerImplementation packetHandler
            = new PacketHandlerImplementation.DEFAULT();

}