package SOLID.D.classes;

import SOLID.D.classes.models.Image;

public class ImageManager {
    ImageDownloader imageDownloader;
    ImageSaver imageSaver;

    public ImageManager(ImageDownloader imageDownloader, ImageSaver imageSaver) {
        this.imageDownloader = imageDownloader;
        this.imageSaver = imageSaver;
    }

    public Image downloadImage(String url) {
        return imageDownloader.download(url);
    }

    public void saveImage(Image image) {
        imageSaver.save(image);
    }
}
