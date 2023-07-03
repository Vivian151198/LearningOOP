package lesson08ExerciseAbstraction;

import java.security.SecureRandom;

public class Dog extends Animal{
    @Override
    protected int getSpeed() {
        return (new SecureRandom().nextInt(70));
    }

    @Override
    protected boolean flyAble() {
        return false;
    }
}
