package net.hackforums.minesweeper.impl;

import net.hackforums.minesweeper.Minesweeper;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Zakary on 8/24/2014.
 *
 * Represents a "section" within the minesweeper game.
 * cba to javadoc sorry.
 */
public class Section {

    private final int ratio = 10;

    private final int x, y, points;
    private boolean bomb = false;
    private boolean opened = false;
    private boolean hasHeart = false;
    private Minesweeper game;

    public Section(int x, int y, Minesweeper game) {
        this.x = x;
        this.y = y;
        this.game = game;
        int chance = new Random().nextInt(100);
        if (chance < ratio)
            bomb = true;

        if (!bomb) {
            chance = new Random().nextInt(100);
            if (chance < 10)
                hasHeart = true;
        }

        points = new Random().nextInt(10);
    }

    public boolean containsHeart() {
        return hasHeart;
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

    public void open(ArrayList<Section> sections, boolean area) {
        if (isOpened()) {
            return;
        }
        if (isBomb()) {
           GlobalVars.lives--;
            if (GlobalVars.lives == 0) {
                game.reset(true);
                return;
            }
        } else {
            GlobalVars.points += getPoints();
            if (hasHeart &&
                    GlobalVars.lives <= 5) {
                GlobalVars.lives++;
            }
        }
        opened = true;
        if (area) {
            int x = new Random().nextInt(10);
            killx: for (int i = 0; i < x; i++) {
                for (Section section : sections) {
                    if (section.getY() == getY()) {
                        if (section.getX() == (getX()) + i) {
                            if (section.isBomb()) {
                                break killx;
                            } else if (section.isOpened()) {
                                continue killx;
                            } else {
                                section.open(sections, false);
                            }
                        }
                    }
                }
            }
            int y = new Random().nextInt(10);
            killy: for (int i = 0; i < y; i++) {
                for (Section section : sections) {
                    if (section.getX() == getX()) {
                        if (section.getY() == (getY()) + i) {
                            if (section.isBomb()) {
                                break killy;
                            } else if (section.isOpened()) {
                                continue killy;
                            } else {
                                section.open(sections, false);
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean isOpened() {
        return opened;
    }

    public int getPoints() {
        return points;
    }

}
