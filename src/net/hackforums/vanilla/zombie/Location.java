package net.hackforums.vanilla.zombie;

public class Location {

    int x;
    int y;

    /**
     * Location class constructor
     * @param X X coordinate
     * @param Y Y coordinate
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
