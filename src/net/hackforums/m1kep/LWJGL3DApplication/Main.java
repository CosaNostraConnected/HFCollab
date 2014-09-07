package net.hackforums.m1kep.LWJGL3DApplication;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * Created by Michael on 9/7/2014.
 */
public class Main {

    public static void main(String[] args) {
        initDisplay();

        gameLoop();
    }

    private static void gameLoop() {
        while (!Display.isCloseRequested()) {
            Display.update();
        }
    }

    private static void initDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
    }
}
