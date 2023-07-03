package lesson08;

public class StandardEmp extends Employee {

    @Override
    protected double getSalary(){
        return 3000;
    }

    @Override
    protected double getSupportMoney(){
        return 1000;
    }
}
