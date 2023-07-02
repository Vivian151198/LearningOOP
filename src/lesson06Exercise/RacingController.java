package lesson06Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingController {

    public static Animal getMaxSpeedAnimal(List<Animal> animals){
        Animal winner = null;
        for (Animal currentAnimal : animals) {
            System.out.println("Animal is: " + currentAnimal.getClass().getSimpleName());
            System.out.println("Speed of animal is: " +currentAnimal.getSpeed());
            if(winner == null){
                winner = currentAnimal;
            }
            else {
                if(winner.getSpeed() < currentAnimal.getSpeed()){
                    winner = currentAnimal;
                }
            }
        }
        return winner;
    }
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Animal horse = new Horse();

        Animal winner = RacingController.getMaxSpeedAnimal(Arrays.asList(tiger, dog, horse));
        System.out.printf("The winner is " + winner.getClass().getSimpleName() + " with speed is " + winner.getSpeed());
    }
}
