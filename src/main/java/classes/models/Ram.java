package classes.models;

import classes.models.unitmodels.RamCapacity;
import classes.models.unitmodels.RamType;

public class Ram {

    private final RamType type;
    private final RamCapacity capacity;

    public Ram(RamType type, RamCapacity capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public RamType getType() {
        return type;
    }

    public String getCapacity() {
        return capacity.getRamCapacity();
    }
}
