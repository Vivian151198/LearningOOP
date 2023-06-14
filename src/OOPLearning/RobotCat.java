package OOPLearning;

public class RobotCat {
    private String name;

    //Constructor: no parameter.
    public RobotCat() {
    }

    //Constructor: 1 parameter
    public RobotCat(String name) {
        this.name = name;
    }

    //Getters
    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name; // argument
    }

    //Methods | parameter: a template/ signature | argument: real value

    public void run() {
        System.out.println("Running...");
    }

    public void runWithSteps(int steps) {
        for (int initStep = 0; initStep < steps; initStep++) {
            System.out.printf("Running at step %d\n", initStep + 1);
        }
    }

    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
