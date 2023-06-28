package HRManagement;

public class CalculateSalary {
    IReadCSV readCSV;

    CalculateSalary(){
        readCSV = new MyReadCSV();
    }

    public void calculateSalary() {
        String salary = readCSV.readCSV("salary-string.csv");
    }
}
