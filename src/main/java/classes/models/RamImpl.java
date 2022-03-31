package classes.models;

import classes.models.unitmodels.RamCapacity;
import classes.models.unitmodels.RamType;

public class RamImpl implements Ram {

    private final RamType type;
    private final RamCapacity capacity;

    public RamImpl(RamType type, RamCapacity capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override

    public RamType getType() {
        return type;
    }

    @Override

    public String getCapacity() {
        return capacity.getRamCapacity();
    }
}
