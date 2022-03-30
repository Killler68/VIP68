package classes.models;


import classes.models.unitmodels.Socket;

public interface Cpu {

    Socket getSocket();

    long getTdp();

    long getClock();

    int getCores();

}
