package classes.models;

import classes.models.unitmodels.Socket;

public class MotherBoardImpl implements MotherBoardBuilder, MotherBoard {

    private final Socket socket;
    private final Ram ram;
    private final boolean rgb;

    private Cpu cpu;
    private Disk disk;
    private VideoCard videoCard;

    public MotherBoardImpl(Socket socket, Ram ram, boolean rgb) {
        this.socket = socket;
        this.ram = ram;
        this.rgb = rgb;
    }

    @Override

    public void addCpu(Cpu cpu) {
        if (cpu.getSocket().equals(socket)) {
            this.cpu = cpu;
        } else {
        }
    }

    public CpuImpl getCpu() {
        return (CpuImpl) cpu;
    }

    @Override

    public void addDisc(Disk disk) {
        this.disk = disk;
    }

    public DiskImpl getDisk() {
        return (DiskImpl) disk;
    }

    @Override

    public void addVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public VideoCardImpl getVideoCard() {
        return (VideoCardImpl) videoCard;
    }

    @Override

    public Socket getSocket() {
        return socket;
    }

    public RamImpl getRam() {
        return (RamImpl) ram;
    }

    @Override

    public boolean getRgb() {
        return rgb;
    }
}
