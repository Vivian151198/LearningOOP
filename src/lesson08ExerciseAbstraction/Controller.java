package lesson08ExerciseAbstraction;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public void runContest(List <Animal> animals) {
        Animal winner = null;
        List<Animal> applicableAnimals = applicableAnimals(animals);

        for (Animal currentAnimal : applicableAnimals) {
            System.out.println("Animal is: " + currentAnimal.getClass().getSimpleName());
            System.out.println("Speed of animal is: " + currentAnimal.getSpeed());
            if (winner == null) {
                winner = currentAnimal;
            } else {
                if (winner.getSpeed() < currentAnimal.getSpeed()) {
                    winner = currentAnimal;
                }
            }
        }
        System.out.printf("The winner is " + winner.getClass().getSimpleName() + " with speed is " + winner.getSpeed());
    }

    //Support method
    private List<Animal> applicableAnimals(List<Animal> animals) {
        List<Animal> applicableAnimals = new ArrayList<>();
        List<Animal> animalsCanFly = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.flyAble() == true) {
                animalsCanFly.add(animal);
            } else {
                applicableAnimals.add(animal);
            }
        }

        for (Animal animal : animalsCanFly) {
            System.out.println("Animal " + animal.getClass().getSimpleName() + " can fly, so can't join the racing.");
        }

        return applicableAnimals;
    }
}
