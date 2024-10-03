package oop2.assignment.grid;

import java.awt.*;

public class GameGrid extends Grid{

    private Color gridLineColor;

    public GameGrid(int gridWidth, int gridHeight, int numberOfColumns, int numberOfRows, int gridLineThickness, boolean isVisible) {
        super(gridWidth, gridHeight, numberOfColumns, numberOfRows, gridLineThickness, isVisible);
        gridLineColor = Color.BLUE;

    }

    @Override
    public Graphics2D draw(Graphics2D g) {
        g.setStroke(new BasicStroke((float)gridLineThickness));
        g.setColor(gridLineColor);

        for(int i = 0; i <= getNumberOfColumns(); i++){
            g.drawLine(i * cellWidth, 0, i * cellWidth, gridHeight);
        }

        for(int i = 0; i <= getNumberOfRows(); i++){
            g.drawLine(0, i * cellHeight, gridWidth, i * cellHeight);
        }

        return g;

    }
}
