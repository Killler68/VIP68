package practices.gameraindrop;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ResourcesManager {

    private ResourcesManager() {
    }

    private static final URL SKY = ResourcesManager.class.getResource("/NEBO.jpg");
    private static final URL DEFEAT = ResourcesManager.class.getResource("/gameOver.jpg");
    private static final URL RAINWATER = ResourcesManager.class.getResource("/Rosa.jpg");

    public static Image sky() throws IOException {
        return ImageIO.read(SKY);
    }

    public static Image defeat() throws IOException {
        return ImageIO.read(DEFEAT);
    }

    public static Image rainWater() throws IOException {
        return ImageIO.read(RAINWATER);
    }
}
