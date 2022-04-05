package practices.gameraindrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameField extends JPanel {
    private long last_frame_time;
    private final Image background;
    private final Image gameOver;
    private final Image rainDrop;
    private float drop_left = 200; // хранит координату х левого угла капли
    private float drop_top = -100; //  хранит координату у левого угла капли
    private float drop_v = 200;
    private int score;

    public GameField(Image background, Image gameOver, Image rainDrop) {
        this.background = background;
        this.gameOver = gameOver;
        this.rainDrop = rainDrop;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long current_time = System.nanoTime();
        g.drawImage(background, 0, 0, null);
        g.drawImage(rainDrop, (int) drop_left, (int) drop_top, null);
        last_frame_time = System.nanoTime();
        float delta_time = (current_time - last_frame_time) * 0.000000001f;
        last_frame_time = current_time;
        repaint();
        drop_top = drop_top - drop_v * delta_time;
        //  drop_left = drop_left - drop_top * delta_time;// перемещение по горизонтали
        if (drop_top > GameWindow.HEIGHT) g.drawImage(gameOver, 200, 200, null); //gameOver
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                float drop_right = drop_left + rainDrop.getWidth(null);
                float drop_bottom = drop_top + rainDrop.getHeight(null);
                boolean is_drop = x >= drop_left && x <= drop_right && y >= drop_top && y <= drop_bottom;
                if (is_drop) {
                    drop_top = -100;
                    drop_left = (int) (Math.random() * (getWidth() - rainDrop.getWidth(null)));
                    drop_v = drop_v + 20;
                    score++;
                }

            }
        });
    }
}


