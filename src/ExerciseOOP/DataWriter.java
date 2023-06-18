package ExerciseOOP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.attribute.UserPrincipal;
import java.util.HashMap;
import java.util.List;

public class DataWriter {

    public void storeBook(List<Book> bookList){
        try (FileOutputStream fileOut = new FileOutputStream("book.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(bookList); // Write the Book object
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void storeUser(List<User> userList){
        try (FileOutputStream fileOut = new FileOutputStream("user.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(userList); // Write the User object
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void storeListUserBorrowBook(HashMap<User, Book> listUserBorrowBook){
        try (FileOutputStream fileOut = new FileOutputStream("user_borrow_book.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(listUserBorrowBook); // Write the Book object
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
