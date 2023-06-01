package org.bukkit.event.entity;

import lombok.Getter;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.potion.PotionEffect;

@Getter
public abstract class PotionEffectEvent extends EntityEvent {

    private final PotionEffect effect;

    public PotionEffectEvent(LivingEntity what, PotionEffect effect) {
        super(what);
        this.effect = effect;
    }

    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) super.getEntity();
    }

}