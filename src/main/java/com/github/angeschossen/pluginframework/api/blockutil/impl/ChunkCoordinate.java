package com.github.angeschossen.pluginframework.api.blockutil.impl;

import java.util.Objects;

public class ChunkCoordinate implements com.github.angeschossen.pluginframework.api.blockutil.ChunkCoordinate {

    private final int x, z;

    public ChunkCoordinate(int x, int z) {
        this.x = x;
        this.z = z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, z);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ChunkCoordinate)) {
            return false;
        }

        ChunkCoordinate coordinate = (ChunkCoordinate) object;
        return coordinate.x == x && coordinate.z == z;
    }
}
