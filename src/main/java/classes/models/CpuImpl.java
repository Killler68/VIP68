package classes.models;

import classes.models.unitmodels.CpuModels;
import classes.models.unitmodels.Socket;

public class CpuImpl implements Cpu {

    private final CpuModels cpuModel;
    private final int cores;
    private final long clock;
    private final long tdp;
    private final Socket socket;

    public CpuImpl(CpuModels cpuModel, int cores, long clock, long tdp, Socket socket) {
        this.cpuModel = cpuModel;
        this.cores = cores;
        this.clock = clock;
        this.tdp = tdp;
        this.socket = socket;
    }

    public CpuModels getCpuModel() {
        return cpuModel;
    }

    @Override
    public int getCores() {
        return cores;
    }

    @Override
    public long getClock() {
        return clock;
    }

    @Override
    public long getTdp() {
        return tdp;
    }

    @Override
    public Socket getSocket() {
        return socket;
    }
}
