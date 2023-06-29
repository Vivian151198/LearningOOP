package lesson06;

public class TestRobotCat {

    public static void main(String[] args) {

        BatteryRobotCat batteryRobotCat = new BatteryRobotCat("Battery Robot Cat", "10/10/2000", "AAA");
        batteryRobotCat.charge();
        System.out.println(batteryRobotCat.getName());
        System.out.println(batteryRobotCat.getProductionDate());
        System.out.println("====");
        SolarEnergyRobotCat solarEnergyRobotCat = new SolarEnergyRobotCat("Solar Energy Robot Cat", "10/12/2000");
        solarEnergyRobotCat.charge();
        System.out.println(solarEnergyRobotCat.getName());
        System.out.println(solarEnergyRobotCat.getProductionDate());
    }
}
