package classes.models;

import classes.models.unitmodels.Socket;

public class MotherBoardImpl implements MotherBoardBuilder, MotherBoard {

    private final Socket socket;
    private final RamImpl ram;
    private final boolean rgb;

    private CpuImpl cpu;
    private DiskImpl disk;
    private VideoCardImpl videoCard;

    public MotherBoardImpl(Socket socket, RamImpl ram, boolean rgb) {
        this.socket = socket;
        this.ram = ram;
        this.rgb = rgb;
    }

    public void addCpu(CpuImpl cpu) {
        if (cpu.getSocket().equals(socket)) {
            this.cpu = cpu;
        } else {
        }
    }

    public CpuImpl getCpu() {
        return cpu;
    }

    public void addDisc(DiskImpl disk) {
        this.disk = disk;
    }

    public DiskImpl getDisk() {
        return disk;
    }

    public void addVideoCard(VideoCardImpl videoCard) {
        this.videoCard = videoCard;
    }

    public VideoCardImpl getVideoCard() {
        return videoCard;
    }

    public Socket getSocket() {
        return socket;
    }

    public RamImpl getRam() {
        return ram;
    }

    public boolean getRgb() {
        return rgb;
    }
}
