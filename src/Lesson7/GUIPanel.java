package Lesson7;

import javax.swing.*;
import java.awt.*;

public class GUIPanel extends JPanel {

    private JPanel appControl;
    private JButton btnStart;
    private JButton btnExit;

    private JPanel gameInfo;
    private JLabel levelInfo;
    private JLabel sizeMapInfo;
    private JLabel enemyCountInfo;
    private JLabel enemyHpInfo;
    private JLabel enemySTRInfo;

    private JPanel playerInfo;
    private JLabel playerPosition;
    private JLabel playerHpInfo;
    private JLabel playerSTRInfo;

    private JPanel playerControlArea;
    private JButton playerMoveUp;
    private JButton playerMoveDown;
    private JButton playerMoveLeft;
    private JButton playerMoveRight;

    private JTextArea gameLog;
    private JScrollPane scrollLogPanel;

    GUIPanel(){
        setBackground(Color.blue);

        setLayout(new GridLayout(5,1));

        setupAppControlArea();
        setupGameInfo();
        setupPlayerInfo();
        setupPlayerControlArea();
        setupGameLog();

        constructPanel();

    }

    private void constructPanel() {
        add(appControl);
        add(gameInfo);
        add(playerInfo);
        add(playerControlArea);
        add(scrollLogPanel);
    }

    private void setupAppControlArea() {
        appControl = new JPanel();
        appControl.setLayout(new GridLayout(3,1));
        btnStart = new JButton("START");
        btnExit = new JButton("EXIT GAME");
        appControl.add(new JLabel("=Game Control="));
        appControl.add(btnStart);
        appControl.add(btnExit);

    }

    private void setupGameInfo() {
        gameInfo = new JPanel();
        gameInfo.setLayout(new GridLayout(6,1));
        levelInfo = new JLabel("Level: -");
        sizeMapInfo = new JLabel("Size man: -:-");
        enemyCountInfo = new JLabel("Enemies: -");
        enemyHpInfo = new JLabel("Enemies HP: -");
        enemySTRInfo = new JLabel("Enemies STR: -");

        gameInfo.add(new JLabel("=Game INFO="));
        gameInfo.add(levelInfo);
        gameInfo.add(sizeMapInfo);
        gameInfo.add(enemyCountInfo);
        gameInfo.add(enemyHpInfo);
        gameInfo.add(enemySTRInfo);

    }

    private void setupPlayerInfo() {
        playerInfo = new JPanel();
        playerInfo.setLayout(new GridLayout(4,1));
        playerHpInfo = new JLabel("Player HP: -");
        playerSTRInfo = new JLabel("Player STR: -");
        playerPosition = new JLabel("Position: -:-");

        playerInfo.add(new JLabel( "=Player INFO="));
        playerInfo.add(playerHpInfo);
        playerInfo.add(playerSTRInfo);
        playerInfo.add(playerPosition);

    }

    private void setupPlayerControlArea() {
        playerControlArea = new JPanel();
        playerControlArea.setLayout(new GridLayout(1,4));
        playerMoveDown = new JButton("⮟");
        playerMoveLeft = new JButton("⮜");
        playerMoveRight = new JButton("⮞");
        playerMoveUp = new JButton("⮝");

        playerControlArea.add(playerMoveLeft);
        playerControlArea.add(playerMoveUp);
        playerControlArea.add(playerMoveDown);
        playerControlArea.add(playerMoveRight);


    }

    private void setupGameLog() {
        gameLog = new JTextArea();
        scrollLogPanel = new JScrollPane(gameLog);

        gameLog.setLineWrap(true);
        gameLog.setEditable(false);
    }
}
