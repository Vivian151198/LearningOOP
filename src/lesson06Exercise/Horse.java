package lesson06Exercise;

import java.security.SecureRandom;

public class Horse extends Animal{
    public Horse() {
        super(new SecureRandom().nextInt(60));
    }
}
