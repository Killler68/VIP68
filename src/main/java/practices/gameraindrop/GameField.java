package practices.gameraindrop;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameField extends JPanel {
    private final Image background;
    private final Image gameOver;
    private final Image rainDrop;
    private static final int BACK_GROUND_X = 0;
    private static final int BACK_GROUND_Y = 0;
    private static int dropLeft = 200; // хранит координату х левого угла капли
    private static float dropTop = -100; //  хранит координату у левого угла капли
    private static final float TIME_MULTIPLIER = 0.001f;
    private static int dropV = 200;
    private static final int dropTops = -100;
    private static final int speed = 50;
    private static final int gameOverX = 200;
    private static final int gameOverY = 150;

    public GameField(Image background, Image gameOver, Image rainDrop) {
        this.background = background;
        this.gameOver = gameOver;
        this.rainDrop = rainDrop;
        mouse();
    }

    protected void paintComponent(Graphics g) {
        graphic(g);

    }

    public void graphic(@NotNull Graphics g) {
        long currentTime = System.currentTimeMillis();
        g.drawImage(background, BACK_GROUND_X, BACK_GROUND_Y, null);
        g.drawImage(rainDrop, dropLeft, (int) dropTop, null);
        float deltaTime = (currentTime - System.currentTimeMillis()) * TIME_MULTIPLIER;
        dropTop = dropTop - dropV * deltaTime;
        if (dropTop > GameWindow.HEIGHT) g.drawImage(gameOver, gameOverX, gameOverY, null); //gameOver
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


