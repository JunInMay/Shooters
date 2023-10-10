package com.shooters.screen;

import javax.swing.*;

public class GameWindow extends JFrame {

    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 800;

    public GameWindow() {
        setTitle("Shooters");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
