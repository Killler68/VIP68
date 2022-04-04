package practices.gameraindrop;

import javax.swing.*;
import java.awt.*;


public class GameField extends JPanel {
    private long last_frame_time;
    private final Image background;
    private final Image gameOver;
    private final Image rainDrop;
    private final Image rainDrop1;
    private float drop_left = 200; // хранит координату х левого угла капли
    private float drop_top = -100; //  хранит координату у левого угла капли
    private float drop_v = 200;


    public GameField(Image background, Image gameOver, Image rainDrop, Image rainDrop1) {
        this.background = background;
        this.gameOver = gameOver;
        this.rainDrop = rainDrop;
        this.rainDrop1 = rainDrop1;

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long current_time = System.nanoTime();
        g.drawImage(background, 0, 0, null);
//      g.drawImage(rainDrop1, 150, 150, null); //gameOver
//      g.drawImage(gameOver, 500, 100, null);
        g.drawImage(rainDrop, (int) drop_left, (int) drop_top, null);
        last_frame_time = System.nanoTime();
        float delta_time = (current_time - last_frame_time) * 0.00000001f;
        last_frame_time = current_time;
        repaint();
        drop_top = drop_top - drop_v * delta_time;
        drop_left = drop_left - drop_top * delta_time;
    }


}


