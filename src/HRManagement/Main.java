package HRManagement;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        IRun[] animals = new IRun[2];
        animals[0] = cat;
        animals[1] = dog;
        animalRace(animals);
    }

    public static void animalRace(IRun[] animals) {
        for (IRun animal : animals) {
            animal.run();
        }
    }
}
