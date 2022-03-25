package SOLID.D.method;

import SOLID.D.classes.ImageDownloader;
import SOLID.D.classes.ImageSaver;
import SOLID.D.classes.models.Image;

public class ImageManagerExample {
    public static void main(String[] args) {
        ImageDownloader imageDownloader = new ImageDownloader();
        ImageSaver imageSaver = new ImageSaver();
    }

    // module
    public void downloadAndSaveImage(ImageDownloader imageDownloader, ImageSaver imageSaver) {
        Image image = imageDownloader.download("http://example.com");
        imageSaver.save(image);
    }
}
