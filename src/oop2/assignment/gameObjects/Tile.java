package oop2.assignment.gameObjects;

import java.awt.*;

public class Tile extends GameObject{

    private int width;
    private int height;
    private TileColors tileColor;

    public Tile(int x, int y, int width, int height, TileColors tileColor) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.tileColor = tileColor;
    }

    @Override
    public void draw(Graphics2D g) {
        Color outline;
        Color background;

        switch(tileColor){
            case RED -> {
                background = new Color(201, 14, 14);
                outline = new Color(255, 50, 50);
            }
            case BLUE -> {
                background = new Color(14, 14, 201);
                outline = new Color(50, 50, 255);
            }
            case GREEN -> {
                background = new Color(14, 201, 14);
                outline = new Color(50, 255, 50);
            }
            case YELLOW -> {
                background = new Color(211, 224, 29);
                outline = new Color(228, 242, 27);
            }
            default -> {
                background = new Color(0, 0, 0);
                outline = new Color(100, 100, 100);
            }
        }

        g.setColor(background);
        g.fillRect(xpos, ypos, width, height);

        g.setStroke(new BasicStroke(3));
        g.setColor(outline);
        g.drawRect(xpos, ypos, width, height);
    }
}
