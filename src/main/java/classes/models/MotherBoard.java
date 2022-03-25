package main.java.classes.models;

import main.java.classes.models.unitmodels.Socket;

public class MotherBoard {

    private final Socket socket;
    private final Ram ram;
    private final boolean rgb;

    private Cpu cpu;
    private Disk disk;
    private VideoCard videoCard;

    public MotherBoard(Socket socket, Ram ram, boolean rgb) {
        this.socket = socket;
        this.ram = ram;
        this.rgb = rgb;
    }

    public boolean addCpu(Cpu cpu) {
        if (cpu.getSocket().equals(socket)) {
            this.cpu = cpu;
            return true;
        } else {
            return false;
        }
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void addDisc(Disk disk) {
        this.disk = disk;
    }

    public Disk getDisk() {
        return disk;
    }

    public void addVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public Socket getSocket() {
        return socket;
    }

    public Ram getRam() {
        return ram;
    }

    public boolean getRgb() {
        return rgb;
    }
}
