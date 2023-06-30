package Exercise28June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    //Exercise1
    public int lengthOfLastWord(String inputString) {
        List<String> list = new ArrayList<>(Arrays.asList(inputString.split(" ")));
        String lastWord = list.get(list.size() - 1);
        int lengthOfLastWord = lastWord.length();
        return lengthOfLastWord;
    }

    //Exercise2
    public String convertToTitle(int columnNumber) {
        String columnTitle = "";
        while ((columnNumber >= 1) && (columnNumber <= (Math.pow(2, 31) - 1))) {
            int modulo = (columnNumber - 1) % 26;
            columnTitle = Character.toString((char) (65 + modulo)) + columnTitle;
            columnNumber = (columnNumber - modulo) / 26;
        }

        return columnTitle;
    }

    //Exercise3
    public String addStrings(String num1, String num2) {
        String sumStrings = "";
        int missedNumber = 0;
        int sum = 0;
        if (num1.length() > num2.length()) {
            int num = num1.length() - num2.length();
            String addedString = "";
            for (int i = 0; i < num; i++) {
                addedString = "0" + addedString;
            }

            num2 = addedString + num2;
        }

        if (num2.length() > num1.length()) {
            int num = num2.length() - num1.length();
            String addedString = "";
            for (int i = 0; i < num; i++) {
                addedString = "0" + addedString;
            }

            num1 = addedString + num1;
        }

        for (int i = num2.length() - 1; i >= 0; i--) {
            String a = String.valueOf(Integer.parseInt(String.valueOf(num1.charAt(i))) + (Integer.parseInt(String.valueOf(num2.charAt(i)))) + missedNumber);
            sum = Integer.parseInt(a);
            sumStrings = String.valueOf(a.charAt(a.length() - 1)) + sumStrings;
            if (sum / 10 == 1) {
                missedNumber = 1;
            } else {
                missedNumber = 0;
            }
        }

        if (missedNumber == 1) {
            sumStrings = String.valueOf(missedNumber) + sumStrings;
        }
        return sumStrings;
    }
}
