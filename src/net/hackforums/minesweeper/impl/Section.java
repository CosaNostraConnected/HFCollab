package net.hackforums.minesweeper.impl;

import java.awt.*;
import java.util.Random;

/**
 * Created by Zakary on 8/24/2014.
 *
 * Represents a 'section' within the minesweeper game.
 * cba to javadoc sorry.
 */
public class Section {

    private final int ratio = 10;

    private final int x, y, points;
    private boolean bomb = false;
    private boolean opened = false;

    public Section(int x, int y) {
        this.x = x;
        this.y = y;
        int chance = new Random().nextInt(100);
        if (chance < ratio)
            bomb = true;

        points = new Random().nextInt(10);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isBomb() {
        return bomb;
    }

    public boolean contains(Point point) {
        return new Rectangle(x * 50, y * 50, 50, 50).contains(point);
    }

    public void open() {
        opened = true;
    }

    public boolean isOpened() {
        return opened;
    }

    public int getPoints() {
        return points;
    }

}
