package practices.gameraindrop;

import javax.swing.*;
import java.awt.*;


public class GameField extends JPanel {

    private final Image background;
    private final Image gameOver;
    private final Image rainDrop;
    private final Image rainDrop1;


    public GameField(Image background, Image gameOver, Image rainDrop, Image rainDrop1) {
        this.background = background;
        this.gameOver = gameOver;
        this.rainDrop = rainDrop;
        this.rainDrop1 = rainDrop1;

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, null);

        g.drawImage(rainDrop1, 150, 150, null);
        g.drawImage(gameOver, 500, 100, null);
        g.drawImage(rainDrop, 500, 400, null);

    }


}


