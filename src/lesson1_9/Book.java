package lesson1_9;

public class Book {
    private final String title;
    private final Author author;
    private int yearPublishing;




    public Book(String title, Author author, int yearPublishing) {
        this.author = author;
        this.title = title;
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
