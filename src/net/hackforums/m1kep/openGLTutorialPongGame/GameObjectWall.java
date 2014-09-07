package net.hackforums.m1kep.openGLTutorialPongGame;

/**
 * Created by Michael on 9/6/2014.
 */
public class GameObjectWall extends GameObject {

    public static final int STDSIZE = 16;
    private GameObjectBall ball;

    public GameObjectWall(float x, float y, float sx, float sy, GameObjectBall ball) {
        this.xPos = x;
        this.yPos = y;
        this.sizeX = sx;
        this.sizeY = sy;
        this.ball = ball;
    }

    @Override
    void update() {
        if (Physics.checkCollisions(this, ball)) {
            ball.wallBounce();
        }
    }
}
