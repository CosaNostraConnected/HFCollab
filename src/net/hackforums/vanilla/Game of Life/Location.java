package com.simon987;

public class Location {

    int x;
    int y;

    /**
     * Location class constructor
     * @param X X coordinate
     * @param Y Y coordinate
     */

    /**
     * The function toString overrides  the method in java.lang.Enum
     * @return The location in a cool format
     */
    public Location(int X,int Y ) {
        this.x = X;
        this.y = Y;
    }
    @Override
    public String toString() {
        return ("(" + x + "," + y + ")");
    }
}
