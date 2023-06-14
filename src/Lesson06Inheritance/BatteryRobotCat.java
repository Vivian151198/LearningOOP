package Lesson06Inheritance;

public class BatteryRobotCat extends RobotCat {

    public BatteryRobotCat() {
    }

    public BatteryRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    //Concrete class || Child class
    public void runWithBattery(){
        // . dot notation
        System.out.println("runWithBattery");
    }

    //@: Annotation
    @Override
    public void charge() {
        super.charge();
    }
}
