package classes.models;

import classes.models.unitmodels.VideoCardModels;

public class VideoCardImpl implements VideoCard {

    private final VideoCardModels videoCardModel;
    private final long power;

    public VideoCardImpl(VideoCardModels videoCardModel, long power) {
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
