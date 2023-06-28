package lesson06;

//extend: mo rong, phai co gi do moi mo rong dc
public class SolarEnergyRobotCat extends  RobotCat{

    public SolarEnergyRobotCat() {
    }

    public SolarEnergyRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    public void runWithSolarEnergy(){
        System.out.println("Run with solar energy");
    }

    @Override
    public void charge() {
        super.charge();
        System.out.println("With solar energy circuit");
    }
}
