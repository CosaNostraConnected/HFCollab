package net.hackforums.m1kep.openGLTutorialPongGame;

/**
 * Created by Michael on 9/6/2014.
 */
public class GameObjectEnemy extends GameObject {

    public static final int SIZEX = 16;
    public static final int SIZEY = SIZEX * 7;
    public static final float MAX_SPEEDY = 4f;
    public static final float DAMPING = 0.15f;

    private GameObjectBall ball;

    public GameObjectEnemy(float x, float y, GameObjectBall ball) {
        this.xPos = x;
        this.yPos = y;
        this.sizeX = SIZEX;
        this.sizeY = SIZEY;
        this.ball = ball;
    }

    @Override
    public void update() {
        if (Physics.checkCollisions(this, ball))
            ball.paddleBounce(getCenterY());

        float speed = (ball.getCenterY() - getCenterY()) * DAMPING;

        if (speed > MAX_SPEEDY)
            speed = MAX_SPEEDY;
        else if (speed < -MAX_SPEEDY)
            speed = -MAX_SPEEDY;

        yPos += speed;
    }
}
