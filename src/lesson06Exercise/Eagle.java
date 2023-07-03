package lesson06Exercise;

import java.security.SecureRandom;

public class Eagle extends Animal{
    public Eagle() {
        super(new Builder().speed(new SecureRandom().nextInt(150)).flyAble(true));;
    }
}
