package net.c0lossu5.test.entity.ai;

import net.minecraft.entity.Entity;

public interface shake {
    @Deprecated
    public float getShakeIntensity(Entity viewer, float partialTicks);

    public default float getShakeIntensity(Entity viewer) {
        return this.getShakeIntensity(viewer, 0);
    }
}
