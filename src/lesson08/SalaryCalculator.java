package lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        StringBuilder str = new StringBuilder();
        Employee ceo = new CEO();
        Employee manager = new Manager();
        Employee standardEmployee = new StandardEmp();
        standardEmployee = new CEO(); //Polymorphism

        employees.add(manager);
        employees.add(ceo);
        employees.add(standardEmployee);
        System.out.println(getTotalSalary(employees));
    }

    //Controller
    public static double getTotalSalary(List<Employee> employees){
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary() + employee.getSupportMoney();
        }
        return totalSalary;
    }

}
