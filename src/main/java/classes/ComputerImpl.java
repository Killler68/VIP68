package classes;

import classes.models.*;

public class ComputerImpl implements Computer {

    private final CaseImpl aCase;
    private final MotherBoard motherBoard;
    private final PowerUnitImpl powerUnit;

    public ComputerImpl(CaseImpl aCase, MotherBoard motherBoard, PowerUnitImpl powerUnit) {
        this.aCase = aCase;
        this.motherBoard = motherBoard;
        this.powerUnit = powerUnit;
    }

    @Override
    public String getInfo() {
        if (!isMotherBoardCompleted()) return "чего то не хватает";
        if (!isPowerUnitHasRequiredPower()) return "компуктер сгорел, не хватило блока питания";

        String caseInfo = getCaseInfo();
        String cpuInfo = getCpuInfo();
        String videoCardInfo = getVideoCardInfo();
        String motherBoardInfo = getMotherBoardInfo();
        String powerUnitInfo = getPowerUnitInfo();
        String discInfo = getDiscInfo();
        String ramInfo = getRamInfo();

        return caseInfo + cpuInfo + videoCardInfo + motherBoardInfo + powerUnitInfo + discInfo + ramInfo;
    }

    private boolean isMotherBoardCompleted() {
        boolean isCpuCompleted = motherBoard.getCpu() != null;
        boolean isVideoCardCompleted = motherBoard.getVideoCard() != null;
        boolean isDiscCompleted = motherBoard.getDisk() != null;
        return isCpuCompleted && isVideoCardCompleted && isDiscCompleted;
    }

    private boolean isPowerUnitHasRequiredPower() {
        long isCpuPowerCompleted = motherBoard.getCpu().getTdp();
        long videoCardPower = motherBoard.getVideoCard().getPower();
        long needPower = isCpuPowerCompleted + videoCardPower;

        return powerUnit.getPower() >= needPower;
    }

    private String getCaseInfo() {
        return "CASE: color " + aCase.getCaseColor() + "\n";
    }

    private String getCpuInfo() {
        CpuImpl cpu = motherBoard.getCpu();
        return "CPU: " + cpu.getCpuModel() + " " + cpu.getClock() + " мегагерц " + cpu.getCores() + " ядер\n";
    }

    private String getVideoCardInfo() {
        VideoCardImpl videoCard = motherBoard.getVideoCard();
        return "VIDEO CARD: " + videoCard.getVideoCardModel() + " " + videoCard.getPower() + " ватт\n";
    }

    private String getMotherBoardInfo() {
        String motherBoardInfo = "MOTHER BOARD: socket " + motherBoard.getSocket();

        if (motherBoard.getRgb()) {
            motherBoardInfo += " есть ргб\n";
        } else {
            motherBoardInfo += " нет ргб хуета\n";
        }

        return motherBoardInfo;
    }

    private String getPowerUnitInfo() {
        return "POWER UNIT: " + powerUnit.getPower() + " ватт\n";
    }

    private String getDiscInfo() {
        DiskImpl disk = motherBoard.getDisk();
        return "DISK: " + disk.getCapacity() + " " + disk.getRpm() + "\n";
    }

    private String getRamInfo() {
        RamImpl ram = motherBoard.getRam();
        return "RAM: " + ram.getType() + " " + ram.getCapacity() + "\n";
    }
}
