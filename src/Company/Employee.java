package Company;

public class Employee {

    private String name;
    private double salary;

    Employee(){

    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return 0.0;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
