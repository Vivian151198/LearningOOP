package lesson06;

import java.security.SecureRandom;

public class TestRobotDog {

    public static void main(String[] args) {
        BatteryRobotDog robotDog = new BatteryRobotDog();
        System.out.println(robotDog.getDefaultName());

        System.out.println("////////////////////////////");
        System.out.println(robotDog.getClass().getSimpleName());

        int randomSpeed = new SecureRandom().nextInt();
    }
}
