package practices;

import javax.swing.*;
import java.awt.*;

import static practices.GameWindow.onRepaint;

public class GameField extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        onRepaint(g);
    }
}
