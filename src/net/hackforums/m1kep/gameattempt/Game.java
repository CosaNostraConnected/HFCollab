package net.hackforums.m1kep.gameattempt;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
public class Game {

    public static void main(String[] args) throws LWJGLException{

        new Game().start();
    }

    public void start() throws LWJGLException{
        Display.setTitle("Test");
        Display.create();

    }
}

