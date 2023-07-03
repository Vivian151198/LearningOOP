package lesson08ExerciseAbstraction;

import java.util.ArrayList;
import java.util.List;

public class RacingContest {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Animal horse = new Horse();
        horse = new Eagle(); // Polymorphism
        Animal eagle = new Eagle();
        Animal bird = new Bird();

        animals.add(tiger);
        animals.add(dog);
        animals.add(horse);
        animals.add(eagle);
        animals.add(bird);

        Controller controller = new Controller();
        controller.runContest(animals);
    }
}
