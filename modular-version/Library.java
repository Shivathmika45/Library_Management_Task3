import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Books in library:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}
