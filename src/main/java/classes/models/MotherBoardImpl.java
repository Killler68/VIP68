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

    @Override
    public Cpu getCpu() {
        return cpu;
    }

    @Override
    public void addDisc(Disk disk) {
        this.disk = disk;
    }

    @Override
    public Disk getDisk() {
        return (DiskImpl) disk;
    }

    @Override
    public void addVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public VideoCard getVideoCard() {
        return videoCard;
    }

    @Override
    public Socket getSocket() {
        return socket;
    }

    @Override
    public Ram getRam() {
        return ram;
    }

    @Override
    public boolean getRgb() {
        return rgb;
    }
}
