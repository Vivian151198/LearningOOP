package Lesson06Inheritance;

public class SolarEnergyRobotCat extends RobotCat {

    public SolarEnergyRobotCat() {
    }

    public SolarEnergyRobotCat(String name, String productionDate) {
        super(name, productionDate); // If don't have super() => name = null and productionDate = null
    }

    public void runSolarEnergy(){

        System.out.println("runSolarEnergy");
    }
}
