package ExerciseOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    private static final int ADD_BOOK_COMMAND = 1;
    private static final int SEARCH_BOOK_COMMAND = 2;

    private Library library;

    LibraryManager() {
        this.library = new Library();
        this.library.listBook = this.initBooks();
    }

    public void start(){
        showMenu();
        handleUserCommands();
    }

    public void showMenu(){
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
        System.out.println("What do you want?. Please type the number as the menu");
        int userType = scanner.nextInt();

        if (userType == ADD_BOOK_COMMAND) {
            addBook();
        }
        if (userType == SEARCH_BOOK_COMMAND) {
            handleSearchBooks();
        }
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


    private List<Book> initBooks(){
        List<Book> listBook = new ArrayList<>();
        Book book1 = new Book("Doanh Nghiep The Ki 21", "Robert", "1/1/2000", "Available");
        Book book2 = new Book("NDCD", "Bob Burg", "1/1/2000", "Available");
        Book book3 = new Book("NLDKCD", "Robin Sharma", "1/1/2000", "Available");
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        return listBook;
    }
    public void addBook() {
        List<Book> listBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the title of the book:");
        String title = scanner.nextLine();
        System.out.println("Please add the author of the book:");
        String author = scanner.nextLine();
        System.out.println("Please add the publication year of the book:");
        String publicationYear = scanner.nextLine();
        System.out.println("Please add the availability status of the book:");
        String availabilityStatus = scanner.nextLine();

        Book book = new Book(title, author, publicationYear, availabilityStatus);
        listBook.add(book);

        this.library.listBook.addAll(listBook);
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
}
