package leetcode;

import java.util.HashMap;

public class DecodeTheMessage {

    public static void main(String[] args) {
        String a = decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
        System.out.println(a);
    }

    public static String decodeMessage(String key, String message) {
        String decodeMessage = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        key = key.replace(" ", "");
        System.out.println(key);
        String removedRepeatedCharInKeyString = String.valueOf(key.charAt(0));
        boolean check = true;
        for (int i = 1; i < key.length(); i++) {
            for (int j = 0; j < removedRepeatedCharInKeyString.length(); j++) {
                if (key.charAt(i) != removedRepeatedCharInKeyString.charAt(j)) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                removedRepeatedCharInKeyString += key.charAt(i);
            }
        }

        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < removedRepeatedCharInKeyString.length(); i++) {
            hashMap.put(removedRepeatedCharInKeyString.charAt(i), alphabet.charAt(i));
        }
        for (int i = 0; i < message.length(); i++) {
            for (Character _key : hashMap.keySet()) {
                if (message.charAt(i) == ' ') {
                    decodeMessage += " ";
                    break;
                }
                if (message.charAt(i) == _key) {
                    decodeMessage += hashMap.get(_key);
                    break;
                }
            }
            //System.out.println("key: " + _key + " value: " + hashMap.get(_key));
        }
        return decodeMessage;
    }
}
