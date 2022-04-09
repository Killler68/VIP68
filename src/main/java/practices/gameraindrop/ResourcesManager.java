package practices.gameraindrop;

import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;

public class ResourcesManager {

    private ResourcesManager() {
    }

    private static final URL SKY = ResourcesManager.class.getResource("/NEBO.jpg");
    private static final URL DEFEAT = ResourcesManager.class.getResource("/gameOver.jpg");
    private static final URL RAINWATER = ResourcesManager.class.getResource("/rosa.png");

    public static Image sky() {
        return getImage(SKY);
    }

    public static Image defeat() {
        return getImage(DEFEAT);
    }

    public static Image rainWater() {
        return getImage(RAINWATER);
    }

    private static Image getImage(URL url) {
        try {
            return ImageIO.read(url);
        } catch (Exception e) {
            throw new IllegalArgumentException("resources not found");
        }
    }
}
