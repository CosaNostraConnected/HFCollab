package net.hackforums.m1kep.openGLTutorialPongGame;


import org.lwjgl.opengl.Display;

import java.util.ArrayList;

/**
 * Created by Michael on 9/5/2014.
 */
public class Game {

    private ArrayList<GameObject> objects;

    public Game() {
        objects = new ArrayList<GameObject>();
        GameObjectBall ball = new GameObjectBall(Display.getWidth() / 2 - GameObjectBall.SIZE / 2, Display.getHeight() / 2 - GameObjectBall.SIZE /2);
        objects.add(ball);
    }

    public void getInput() {

    }

    public void update() {

        for (GameObject go : objects) {
            go.update();
        }
    }

    public void render() {
        for (GameObject go : objects) {
            go.render();
        }
    }
}
