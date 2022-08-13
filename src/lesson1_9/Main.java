package lesson1_9;

public class Main {
    static Book[] books = new Book[5];
    static Author[] authors = new Author[4];

    static void addBook(String title, Author author, int year) {
        int i = 0;
        while (i < books.length) {
            if (books[i] == null) {
                books[i] = new Book(title, author, year);
                break;
            }
            i++;
        }
    }

    static void toString(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthor().getName() + " " + book.getAuthor().getSurname() + ": " + book.getTitle() + ": " + book.getYearPublishing());
            }
        }
    }

    public static void main(String[] args) {
        authors[0] = new Author("Alexander", "Pushkin");
        authors[1] = new Author("Jack", "London");
        authors[2] = new Author("Stephen", "King");
        authors[3] = new Author("Robert Louis", "Stevenson");

        books[0] = new Book("Capitan's daughter", authors[0], 1991);
        books[1] = new Book("Call of the wild", authors[1], 1950);

        books[1].setYearPublishing(1957);
        addBook("The Stand", authors[2], 1978);
        addBook("Treasure island", authors[3], 1967);

        toString(books);
    }


}

