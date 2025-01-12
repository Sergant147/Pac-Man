package com.serugle.sergey.pacman;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        Main pac = new Main();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(380, 420);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);
    }
}