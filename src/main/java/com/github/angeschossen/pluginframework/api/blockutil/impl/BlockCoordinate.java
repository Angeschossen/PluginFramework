package com.github.angeschossen.pluginframework.api.blockutil.impl;


import org.bukkit.Location;

public class BlockCoordinate {
    public int x, y, z;

    public BlockCoordinate(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public BlockCoordinate(Location location) {
        this(location.getBlockX(), location.getBlockY(), location.getBlockZ());
    }

    public final boolean equals(int x, int y, int z) {
        return this.x == x && this.y == y && this.z == z;
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof BlockCoordinate)) {
            return false;
        }

        BlockCoordinate coordinate = (BlockCoordinate) object;
        return equals(coordinate.x, coordinate.y, coordinate.z);
    }

    @Override
    public final int hashCode() {
        int hash = 17;
        hash = hash * 31 + x;
        hash = hash * 31 + y;
        hash = hash * 31 + z;
        return hash;
    }

    @Override
    public final String toString() {
        return "Coordinate{x=" + this.x + ",y=" + this.y + ",z=" + this.z + '}';
    }
}
