package Exercise28June;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("---------CONSTRAINT------------");
        System.out.println("1.  1 <= s.length <= 104\n" +
                "2. String consists of only English letters and spaces ' '.\n" +
                "3. There will be at least one word in string.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the string!");
        Pattern pattern = Pattern.compile(".*[a-zA-Z]+.*");
        String inputString = scanner.nextLine();
        Matcher matcher = pattern.matcher(inputString); // To check the input string have at least one word.
        boolean userInputCorrect = true;
        do{
            if(((inputString.length() >= 1) && (inputString.length() <= 104)) && (matcher.matches())){
                userInputCorrect = true;
                int lengthOfLastWord = lengthOfLastWord(inputString);
                System.out.println("The length of the last word is:" + lengthOfLastWord);
                break;
            }
            else{
                userInputCorrect = false;
                System.out.println("Please follow the constrain and input again!");
                inputString = scanner.nextLine();
                matcher = pattern.matcher(inputString);
            }
        }
        while (!userInputCorrect);

    }

    public static int lengthOfLastWord(String inputString) {
        List<String> list = new ArrayList<>(Arrays.asList(inputString.split(" ")));
        String lastWord = list.get(list.size() - 1);
        int lengthOfLastWord = lastWord.length();
        return lengthOfLastWord;
    }
}