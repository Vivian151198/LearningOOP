package OOPLearning;

import java.util.ArrayList;
import java.util.List;

public class TestRobotCat2 {

    public static void main(String[] args) {

        List<RobotCat> robotCatList = new ArrayList<>();
        RobotCat mimi = new RobotCat("mimi");
        
        robotCatList.add(mimi);
        robotCatList.add(mimi);
        robotCatList.add(mimi);

        for (RobotCat robotCat : robotCatList) {
            System.out.println("Rot name:" +robotCat.getName());
        }

        //mimi.setName("Meomeo");
        robotCatList.get(1).setName("Doraemon");

        for (RobotCat robotCat : robotCatList) {
            System.out.println("Rot name:" +robotCat.getName());
        }
    }
}
