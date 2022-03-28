package classes.models.unitmodels;

public enum DiscCapacity {
    GB120("120 gb"),
    GB250("250 gb"),
    GB500("500 gb"),
    TB1("1 tb"),
    TB2("2 tb");

    private final String memory;

    DiscCapacity(String memory) {
        this.memory = memory;
    }

    public String getMemory() {
        return memory;
    }
}
