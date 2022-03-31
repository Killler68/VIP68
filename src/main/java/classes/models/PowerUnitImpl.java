package classes.models;

public class PowerUnitImpl implements PowerUnit {

    private final long power;

    public PowerUnitImpl(long power) {
        this.power = power;
    }

    @Override
    public long getPower() {
        return power;
    }
}
