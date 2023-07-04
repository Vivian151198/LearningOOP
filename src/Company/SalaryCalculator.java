package Company;

import java.util.Arrays;
import java.util.List;

//Utility class || Helper class ||Service class: La 1 class chung chung chuyen giai quyet cho 1 cum doi tuong nao do
public class SalaryCalculator {

    public static void main(String[] args) {
        StandardEmployee standardEmployee = new StandardEmployee();
        CEO ceo = new CEO();
        Manager manager = new Manager();
        //SalaryCalculator salaryCalculator = new SalaryCalculator();
        double totalSalary = totalSalary(Arrays.asList(standardEmployee, ceo, manager));
        System.out.println("Total salary is:" + totalSalary);
    }

    public static double totalSalary(List<Employee> employeeList) {
        double total = 0;

        for (Employee employee : employeeList) {
            total += employee.getSalary();
        }
        return total;
    }

}
