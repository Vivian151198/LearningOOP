package lesson06;

public class RobotDog {

    private String name;
    protected static String defaultName;// Don't change => should use "final". Don't have value -> don't have final because can't talk: value of A is nothing.

    RobotDog(){

    }

    public RobotDog(String name) {
        this.name = name;
    }
}
