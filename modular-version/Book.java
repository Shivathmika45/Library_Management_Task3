public class Book {
    String title;
    String author;
    boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issue() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public boolean isAvailable() {
        return !isIssued;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (Available: " + isAvailable() + ")";
    }
}
