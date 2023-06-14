package OOPLearning;

import java.util.HashMap;
import java.util.Map;

public class TestRobotCatHashMap {

    public static void main(String[] args) {
        Map<String, RobotCat> robotCatList = new HashMap<>();
        robotCatList.put("Meomeo",(new RobotCat("Meomeo")));
    }
}
