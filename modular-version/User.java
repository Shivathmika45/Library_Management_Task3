public class User {
    String name;
    Book issuedBook;

    public User(String name) {
        this.name = name;
    }

    public void issueBook(Book book) {
        if (book.isAvailable()) {
            book.issue();
            issuedBook = book;
            System.out.println(name + " has issued: " + book.title);
        } else {
            System.out.println(book.title + " is already issued.");
        }
    }

    public void returnBook() {
        if (issuedBook != null) {
            issuedBook.returnBook();
            System.out.println(name + " has returned: " + issuedBook.title);
            issuedBook = null;
        } else {
            System.out.println("No book to return.");
        }
    }
}
