package net.hackforums.m1kep.openGLTutorialPongGame;

/**
 * Created by Michael on 9/5/2014.
 */
public abstract class GameObject {

    protected float xPos;
    protected float yPos;
    protected float sizeX;
    protected float sizeY;

    abstract void update();
    public void render(){

        Draw.rect(xPos,yPos,sizeX,sizeY);

    }

    public float getxPos() {
        return xPos;
    }

    public float getyPos() {
        return yPos;
    }

    public float getSizeX() {
        return sizeX;
    }

    public float getSizeY() {
        return sizeY;
    }

    public float getCenterY(){
        return yPos + (sizeY/2);
    }
}
