package Main;

import javax.swing.*;

public class Game {
    public static final int WIDTH = 840;
    public static final int HEIGHT = 500;
    public static void main(String[] args) {
        JFrame window = new JFrame("Game");
        window.setSize(540,500);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(new Gamepanel());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
