package lesson1_9;

public class Book {
    private final String bookTitle;
    private final Author author;
    private int yearPublishing;




    public Book(String bookName, Author author, int yearPublishing) {
        this.author = new Author(author.getSurname(), author.getName());
        this.bookTitle = bookName;
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
