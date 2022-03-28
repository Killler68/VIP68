package classes.models.unitmodels;

public enum RamCapacity {
    GB4("4 gb"),
    GB8("8 gb"),
    GB16("16 gb"),
    GB32("32 gb");

    private final String ramCapacity;

    RamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getRamCapacity() {
        return ramCapacity;
    }
}
