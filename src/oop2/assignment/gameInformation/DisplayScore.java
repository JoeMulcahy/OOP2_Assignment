package oop2.assignment.gameInformation;

import javax.swing.*;
import java.awt.*;

public class DisplayScore extends JPanel {
    int score;

    public DisplayScore(){
        score = 0;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D g = (Graphics2D) graphics;

        Font font = new Font("Serif", Font.PLAIN, 24);
        g.setFont(font);
        g.setColor(Color.RED);

        FontMetrics metrics = g.getFontMetrics(font);
        String levelText = "Score: " + String.valueOf(score);

        // Calculate the width and height of the text
        int textWidth = metrics.stringWidth(levelText);
        int textHeight = metrics.getHeight();

        // Calculate the x and y coordinates to center the text
        int x = (getWidth() - textWidth) / 2;
        int y = ((getHeight() - textHeight) / 2) + metrics.getAscent();

        g.drawString(levelText, x, y);

        Toolkit.getDefaultToolkit().sync();
    }

    public void increaseScore(int value){
        score += value;
        repaint();
    }

    public void resetLevel(){
        score = 0;
        repaint();
    }
}
