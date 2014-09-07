package net.hackforums.m1kep.openGLTutorialPongGame;

/**
 * Created by Michael on 9/6/2014.
 */
public class GameObjectPlayer extends GameObject {

    public static final int SIZEX = 16;
    public static final int SIZEY = SIZEX * 7;
    public static final float MAX_SPEEDY = 4f;
    private GameObjectBall ball;

    public GameObjectPlayer(float x, float y, GameObjectBall ball) {
        this.xPos = x;
        this.yPos = y;
        this.sizeX = SIZEX;
        this.sizeY = SIZEY;
        this.ball = ball;
    }

    @Override
    void update() {
        if (Physics.checkCollisions(this, ball))
            ball.paddleBounce(getCenterY());
    }

    public void move(float mag) {
        yPos += MAX_SPEEDY * mag;
    }
}
