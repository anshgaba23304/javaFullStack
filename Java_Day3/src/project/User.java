package project;
import java.util.*;
public class User {
	 private String userName;
	    private int userId;
	    private String emailId;
	    private String password;
	    private List<Book> newBooks = new ArrayList<>();
	    private List<Book> favourite = new ArrayList<>();
	    private List<Book> completed = new ArrayList<>();

	    public User(int userId, String userName, String emailId, String password) {
	        this.userId = userId;
	        this.userName = userName;
	        this.emailId = emailId;
	        this.password = password;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public boolean verifyUser(String userName) {
	        return this.userName.equals(userName);
	    }

	    public void addBookToCategory(Book book, String category) {
	        switch (category.toLowerCase()) {
	            case "new":
	                newBooks.add(book);
	                break;
	            case "favourite":
	                favourite.add(book);
	                break;
	            case "completed":
	                completed.add(book);
	                break;
	            default:
	                System.out.println("Invalid category!");
	                return;
	        }
	        System.out.println("Book added to " + category + " list.");
	    }
	    
	    public boolean verifyUser(String userName, String password) {
	        return this.userName.equals(userName) && this.password.equals(password);
	    }
	    
	    public void displayBooks() {
	        System.out.println("New Books: " + newBooks);
	        System.out.println("Favourite Books: " + favourite);
	        System.out.println("Completed Books: " + completed);
	    }
	
}
