package ExerciseOOP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataReader {

    public List<Book> readBookFromStorage(){
        List<Book> bookList = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream("book.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
             bookList = (List<Book>) objectIn.readObject(); // Read the Book object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public List<User> readUserFromStorage(){
        List<User> userList = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream("user.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            userList = (List<User>) objectIn.readObject(); // Read the user object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public HashMap<User, Book> readUserBorrowBookFromStorage(){
        HashMap<User, Book> listUSerBorrowBook = new HashMap<>();
        try (FileInputStream fileIn = new FileInputStream("user_borrow_book.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            listUSerBorrowBook =(HashMap<User, Book>) objectIn.readObject(); // Read the Book and User object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listUSerBorrowBook;
    }
}
