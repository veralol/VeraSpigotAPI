package org.bukkit.event.inventory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

@Getter
@RequiredArgsConstructor
public class EquipmentSetEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final HumanEntity humanEntity;
    private final int slot;
    private final ItemStack previousItem;
    private final ItemStack newItem;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}