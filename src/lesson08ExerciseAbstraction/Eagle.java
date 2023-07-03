package lesson08ExerciseAbstraction;

import java.security.SecureRandom;

public class Eagle extends Animal{
    @Override
    protected int getSpeed() {
        return (new SecureRandom().nextInt(150));
    }

    @Override
    protected boolean flyAble() {
        return true;
    }
}
