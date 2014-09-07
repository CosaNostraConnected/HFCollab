package net.hackforums.m1kep.openGLTutorialPongGame;


import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import java.util.ArrayList;

/**
 * Created by Michael on 9/5/2014.
 */
public class Game {

    private ArrayList<GameObject> objects;
    private GameObjectPlayer player;
    private GameObjectBall ball;
    private int playerScore;
    private int enemyScore;
    private GameObjectWall bottomWall, topWall;

    public Game() {
        objects = new ArrayList<GameObject>();

        ball = new GameObjectBall(Display.getWidth() / 2 - GameObjectBall.SIZE / 2, Display.getHeight() / 2 - GameObjectBall.SIZE / 2);
        player = new GameObjectPlayer(0, Display.getHeight() / 2 - GameObjectPlayer.SIZEY / 2, ball);
        GameObjectEnemy enemy = new GameObjectEnemy(Display.getWidth() - GameObjectEnemy.SIZEX, Display.getHeight() / 2 - GameObjectPlayer.SIZEY / 2, ball);
        bottomWall = new GameObjectWall(0, 0, Display.getWidth(), GameObjectWall.STDSIZE, ball);
        topWall = new GameObjectWall(0, Display.getHeight() - GameObjectWall.STDSIZE, Display.getWidth(), GameObjectWall.STDSIZE, ball);

        objects.add(ball);
        objects.add(player);
        objects.add(enemy);
        objects.add(bottomWall);
        objects.add(topWall);
    }

    public void getInput() {
        if (Keyboard.isKeyDown(Keyboard.KEY_W) || Keyboard.isKeyDown(Keyboard.KEY_UP)) {
            if (player.yPos < ((Display.getHeight() - topWall.getSizeY()) - player.sizeY))
                player.move(1);
        } else if (Keyboard.isKeyDown(Keyboard.KEY_S) || Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
            if (player.yPos > bottomWall.getSizeY())
                player.move(-1);
        }
    }

    public void update() {

        for (GameObject go : objects) {
            go.update();
        }
        if (ball.getxPos() > Display.getWidth()) {
            playerScore++;
            ball.resetPosition();
        } else if (ball.getxPos() < 0) {
            enemyScore++;
            ball.resetPosition();
        }
    }

    public void render() {
        for (GameObject go : objects) {
            go.render();

            Display.setTitle("Player Score: " + playerScore + "Enemy Score: " + enemyScore);
        }
    }
}
