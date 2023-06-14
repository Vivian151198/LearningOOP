package OOPLearning;

public class TestRobotCat {
    public static void main(String[] args) {

        RobotCat robotCat = new RobotCat();
        RobotCat mimi = new RobotCat("mimi");
        mimi.setName("Doraemon");
        System.out.println(mimi.getName());

        mimi.run();
        mimi.runWithSteps(3);

        System.out.println(mimi); // Call toString method to execute
    }
}
