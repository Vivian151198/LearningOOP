package lesson06Exercise;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog() {
        super(new Builder().speed(new SecureRandom().nextInt(70)).flyAble(false));
    }
}
