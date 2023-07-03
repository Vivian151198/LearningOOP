package lesson08ExerciseAbstraction;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    protected int getSpeed() {
        return (new SecureRandom().nextInt(60));
    }

    @Override
    protected boolean flyAble() {
        return false;
    }
}
