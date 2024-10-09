package oop2.assignment.gameObjects;

import java.awt.*;

public abstract class GameObject {

    protected int xpos;
    protected int ypos;

    public GameObject(int x, int y){
        xpos = x;
        ypos = y;
    }

    public abstract void draw(Graphics2D g);

}
