package classes.models;

import classes.models.unitmodels.VideoCardModels;

public class VideoCard {

    private final VideoCardModels videoCardModel;
    private final long power;

    public VideoCard(VideoCardModels videoCardModel, long power) {
        this.videoCardModel = videoCardModel;
        this.power = power;
    }

    public VideoCardModels getVideoCardModel() {
        return videoCardModel;
    }

    public long getPower() {
        return power;
    }
}
