package Lesson7;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 600;
    private int winPositionX = 300;
    private int winPositionY = 150;

    private GameMap map;
    private GUIPanel mainPanel;

    AppWindow(){
        setupWindow();

        map = new GameMap();
        mainPanel = new GUIPanel();

        add(mainPanel, BorderLayout.EAST);
        add(map);



        setVisible(true);
    }

    private void setupWindow(){
        setTitle("Application");
        setLocation(winPositionX,winPositionY);
        setSize(winWidth,winHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
