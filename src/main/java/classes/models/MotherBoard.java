package classes.models;

import classes.models.unitmodels.Socket;

public interface MotherBoard {
    boolean getRgb();

    RamImpl getRam();

    Socket getSocket();

    VideoCardImpl getVideoCard();

    DiskImpl getDisk();

    CpuImpl getCpu();
}
