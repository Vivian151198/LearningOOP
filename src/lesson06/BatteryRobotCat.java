package lesson06;

public class BatteryRobotCat extends  RobotCat{

    private String batteryType;
    public BatteryRobotCat() {
    }

    public BatteryRobotCat(String name, String productionDate, String batteryType) {
        super(name, productionDate); // If don't have super() => name = null, productionDate = null although 2 parameters have value.
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public void runWithBattery(){
        System.out.println("Run with battery");
    }

    //@ Annotation
    //. dot annotation
    @Override
    public void charge() {
        super.charge();
        System.out.println("With Battery Circuit");
    }

}
