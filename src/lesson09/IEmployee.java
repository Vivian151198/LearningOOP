package lesson09;

public interface IEmployee {

    /*
    * 1. Don't have access modifier
    *2. Interface is public, so don't need to define.
    * 3. static double getSalary(); => Error: Static methods in interfaces should have a body
    * */
    double getSalary();
    double getSupportSalary();
}
