package org.bukkit.event.entity;

import lombok.Getter;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;

/**
 * Called when an entity's active potion effect is extended or upgraded.
 *
 * Handlers of {@link PotionEffectAddEvent} will also receive this event.
 */

@Getter
public class PotionEffectExtendEvent extends PotionEffectAddEvent {

    private final PotionEffect oldEffect;

    public PotionEffectExtendEvent(LivingEntity what, PotionEffect effect, EffectAddReason reason, PotionEffect oldEffect) {
        super(what, effect, reason);
        this.oldEffect = oldEffect;
    }

}