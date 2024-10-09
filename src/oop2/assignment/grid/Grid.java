package oop2.assignment.grid;

import java.awt.*;

public abstract class Grid {

    protected int gridWidth;
    protected int gridHeight;
    protected int numberOfColumns;
    protected int numberOfRows;
    protected int cellWidth;
    protected int cellHeight;
    protected int gridLineThickness;
    protected Color gridLineColor;
    protected boolean isVisible;

    public Grid(int gridWidth, int gridHeight, int numberOfColumns, int numberOfRows, int gridLineThickness, boolean isVisible){
         this.gridWidth = gridWidth;
         this.gridHeight = gridHeight;
         this.numberOfColumns = numberOfColumns;
         this.numberOfRows = numberOfRows;
         this.gridLineThickness = gridLineThickness;
         this.isVisible = isVisible;

         cellWidth = gridWidth / numberOfColumns;
         cellHeight = gridHeight / numberOfRows;
    }

     public abstract void draw(Graphics2D g);

    public int getGridWidth() {
        return gridWidth;
    }

    public void setGridWidth(int gridWidth) {
        this.gridWidth = gridWidth;
    }

    public int getGridHeight() {
        return gridHeight;
    }

    public void setGridHeight(int gridHeight) {
        this.gridHeight = gridHeight;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getCellWidth() {
        return cellWidth;
    }

    public void setCellWidth(int cellWidth) {
        this.cellWidth = cellWidth;
    }

    public int getCellHeight() {
        return cellHeight;
    }

    public void setCellHeight(int cellHeight) {
        this.cellHeight = cellHeight;
    }

    public int getGridLineThickness() {
        return gridLineThickness;
    }

    public void setGridLineThickness(int gridLineThickness) {
        this.gridLineThickness = gridLineThickness;
    }

    public Color getGridLineColor() {
        return gridLineColor;
    }

    public void setGridLineColor(Color gridLineColor) {
        this.gridLineColor = gridLineColor;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
