package lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLoginPage {

    public static void main(String[] args) {
//        testInternalLoginPage();
//        testExternalLoginPage();

        //LoginPage loginPage = new LoginPage(); -> Can't initialize one object from abstract class,
        // because we can't talk: Please create a general object, require: specific object


        //Compare between 2 declaration.
        LoginPage loginPage = new InternalLoginPage(); // Best practice because can't change this object to another class (Polymorphism). Khởi tạo
                                                        //1 cái gì đó chung chung, sau đó có 1 logic gì cần thay đổi thì mình có thể đi cụ thể hóa nó.
        //InternalLoginPage loginPage = new InternalLoginPage(); // Cụ thể hóa -> Finally mình muốn dùng thì mới đi cụ thể hóa nó.

        String input = "abc";
        loginPage = new ExternalLoginPage();

        List<String> str1 = Arrays.asList("abc, bcd"); // can't add or remove
        List<String> str3 = new ArrayList<>(Arrays.asList("abc, bcd")); // can add or remove
        //asList: create a list and fit length, so can't add or remove element from the list, but you can update the element value

        str1.add("vcb"); // Compile time don't have error, but "run time" have error =? You'll see error: UnsupportedOperationException
        // a = 2; // Compile time exception.

        List<String > str2 = new ArrayList<>();
        str2.add("abc");
        str2.add("abc");// Can do that because array list can extend the length

    }

    private static void testExternalLoginPage() {
        LoginPage loginPage = new InternalLoginPage();
        loginPage.login();
    }

    private static void testInternalLoginPage() {

        LoginPage loginPage = new ExternalLoginPage();
        loginPage.login();
    }
}
