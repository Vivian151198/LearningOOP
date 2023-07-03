package lesson08ExerciseAbstraction;

import java.security.SecureRandom;

public class Tiger extends Animal{
    @Override
    protected int getSpeed() {
        return (new SecureRandom().nextInt(100));
    }

    @Override
    protected boolean flyAble() {
        return false;
    }
}
