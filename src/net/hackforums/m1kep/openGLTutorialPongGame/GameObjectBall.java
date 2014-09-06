package net.hackforums.m1kep.openGLTutorialPongGame;

/**
 * Created by Michael on 9/5/2014.
 */
public class GameObjectBall extends GameObject {

    public static final int SIZE = 16;
    public static final float MAX_SPEEDX = 4f;
    public static final float MAX_SPEEDY = 8f;

    public float velX;
    public float velY;

    public GameObjectBall(float x, float y) {
        this.xPos = x;
        this.yPos = y;
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
}
