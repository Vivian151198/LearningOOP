package OOPLearning;

public class CalculatorOverloading {

    //Method signature: Khac so luoong parameter or khac kieu du lieu parameter.

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int sum(int i){
        System.out.println("Sumadasfasf");
        return i;
    }
    //varagrs: always put in the end parameter.
    public int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }


    public static void main(String[] args) {
        CalculatorOverloading calculator = new CalculatorOverloading();
        System.out.printf("%d", calculator.sum(1));
        System.out.printf("Sum:%d", calculator.sum(1,2,3,4));
    }
}
