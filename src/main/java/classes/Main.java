package classes;

import classes.models.*;
import classes.models.unitmodels.*;

public class Main {
    public static void main(String[] args) {

        Case aCase = new CaseImpl(CaseColor.BLACK);
        Ram ram = new RamImpl(RamType.DDR4, RamCapacity.GB16);
        PowerUnit powerUnit = new PowerUnitImpl(2000);
        VideoCard videoCard = new VideoCardImpl(VideoCardModels.GTX1070, 1500);
        Cpu cpu = new CpuImpl(CpuModels.i5, 6, 40, 151, Socket.LGA1151);
        Disk disk = new DiskImpl(DiscCapacity.GB500, DiskRpm.RPM7200);
        MotherBoardBuilder motherBoard = new MotherBoardImpl(Socket.LGA1151, ram, true);
        motherBoard.addCpu(cpu);
        motherBoard.addDisc(disk);
        motherBoard.addVideoCard(videoCard);
        Computer computer = new ComputerImpl(aCase, (MotherBoard) motherBoard,  powerUnit);

        System.out.println(computer.getInfo());
    }
}