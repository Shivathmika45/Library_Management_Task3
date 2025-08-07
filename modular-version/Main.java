public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Atomic Habits", "James Clear"));

        User user = new User("Shiva");

        library.showBooks();

        Book bookToIssue = library.findBook("Atomic Habits");
        if (bookToIssue != null) {
            user.issueBook(bookToIssue);
        }

        library.showBooks();
        user.returnBook();
        library.showBooks();
    }
}
