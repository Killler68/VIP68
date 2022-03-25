package main.java.classes.models;

import main.java.classes.models.unitmodels.RamCapacity;
import main.java.classes.models.unitmodels.RamType;

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
        return switch (capacity) {
            case GB4 -> "4 gb";
            case GB8 -> "8 gb";
            case GB16 -> "16 gb";
            case GB32 -> "32 gb";
        };
    }
}
