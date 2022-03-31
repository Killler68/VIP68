package classes.models;


import classes.models.unitmodels.CpuModels;
import classes.models.unitmodels.Socket;

public interface Cpu {

    CpuModels getCpuModel();

    Socket getSocket();

    long getTdp();

    long getClock();

    int getCores();

}
