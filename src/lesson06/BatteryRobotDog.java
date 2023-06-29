package lesson06;

public class BatteryRobotDog extends RobotDog{

    // static block to override class variable.
    static {
        defaultName = "BatteryRobotDog";
    }
    public BatteryRobotDog() {
    }

    public BatteryRobotDog(String name) {
        super(name);
    }

    // Class Method | BEFORE the instance created
    public static String getDefaultName() {
        if(defaultName == null){
            return "Dog";
        }
        return defaultName;
    }
}
