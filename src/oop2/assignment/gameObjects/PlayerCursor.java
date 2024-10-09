package oop2.assignment.gameObjects;

import java.awt.*;

public class PlayerCursor extends GameObject{

    private int lineThickness;
    private int width;
    private int height;
    private Color color;
    private boolean pulse;


    public PlayerCursor(int x, int y, int tileWidth, int tileHeight, int lineThickness, Color color, boolean pulse) {
        super(x, y);
        this.lineThickness = lineThickness;
        this.width = tileWidth;
        this.height = tileHeight;
        this.color = color;
        this.pulse = pulse;
    }

    /*
        this is only a test implementation
        width and height will be based on grid dimensions
     */
    public PlayerCursor(int x, int y) {
        this(x, y, 20, 20, 1, Color.PINK, false);
    }

    public PlayerCursor() {
        this(10, 10, 50, 50, 1, Color.PINK, false);
    }

    @Override
    public void draw(Graphics2D g) {
        int xoffset = width / 4;
        int yoffset = height / 4;

        g.setStroke(new BasicStroke(lineThickness));
        g.setColor(color);

//        g.drawLine(xpos, ypos, xpos + xoffset, ypos);
//        g.drawLine(xpos, ypos, xpos, ypos + yoffset);
//        g.drawLine(xpos, height - yoffset, xpos, height);
//        g.drawLine(xpos, height, xpos + xoffset, height);
//
//        g.drawLine(width - xoffset, ypos, width, ypos);
//        g.drawLine(width, ypos, width, ypos + yoffset);
//        g.drawLine(width, height - yoffset, width, height);
//        g.drawLine(width - xoffset, height, width, height);
//
//        g.drawLine(width, ypos, width + xoffset , ypos);
//        g.drawLine(width, ypos, width, ypos + yoffset);
//        g.drawLine(width, height - yoffset, width, height);
//        g.drawLine(width, height, width + xoffset, height);
//
//        g.drawLine(width * 2 - xoffset, ypos, width * 2, ypos);
//        g.drawLine(width * 2, ypos, width * 2, ypos + yoffset);
//        g.drawLine(width * 2, height - yoffset, width * 2, height);
//        g.drawLine(width * 2 - xoffset, height, width * 2, height);

        g.setColor(Color.CYAN);
        g.drawLine(xpos, ypos, width, ypos);
        g.drawLine(xpos, ypos, xpos, height);
        g.drawLine(xpos, height, width, height);
        g.drawLine(width, ypos, width, height);

        g.drawLine(width, ypos, width * 2, ypos);
        g.drawLine(width * 2, ypos, xpos, height);
        g.drawLine(xpos, height, width, height);
        g.drawLine(width, ypos, width, height);


    }
}
