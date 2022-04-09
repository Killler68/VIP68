package practices.gameraindrop;

import javax.swing.*;

public class GameWindow extends JFrame {
    public static final int X = 200;
    public static final int Y = 100;
    public static final int WIDTH = 900;
    public static final int HEIGHT = 700;

    public GameWindow() {
        GameField gameField = createGameField();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(X, Y);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setVisible(true);
        setTitle("score");
        add(gameField);
    }

    public GameField createGameField() {
        return new GameField(
                ResourcesManager.sky(),
                ResourcesManager.defeat(),
                ResourcesManager.rainWater()
        );
    }
}








