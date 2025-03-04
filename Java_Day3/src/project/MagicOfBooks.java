package project;
import java.util.*;
public class MagicOfBooks {
	 private static Scanner scanner = new Scanner(System.in);
	    private static Map<Integer, Book> books = new HashMap<>();
	    private static User user;
	    
	    private static void initializeBooks() {
	        books.put(101, new Book(101, "Java Basics", "James Gosling", "A book on Java fundamentals"));
	        books.put(102, new Book(102, "Python Guide", "Guido van Rossum", "A comprehensive guide to Python"));
	        books.put(103, new Book(103, "Effective C++", "Scott Meyers", "Tips and best practices for C++"));
	        books.put(104, new Book(104, "Maths", "Ansh Gaba", "Wonderful tricks for Maths"));
	    }
	    
	    private static void searchBooks() {
	        System.out.print("Enter book name or author name to search: ");
	        String keyword = scanner.nextLine().toLowerCase();
	        boolean found = false;
	        
	        for (Book book : books.values()) {
	            if (book.getBookName().toLowerCase().contains(keyword) || book.getAuthorName().toLowerCase().contains(keyword)) {
	                System.out.println(book);
	                found = true;
	            }
	        }
	        
	        if (!found) {
	            System.out.println("No books found matching the search criteria.");
	        }
	    }
	    
	    private static void selectBook() {
	    	System.out.println("Available Books:");
	        for (Book book : books.values()) {
	            System.out.println(book);
	        }

	        System.out.print("Enter Book ID: ");
	        int bookId = scanner.nextInt();
	        scanner.nextLine();
	        
	        if (books.containsKey(bookId)) {
	            Book selectedBook = books.get(bookId);
	            System.out.println("Book Details: " + selectedBook);
	            System.out.print("Enter category (New/Favourite/Completed): ");
	            String category = scanner.nextLine();
	            user.addBookToCategory(selectedBook, category);
	        } else {
	            System.out.println("Book not found!");
	        }
	    }
	  
	    private static void menu() {
	        while (true) {
	        	System.out.println("\n1. View Books");
	            System.out.println("2. Search Books");
	            System.out.println("3. Select and Categorize Book");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    user.displayBooks();
	                    break;
	                case 2:
	                    searchBooks();
	                    break;
	                case 3:
	                    selectBook();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	   

	    public static void main(String[] args) {
	        initializeBooks();
	        System.out.print("Enter Username: ");
	        String username = scanner.nextLine();
	        
	        System.out.print("Enter Email: ");
	        String email = scanner.nextLine();
	        
	        System.out.print("Enter Password: ");
	        String password = scanner.nextLine();
	        
	        user = new User(1, username, email, password);

	        if (user.verifyUser(username, password)) {
	            System.out.println("Login Successful!");
	            menu();
	        } else {
	            System.out.println("Invalid Username or Password!");
	        }
	    }
}
