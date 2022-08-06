public class Book {
    private final String bookTitle;
    private final String author;
    private int yearPublishing;

    public Book(String bookName, Author author, int yearPublishing) {
        this.author = author.getAuthorSurname() + " " + author.getAuthorName();
        this.bookTitle = bookName;
        this.yearPublishing = yearPublishing;
    }

    public String getAuthor() {
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
