package lol.vera.spigot.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PrePlayerDeathEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;

    public PrePlayerDeathEvent(Player who) {
        super(who);
    }

    /**
     * @return If the death of this player is cancelled or not
     */
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * Set whether the event should be cancelled
     * @param cancel true if you wish to cancel this event
     */
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}