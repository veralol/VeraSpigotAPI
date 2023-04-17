package lol.vera.spigot.knockback;

public interface KnockbackProfile {

    String getName();

    double getFriction();

    double getVertical();

    double getHorizontal();

    double getVerticalLimit();

    double getExtraVertical();

    double getExtraHorizontal();

    double getEntitySlowdown();

    double getDamageTicks();

    boolean isAutoWTap();

    boolean isOnePointSeven();

    double getRodSpeed();

    double getBowSpeed();

    double getPearlSpeed();

    double getPotionSpeed();

    double getPotionIntensity();

    double getPotionOffset();

    double getPotionDistance();

    Integer getPotionTicks();

}