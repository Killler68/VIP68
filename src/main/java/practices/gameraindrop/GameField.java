package practices.gameraindrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameField extends JPanel {
    private long lastFrameTime;
    private final Image background;
    private final Image gameOver;
    private final Image rainDrop;
    private final int backGroundX = 0;
    private final int backGroundY = 0;
    private int dropLeft = 200; // хранит координату х левого угла капли
    private float dropTop = -100; //  хранит координату у левого угла капли
    private final float Pace = 0.00000001f;
    private int dropV = 200;
    private final int dropTops = -100;
    private final int speed = 50;

    public GameField(Image background, Image gameOver, Image rainDrop) {
        this.background = background;
        this.gameOver = gameOver;
        this.rainDrop = rainDrop;
    }

    protected void paintComponent(Graphics g) {
        graphic(g);
        mouse();
    }

    public void graphic(Graphics g) {
        super.paintComponent(g);
        long currentTime = System.nanoTime();
        g.drawImage(background, backGroundX, backGroundY, null);
        g.drawImage(rainDrop, dropLeft, (int) dropTop, null);
        lastFrameTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * Pace;
        lastFrameTime = currentTime;
        dropTop = dropTop - dropV * deltaTime;
        if (dropTop > GameWindow.HEIGHT) g.drawImage(gameOver, dropLeft, (int) dropTop, null); //gameOver
        repaint();

    }

    public void mouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                int dropRight = dropLeft + rainDrop.getWidth(null);
                float dropBottom = dropTop + rainDrop.getHeight(null);
                if (isDrops(x, dropRight, y, dropBottom)) {
                    dropTop = dropTops;
                    dropLeft = (int) (Math.random() * (getWidth() - rainDrop.getWidth(null)));
                    dropV += speed;
                }

            }
        });
    }

    public boolean isDrops(int x, int dropRight, int y, float dropBottom) {
        return x >= dropLeft && x <= dropRight && y >= dropTop && y <= dropBottom;
    }
}


