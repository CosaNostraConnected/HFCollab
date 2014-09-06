package net.hackforums.m1kep.openGLTutorialPongGame;

import java.awt.*;

/**
 * Created by Michael on 9/5/2014.
 */
public class Physics {

    public static boolean checkCollisions(GameObject go1, GameObject go2) {

        Rectangle r1 = new Rectangle((int) go1.getxPos(), (int)go1.getyPos(), (int) go1.getSizeX(), (int) go1.getSizeY());
        Rectangle r2 = new Rectangle((int) go2.getxPos(), (int)go2.getyPos(), (int) go2.getSizeX(), (int) go2.getSizeY());

        return r1.intersects(r2);
    }
}
