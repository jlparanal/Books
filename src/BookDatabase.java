import java.util.HashMap;
import java.util.Map;

public class BookDatabase {
        private static BookDatabase instance = null;
        private Map<Integer, String> bookMap;

        // Private constructor to prevent instantiation from outside the class
        private BookDatabase() {
            this.bookMap = new HashMap<Integer, String>();
        }

        // Public static method to get the single instance of the class
        public static BookDatabase getInstance() {
            if (instance == null) {
                instance = new BookDatabase();
            }
            return instance;
        }

        // Add a book to the database
        public void addBook(int id, String title) {
            bookMap.put(id, title);
        }

        // View all books in the database
        public void viewAllBooks() {
            for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        // Remove a book from the database
        public void removeBook(int id) {
            bookMap.remove(id);
        }
}
