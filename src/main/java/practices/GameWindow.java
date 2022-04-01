package practices;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static GameWindow gameWindow;

    public static void main(String[] args) {
        gameWindow = new GameWindow();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//команда завершает программу при закрытии окна
        gameWindow.setLocation(200, 100);//точка где появляется окно по x,y от слова File
        gameWindow.setSize(906, 478);//размер окна, в пиксилях
        gameWindow.setResizable(false);// не дает менять размер окна
        GameField gameField = new GameField();
        gameWindow.add(gameField);
        gameWindow.setVisible(true);// делает окно видимым

    }

    public static void onRepaint(Graphics g) {
        g.fillOval(10, 10, 200, 100); // Овал
        g.drawLine( 800, 400, 500,300);// Линия
    }


}

