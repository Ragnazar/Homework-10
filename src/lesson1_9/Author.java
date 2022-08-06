package lesson1_9;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }
}