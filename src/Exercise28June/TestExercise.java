package Exercise28June;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestExercise {

    public static void main(String[] args) {

        Solution solution = new Solution();
        //Exercise1
//        System.out.println("---------------EXERCISE1---------------");
//        System.out.println("---------CONSTRAINT------------");
//        System.out.println("1.  1 <= s.length <= 104\n" +
//                "2. String consists of only English letters and spaces ' '.\n" +
//                "3. There will be at least one word in string.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input the string!");
//        Pattern pattern = Pattern.compile(".*[a-zA-Z]+.*");
//        String inputString = scanner.nextLine();
//        Matcher matcher = pattern.matcher(inputString); // To check the input string have at least one word.
//        boolean userInputCorrect = true;
//        do{
//            if(((inputString.length() >= 1) && (inputString.length() <= 104)) && (matcher.matches())){
//                userInputCorrect = true;
//                int lengthOfLastWord = solution.lengthOfLastWord(inputString);
//                System.out.println("The length of the last word is:" + lengthOfLastWord);
//                break;
//            }
//            else{
//                userInputCorrect = false;
//                System.out.println("Please follow the constrain and input again!");
//                inputString = scanner.nextLine();
//                matcher = pattern.matcher(inputString);
//            }
//        }
//        while (!userInputCorrect);
//
//        // EXERCISE2
//        System.out.println("------------------EXERCISE2-------------");
//        String columnTitle = solution.convertToTitle(2000);
//        System.out.println(columnTitle);

        // EXERCISE3
        System.out.println("------------------EXERCISE3-------------");
//
//        String num1 = "123";
//        String num2 = "121";
//        String a = String.valueOf(Integer.parseInt(String.valueOf(num1.charAt(num1.length() - 1))) +(Integer.parseInt(String.valueOf(num2.charAt(num1.length() - 1)))));
//        int sum1 = Integer.parseInt(a);
//        System.out.println(sum1);
//
//        String c = "1";.
//        String d = "2";
//        String e = d + c;
//        System.out.println(e);

        String sumStrings = solution.addStrings("987654321", "888777999");
        System.out.println(sumStrings);
    }
}