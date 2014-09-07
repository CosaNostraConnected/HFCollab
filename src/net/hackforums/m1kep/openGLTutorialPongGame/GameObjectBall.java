package net.hackforums.m1kep.openGLTutorialPongGame;

/**
 * Created by Michael on 9/5/2014.
 */
public class GameObjectBall extends GameObject {

    public static final int SIZE = 16;
    public static final float MAX_SPEEDX = 4f;
    public static final float MAX_SPEEDY = 8f;
    public static final float DAMPING = 0.05f;

    public float velX;
    public float velY;

    public float startX;
    public float startY;

    public GameObjectBall(float x, float y) {
        this.xPos = x;
        this.yPos = y;

        startX = x;
        startY = y;

        this.sizeX = SIZE;
        this.sizeY = SIZE;

        velX = -MAX_SPEEDX;
        velY = 0;
    }

    @Override
    public void update() {
        xPos += velX;
        yPos += velY;
    }

    public void resetPosition() {
        xPos = startX;
        yPos = startY;

        velY = 0;
        velX *= -1;
    }

    public void paddleBounce(float center) {
        velX *= -1;
        velY += (getCenterY() - center) * DAMPING;

        if (velY > MAX_SPEEDY)
            velY = MAX_SPEEDY;
        else if (velY < -MAX_SPEEDY)
            velY = -MAX_SPEEDY;
    }

    public void wallBounce() {
        velY *= -1;
    }
}
