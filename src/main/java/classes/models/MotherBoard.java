package classes.models;

import classes.models.unitmodels.Socket;

public interface MotherBoard {
    boolean getRgb();

    Ram getRam();

    Socket getSocket();

    VideoCard getVideoCard();

    Disk getDisk();

    Cpu getCpu();
}
