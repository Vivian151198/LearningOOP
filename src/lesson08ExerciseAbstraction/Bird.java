package lesson08ExerciseAbstraction;

import java.security.SecureRandom;

public class Bird extends Animal{
    @Override
    protected int getSpeed() {
        return (new SecureRandom().nextInt(110));
    }

    @Override
    protected boolean flyAble() {
        return true;
    }
}
