package classes.models;

import classes.models.unitmodels.CpuModels;
import classes.models.unitmodels.Socket;

public class Cpu {

    private final CpuModels cpuModel;
    private final int cores;
    private final long clock;
    private final long tdp;
    private final Socket socket;

    public Cpu(CpuModels cpuModel, int cores, long clock, long tdp, Socket socket) {
        this.cpuModel = cpuModel;
        this.cores = cores;
        this.clock = clock;
        this.tdp = tdp;
        this.socket = socket;
    }

    public CpuModels getCpuModel() {
        return cpuModel;
    }

    public int getCores() {
        return cores;
    }

    public long getClock() {
        return clock;
    }

    public long getTdp() {
        return tdp;
    }

    public Socket getSocket() {
        return socket;
    }
}
