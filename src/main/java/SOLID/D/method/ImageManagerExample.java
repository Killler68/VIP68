package main.java.SOLID.D.method;

import main.java.SOLID.D.classes.ImageDownloader;
import main.java.SOLID.D.classes.ImageSaver;
import main.java.SOLID.D.classes.models.Image;

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
