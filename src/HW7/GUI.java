package HW7;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    private JButton testButton;
    private JLabel testLabel;
    private JPanel testPanel;
    private JTextArea testTextArea;
    private JCheckBox testTextBox;

    GUI(){
        setupGui();
        add(testPanel);

    }

    private void setupGui() {

        testPanel = new JPanel();
        testPanel.setPreferredSize(new Dimension(300,300));
        testPanel.setLayout(new GridLayout(5,1));
        testButton = new JButton("button1");
        testButton.setPreferredSize(new Dimension(100,30));
        testLabel = new JLabel("Test Label is her");
        testTextArea = new JTextArea();
        testTextBox = new JCheckBox();


        testPanel.add(testLabel);
        testPanel.add(testButton);
        testPanel.add(testTextArea);
        testPanel.add(testTextBox);
    }

}
