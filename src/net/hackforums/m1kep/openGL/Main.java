package net.hackforums.m1kep.openGL;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;


import java.util.logging.Level;
import java.util.logging.Logger;

import static org.lwjgl.opengl.GL11.*;

/**
 * Created by Michael on 9/5/2014.
 */
public class Main {

    public static void main(String[] args) {
        initDisplay();
        initGL();
        gameLoop();
        cleanUp();
    }

    private static void gameLoop() {

        while (!Display.isCloseRequested()) {

            glClear(GL_COLOR_BUFFER_BIT);

            glBegin(GL_QUADS);
            {
                //What is this? Why the curly braces?
            }
            glEnd();

            Display.update();
        }

    }

    private static void initGL() {

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
        glMatrixMode(GL_MODELVIEW);
        glClearColor(0,0,0,1);
        glDisable(GL_DEPTH_TEST);

    }

    private static void cleanUp() {
    }

    private static void initDisplay() {

        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();
        } catch (LWJGLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
