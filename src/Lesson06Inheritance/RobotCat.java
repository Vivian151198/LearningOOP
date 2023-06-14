package Lesson06Inheritance;

public class RobotCat {
    // Super class || Parent Class
    private String name;
    private String productionDate;

    public RobotCat() {

    }

    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public void charge(){
        System.out.println("Charging.....");
    }
}
