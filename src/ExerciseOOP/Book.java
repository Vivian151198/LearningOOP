package ExerciseOOP;

public class Book {

    private String title;
    private String author;
    private String publicationYear;
    private String availabilityStatus;

    public Book() {
    }

    public Book(String title, String author, String publicationYear, String availabilityStatus) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.availabilityStatus = availabilityStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", availabilityStatus='" + availabilityStatus + '\'' +
                '}';
    }
}
