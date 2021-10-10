package HW7;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private int Width = 800;
    private int Height = 600;
    private int PositionX = 250;
    private int PositionY = 100;

    private JPanel wind;

    private GUI gui;

    Window(){
        wind = new JPanel();

        wind.setBackground(new Color(222,233,1));
        gui = new GUI();
        add(wind, BorderLayout.SOUTH);
        add(gui, BorderLayout.NORTH);
        setupWindow();
        setVisible(true);

    }

    private void setupWindow(){
        setTitle("Application HW7");
        setLocation(PositionX,PositionY);
        setSize(Width,Height);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setResizable(false);
    }

}
