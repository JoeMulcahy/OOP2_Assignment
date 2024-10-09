/*
 * Created by JFormDesigner on Thu Oct 03 11:58:32 IST 2024
 */

package oop2.assignment;

import net.miginfocom.swing.MigLayout;
import oop2.assignment.gameObjects.GameObject;
import oop2.assignment.gameObjects.PlayerCursor;
import oop2.assignment.gameObjects.Tile;
import oop2.assignment.gameObjects.TileColors;
import oop2.assignment.grid.GameGrid;
import oop2.assignment.grid.Grid;
import oop2.assignment.timing.GameTimer;

import javax.swing.*;
import java.awt.*;

/**
 * @author josep
 */
public class GamePanel extends JPanel {

    Grid gameGrid;
    GameObject testTile;
    GameObject player;
    Dimension panelDimension;
    GameTimer timer;
    public GamePanel() {
        initComponents();
        panelDimension = new Dimension(400, 800);

        setBackground(new Color(0xcccccc));
        setMinimumSize(new Dimension(panelDimension.width, panelDimension.height));
        setPreferredSize(new Dimension(panelDimension.width, panelDimension.height));
        setLayout(new MigLayout(
                "filly,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]"));

        gameGrid = new GameGrid(panelDimension.width, panelDimension.height, 6, 15, 2, true);
        testTile = new Tile(100, 100, 100, 100, TileColors.RED);
        player = new PlayerCursor();
        timer = new GameTimer();

        System.out.println("panel width: " + panelDimension.width);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D g = (Graphics2D) graphics;

        gameGrid.draw(g);
        //testTile.draw(g);
        player.draw(g);

        Toolkit.getDefaultToolkit().sync();
        repaint();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner non-commercial license

        //======== this ========
        setBackground(new Color(0xcccccc));
        setLayout(new MigLayout(
            "hidemode 3,align center center",
            // columns
            "[fill]",
            // rows
            "[]"));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner non-commercial license
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
