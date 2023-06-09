package lol.vera.spigot.event;

import com.google.common.base.Preconditions;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class PreCreatureSpawnEvent extends Event implements Cancellable {

    private final Location location;
    private final EntityType type;
    private final CreatureSpawnEvent.SpawnReason reason;
    private boolean shouldAbortSpawn;

    public PreCreatureSpawnEvent(Location location, EntityType type, CreatureSpawnEvent.SpawnReason reason) {
        this.location = Preconditions.checkNotNull(location, "Location may not be null").clone();
        this.type = Preconditions.checkNotNull(type, "Type may not be null");
        this.reason = Preconditions.checkNotNull(reason, "Reason may not be null");
    }

    /**
     * @return The location this creature is being spawned at
     */
    public Location getSpawnLocation() {
        return location;
    }

    /**
     * @return The type of creature being spawned
     */
    public EntityType getType() {
        return type;
    }

    /**
     * @return Reason this creature is spawning (ie, NATURAL vs SPAWNER)
     */
    public CreatureSpawnEvent.SpawnReason getReason() {
        return reason;
    }

    /**
     * @return If the spawn process should be aborted vs trying more attempts
     */
    public boolean shouldAbortSpawn() {
        return shouldAbortSpawn;
    }

    /**
     * Set this if you are more blanket blocking all types of these spawns, and wish to abort the spawn process from
     * trying more attempts after this cancellation.
     *
     * @param shouldAbortSpawn Set if the spawn process should be aborted vs trying more attempts
     */
    public void setShouldAbortSpawn(boolean shouldAbortSpawn) {
        this.shouldAbortSpawn = shouldAbortSpawn;
    }

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    private boolean cancelled = false;

    /**
     * @return If the spawn of this creature is cancelled or not
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Cancelling this event is more effecient than cancelling CreatureSpawnEvent
     * @param cancel true if you wish to cancel this event, and abort the spawn of this creature
     */
    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

}