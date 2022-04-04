package practices.gameraindrop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class GameWindow extends JFrame {
    private GameWindow gameWindow;

    public void Statistic() throws IOException {
        gameWindow = new GameWindow();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//команда завершает программу при закрытии окна
        gameWindow.setLocation(200, 100);//точка где появляется окно по x,y от слова File
        gameWindow.setSize(900, 900);//размер окна, в пиксилях
        gameWindow.setResizable(false);// не дает менять размер окна
        GameField gameField = new GameField(ImageIO.read(this.getClass().getResource("/NEBO.jpg")),
                ImageIO.read(this.getClass().getResource("/Rosa.jpg")),
                ImageIO.read(this.getClass().getResource("/Rosa1.png")),
                ImageIO.read(this.getClass().getResource("/gameOver.jpg")));

        gameWindow.add(gameField);
        gameWindow.setVisible(true);// делает окно видимым
    }
}


