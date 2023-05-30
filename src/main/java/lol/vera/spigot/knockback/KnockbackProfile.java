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

    void setName(String name);

    void setFriction(double friction);

    void setVertical(double vertical);

    void setHorizontal(double horizontal);

    void setVerticalLimit(double verticalLimit);

    void setExtraVertical(double extraVertical);

    void setExtraHorizontal(double extraHorizontal);

    void setEntitySlowdown(double entitySlowdown);

    void setDamageTicks(double damageTicks);

    void setAutoWTap(boolean autoWTap);

    void setOnePointSeven(boolean onePointSeven);

    void setRodSpeed(double rodSpeed);

    void setBowSpeed(double bowSpeed);

    void setPearlSpeed(double pearlSpeed);

    void setPotionSpeed(double potionSpeed);

    void setPotionIntensity(double potionIntensity);

    void setPotionOffset(double potionOffset);

    void setPotionDistance(double potionDistance);

    void setPotionTicks(Integer potionTicks);

}