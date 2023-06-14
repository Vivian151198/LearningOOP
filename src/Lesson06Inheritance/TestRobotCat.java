package Lesson06Inheritance;

public class TestRobotCat {

    public static void main(String[] args) {

        BatteryRobotCat batteryRobotCat = new BatteryRobotCat("batteryRobotCat","10/08/2021" );
        System.out.println(batteryRobotCat.getName());
        System.out.println(batteryRobotCat.getProductionDate());
        batteryRobotCat.runWithBattery();


        SolarEnergyRobotCat solarEnergyRobotCat = new SolarEnergyRobotCat("solarEnergyRobotCat","10/08/2021" );
        System.out.println(solarEnergyRobotCat.getName());
        System.out.println(solarEnergyRobotCat.getProductionDate());
        solarEnergyRobotCat.runSolarEnergy();
    }
}
