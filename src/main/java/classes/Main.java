package classes;

import classes.models.*;
import classes.models.unitmodels.*;

public class Main {
    public static void main(String[] args) {

        Case aCase = new Case(CaseColor.BLACK);
        Ram ram = new Ram(RamType.DDR4, RamCapacity.GB16);
        PowerUnit powerUnit = new PowerUnit(2000);
        VideoCard videoCard = new VideoCard(VideoCardModels.GTX1070, 1500);
        Cpu cpu = new Cpu(CpuModels.i5, 6, 40000000, 151, Socket.LGA1151);
        Disk disk = new Disk(DiscCapacity.GB500, DiskRpm.RPM7200);
        MotherBoard motherBoard = new MotherBoard(Socket.LGA1151, ram, true);
        motherBoard.addCpu(cpu);
        motherBoard.addDisc(disk);
        motherBoard.addVideoCard(videoCard);
        Computer computer = new Computer(aCase, motherBoard, powerUnit);

        System.out.println(computer.getInfo());
    }
}