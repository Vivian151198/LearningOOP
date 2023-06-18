package ExerciseOOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    private static final int ADD_BOOK_COMMAND = 1;
    private static final int SEARCH_BOOK_COMMAND = 2;
    private static final int BORROW_BOOK_COMMAND = 3;

    private Library library;
    private List<User> listUser;
    private DataWriter dataWriter;
    private DataReader dataReader;

    private HashMap<User, Book> listUserBorrowBook = new HashMap<>();

    LibraryManager() {
        this.library = new Library();
        this.dataWriter = new DataWriter();
        this.dataReader = new DataReader();
        this.library.listBook = initBooks();
        this.listUser = initUsers();
        this.listUserBorrowBook = initListUserBorrowBook();
    }

    public void start() {

        for (Book book : library.listBook) {
            System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Status:" + book.getAvailabilityStatus());
        }

        for (User user : listUser) {
            System.out.println("User ID:" + user.getUserID());
        }

        for(User user: listUserBorrowBook.keySet()){
            System.out.println("User ID: " + user.getUserID() + " borrow book title: " + listUserBorrowBook.get(user).getTitle() );
        }
        showMenu();
        handleUserCommands();
    }

    public void showMenu() {
        System.out.println("---------MENU------------");
        System.out.println("1. Add book");
        System.out.println("2. Search book");
        System.out.println("3. Borrow book");
        System.out.println("4. Return book");
        System.out.println("5. Display book");
        System.out.println("6. Exit");
    }

    public void handleUserCommands() {
        Scanner scanner = new Scanner(System.in);
        boolean userWantContinue = true;
        do{
            System.out.println("What do you want?. Please type the number as the menu");
            int userType = scanner.nextInt();

            if (userType == ADD_BOOK_COMMAND) {
                addBook();
            }
            if (userType == SEARCH_BOOK_COMMAND) {
                handleSearchBooks();
            }
            if (userType == BORROW_BOOK_COMMAND) {
                borrowBook();
            }
            System.out.println("Do you want to continue? (1/0)");
            int userAnswer = scanner.nextInt();
            if(userAnswer == 1){

                userWantContinue = true;
            }
            else {
                userWantContinue = false;
            }

        }while (userWantContinue);
    }

    private void handleSearchBooks() {
        List<Book> searchResult = searchBook(this.library.listBook);
        if (searchResult.size() != 0) {
            System.out.println("The book %s exit in the library");
            for (Book book : searchResult) {

                System.out.println(book.getTitle());
            }
        } else {
            System.out.printf("The book %s doesn't exit in the library");
        }
    }

    private HashMap<User, Book> initListUserBorrowBook(){
        HashMap<User, Book> listUserBorrowBook = dataReader.readUserBorrowBookFromStorage();
        return listUserBorrowBook;
    }
    private List<Book> initBooks() {
        List<Book> listBook = dataReader.readBookFromStorage();
//        List<Book> listBook = new ArrayList<>();
//        Book book1 = new Book("Doanh Nghiep The Ki 21", "Robert", "1/1/2000", "Available");
//        Book book2 = new Book("NDCD", "Bob Burg", "1/1/2000", "Available");
//        Book book3 = new Book("NLDKCD", "Robin Sharma", "1/1/2000", "Available");
//        listBook.add(book1);
//        listBook.add(book2);
//        listBook.add(book3);
//        dataWriter.storeBook(listBook);
        return listBook;
    }

    private List<User> initUsers() {
        List<User> userList = dataReader.readUserFromStorage();
//        User user1 = new User("001");
//        User user2 = new User("002");
//        userList.add(user1);
//        userList.add(user2);
//        dataWriter.storeUser(userList);
        return userList;
    }

    public void addBook() {
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the title of the book:");
        String title = scanner.nextLine();
        System.out.println("Please add the author of the book:");
        String author = scanner.nextLine();
        System.out.println("Please add the publication year of the book:");
        String publicationYear = scanner.nextLine();
        System.out.println("Please add the availability status of the book:");
        String availabilityStatus = scanner.nextLine();

        book = new Book(title, author, publicationYear, availabilityStatus);
        library.listBook.add(book);
        dataWriter.storeBook(library.listBook);
    }

    public List<Book> searchBook(List<Book> listBook) {
        List<Book> searchResult = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the title which is the book need to search:");
        String titleOfSearchBook = scanner.nextLine();
        for (Book book1 : listBook) {
            if (book1.getTitle().contains(titleOfSearchBook)) {
                searchResult.add(book1);
            }
        }

        return searchResult;
    }

    private User checkUserID() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your id?");
        String userID = scanner.nextLine();
        for (User user : listUser) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        User userBorrowBook = new User(String.valueOf(listUser.size() + 1));
        listUser.add(userBorrowBook);
        dataWriter.storeUser(listUser);
        return userBorrowBook;
    }

    public void borrowBook() {
        User userBorrowBook = checkUserID();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the book you want to borrow?");
        String bookTitle = scanner.nextLine();
        for (Book book : library.listBook) {
            if (book.getTitle().equals(bookTitle)) {
                if (book.getAvailabilityStatus().equals("Available")) {
                    book.setAvailabilityStatus("Unavailable");
                    dataWriter.storeBook(library.listBook);
                    listUserBorrowBook.put(userBorrowBook, book);
                    dataWriter.storeListUserBorrowBook(listUserBorrowBook);
                    break;
                } else {
                    System.out.println("This book is not available");
                }
            }
        }
    }
}
