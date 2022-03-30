package classes.models;

import classes.models.unitmodels.DiscCapacity;
import classes.models.unitmodels.DiskRpm;

public class DiskImpl implements Disk {

    private final DiscCapacity capacity;
    private final DiskRpm rpm;

    public DiskImpl(DiscCapacity capacity, DiskRpm rpm) {
        this.capacity = capacity;
        this.rpm = rpm;
    }

    public String getCapacity() {
        return capacity.getMemory();

    }

    public String getRpm() {
        return rpm.getDiskRpm();
    }
}
