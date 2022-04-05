package practices.gameraindrop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class GameWindow extends JFrame {
    public static final int X = 200;
    public static final int Y = 100;
    public static final int WIDTH = 900;
    public static final int HEIGHT = 900;

    public GameWindow() throws IOException {
        GameField gameField = createGameField();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//команда завершает программу при закрытии окна
        setLocation(X, Y);//точка где появляется окно по x,y от слова File
        setSize(WIDTH, HEIGHT);//размер окна, в пиксилях
        setResizable(false);// не дает менять размер окна
        setVisible(true);// делает окно видимым
        setTitle("score");
        add(gameField);
    }

    public GameField createGameField() throws IOException {
        return new GameField((
                ImageIO.read(this.getClass().getResource("/NEBO.jpg"))),
                ImageIO.read(this.getClass().getResource("/gameOver.jpg")),
                ImageIO.read(this.getClass().getResource("/Rosa.jpg"))
        );
    }
}



