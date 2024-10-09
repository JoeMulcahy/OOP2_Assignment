/*
 * Created by JFormDesigner on Thu Oct 03 11:38:50 IST 2024
 */

package oop2.assignment;

import net.miginfocom.swing.MigLayout;
import oop2.assignment.gameInformation.DisplayLevel;
import oop2.assignment.gameInformation.DisplayScore;
import oop2.assignment.gameInformation.DisplayTimer;
import oop2.assignment.gameInformation.InfoPanel;
import oop2.assignment.timing.GameTimer;

import javax.swing.*;
import java.awt.*;

/**
 * @author josep
 */
public class MainWindow extends JFrame {

    GamePanel pnlGame;
    InfoPanel pnlInfo;
    GameTimer timer;
    DisplayLevel displayLevel;
    DisplayScore displayScore;
    DisplayTimer displayTimer;

    public MainWindow() {
        initComponents();

        pnlGame = new GamePanel();
        pnlInfo = new InfoPanel();
        displayLevel = new DisplayLevel(1);
        displayScore = new DisplayScore();
        displayTimer = new DisplayTimer();

        pnlInfo.add(displayLevel, "cell 0 0, grow");
        pnlInfo.add(displayScore, "cell 0 1, grow");
        pnlInfo.add(displayTimer, "cell 0 2, grow");

        add(pnlGame, "cell 0 0");
        add(pnlInfo, "cell 1 0, grow");

        pack();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner non-commercial license

        //======== this ========
        setVisible(true);
        setMinimumSize(new Dimension(620, 850));
        setPreferredSize(new Dimension(620, 850));
        setMaximumSize(new Dimension(620, 850));
        setTitle("Tile Attack");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]"));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner non-commercial license
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
