package main.java.classes.models;

import main.java.classes.models.unitmodels.DiscCapacity;
import main.java.classes.models.unitmodels.DiskRpm;

public class Disk {

    private final DiscCapacity capacity;
    private final DiskRpm rpm;

    public Disk(DiscCapacity capacity, DiskRpm rpm) {
        this.capacity = capacity;
        this.rpm = rpm;
    }

    public String getCapacity() {
        return switch (capacity) {
            case GB120 -> "120 gb";
            case GB250 -> "250 gb";
            case GB500 -> "500 gb";
            case TB1 -> "1 tb";
            case TB2 -> "2 tb";
        };
    }

    public String getRpm() {
        return switch (rpm) {
            case RPM5400 -> "5400 rpm";
            case RPM7200 -> "7200 rpm";
        };
    }
}
