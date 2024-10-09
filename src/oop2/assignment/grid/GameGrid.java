package oop2.assignment.grid;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameGrid extends Grid{

    private Color gridLineColor;
    private Color backgroundColor;
    private BufferedImage backgroundImage;
    private java.util.List<String> imagePath;

    public GameGrid(int gridWidth, int gridHeight, int numberOfColumns, int numberOfRows, int gridLineThickness, boolean isVisible) {
        super(gridWidth, gridHeight, numberOfColumns, numberOfRows, gridLineThickness, isVisible);
        gridLineColor = Color.WHITE;
        backgroundColor = Color.black;

        /*
        TO DO: create a txt file with image paths and load them based on the level
        Test Code:
            String imagePath = "C:/Users/josep/Desktop/Software Design in Digital Transformation/Semester 2/Object orientated programming 2/OOP Project/OOP2_aasignment/images/space1.png";

            try{
                backgroundImage = ImageIO.read(new File(imagePath));
            }catch (IOException e){
                System.out.println("Can't load image");
            }

            this code work to draw a png as the gris background
        */
    }

    @Override
    public void draw(Graphics2D g) {
        drawBackground(g);
        //drawBackgroundImage(g);
        if(isVisible){
            drawGrid(g);
        }

    }

    private void drawBackgroundImage(Graphics2D g){
        g.drawImage(backgroundImage, 0, 0, gridWidth, gridHeight, null);

    }
    private void drawBackground(Graphics2D g){
        g.setColor(backgroundColor);
        g.fillRect(0, 0, gridWidth, gridHeight);
    }

    private void drawGrid(Graphics2D g){
        g.setStroke(new BasicStroke((float)gridLineThickness));
        g.setColor(gridLineColor);

        for(int i = 0; i <= getNumberOfColumns(); i++){
            g.drawLine(i * cellWidth, 0, i * cellWidth, gridHeight);
        }

        for(int i = 0; i <= getNumberOfRows(); i++){
            g.drawLine(0, i * cellHeight, gridWidth, i * cellHeight);
        }
    }
}
