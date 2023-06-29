package Exercise28June;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("---------CONSTRAINT------------");
        System.out.println(" 1 <= s.length <= 104\n" +
                "s consists of only English letters and spaces ' '.\n" +
                "There will be at least one word in s.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the string!");
        String inputString = scanner.nextLine();
        if((inputString.length() <1) || (inputString.length() > 104)){
            System.out.println("Please follow the constraint and input the string again!");
            inputString = scanner.nextLine();
        }
        else{
            if (inputString.contains("s")){
                List<String> list = new ArrayList<>(Arrays.asList(inputString.split(" ")));
                String lastWord = list.get(list.size() - 1);
                int lengthOfLastWord = lastWord.length();
                System.out.printf("The last word is %s with length %d", lastWord, lengthOfLastWord);
            }
            else {
                System.out.println("Please follow the constraint and input the string again!");
                inputString = scanner.nextLine();
            }
        }
    }
}
