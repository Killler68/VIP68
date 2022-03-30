package classes.models;

public interface MotherBoardBuilder {
    void addVideoCard(VideoCardImpl videoCard);

    void addDisc(DiskImpl disk);

    void addCpu(CpuImpl cpu);
}
