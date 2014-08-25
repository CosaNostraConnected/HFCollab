package net.hackforums.m1kep.learninglwjgl;


import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;


public class Game {

    public static final boolean VSYNC = true;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;


    public static final boolean FULLSCREEN = false;

    protected boolean isRunning = false;


    public static void main(String[] args) throws LWJGLException {

        new Game().start();
    }

    public void start(){
        try {
            Display.setTitle("openGL learning!");
            Display.setResizable(true);
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.setVSyncEnabled(VSYNC);
            Display.setFullscreen(FULLSCREEN);

            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        create();

        resize();

        isRunning = true;

        while (isRunning && !Display.isCloseRequested()) {
            if (Display.wasResized()) {
                resize();

                render();

                Display.update();
                Display.sync(60);

            }

        }
        dispose();
        Display.destroy();

    }

    protected void create() {
        glDisable(GL_DEPTH_TEST);

        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

        glClearColor(1f, 0f, 0f, 1f);

    }

    public void exit() {
        isRunning = false;
    }

    protected void render() {

        glClear(GL_COLOR_BUFFER_BIT);
    }

    protected void resize() {
        glViewport(0, 0, Display.getWidth(), Display.getHeight());

    }

    protected void dispose() {

    }
}

