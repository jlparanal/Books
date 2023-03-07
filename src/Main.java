public class Main {
    public static void main(String[] args) {
        BookDatabase bookDb = BookDatabase.getInstance();

        bookDb.addBook(1, "To Kill a Mockingbird");
        bookDb.addBook(2, "1984");
        bookDb.addBook(3, "Pride and Prejudice");
        bookDb.addBook(4, "Harry Potter and The Sorcerer's Stone");
        System.out.println("-------------------------");

        System.out.println("All books:");
        bookDb.viewAllBooks();
        System.out.println("-------------------------");

        System.out.println("Removing book with ID 2");
        bookDb.removeBook(2);
        System.out.println("-------------------------");

        System.out.println("All books after removal:");
        bookDb.viewAllBooks();
    }
}