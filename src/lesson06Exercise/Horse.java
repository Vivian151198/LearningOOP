package lesson06Exercise;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse() {

        super(new Builder().speed(new SecureRandom().nextInt(60)).flyAble(false));
    }
}
