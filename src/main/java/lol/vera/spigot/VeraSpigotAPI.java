package lol.vera.spigot;

import lol.vera.spigot.implementation.ApiImplementation;
import lombok.Data;


@Data
public class VeraSpigotAPI {

    public static VeraSpigotAPI INSTANCE = new VeraSpigotAPI();

    private ApiImplementation implementation = new ApiImplementation.DEFAULT();

}