package classes.models.unitmodels;

public enum DiskRpm {
    RPM7200("5400 rpm"),
    RPM5400("7200 rpm"),
    ;
    private String diskRpm;

    DiskRpm(String diskRpm) {
        this.diskRpm = diskRpm;
    }

    public String getDiskRpm() {
        return diskRpm;
    }
}
