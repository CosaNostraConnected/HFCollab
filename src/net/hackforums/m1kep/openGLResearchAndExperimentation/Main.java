package net.hackforums.m1kep.openGLResearchAndExperimentation;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.glDisable;

/**
 * Created by Michael on 9/5/2014.
 */
public class Main {
    public static void main(String[] args) {

        initDisplay();
        initGL();

        while (!Display.isCloseRequested()) {
            glClear(GL_COLOR_BUFFER_BIT);
            glLoadIdentity();
            Random rnd = new Random();
            glColor3f(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));

            glPushMatrix();
            {
                glBegin(GL_QUADS);
                {

                    Draw.rect(250, 250, 250, 250);

                }
            }
            glPopMatrix();
            Display.update();
            Display.sync(60);
        }
    }

    private static void initGL() {

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
        glMatrixMode(GL_MODELVIEW);
        glClearColor(0, 0, 0, 1);
        glDisable(GL_DEPTH_TEST);

    }

    private static void initDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();
            Display.setVSyncEnabled(true);

            Keyboard.create();
        } catch (LWJGLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
