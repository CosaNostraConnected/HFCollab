package net.hackforums.vanilla.zombie;

/**
 * Created by Simon on 2014-08-15.
 */
public class Location {

    int x;
    int y;

    public Location(int X,int Y ) {
        this.x = X;
        this.y = Y;
    }
    @Override
    public String toString() {
        return ("(" + x + "," + y + ")");
    }
}
