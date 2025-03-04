package project;
import java.util.*;

public class Book {
	  private String bookName;
	    private String authorName;
	    private String description;
	    private int bookId;

	    public Book(int bookId, String bookName, String authorName, String description) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.authorName = authorName;
	        this.description = description;
	    }

	    public int getBookId() {
	        return bookId;
	    }

	    public String getBookName() {
	        return bookName;
	    }

	    public String getAuthorName() {
	        return authorName;
	    }

	    public String getDescription() {
	        return description;
	    }

	    @Override
	    public String toString() {
	        return "Book ID: " + bookId + " | Name: " + bookName + " | Author: " + authorName + " | Description: " + description;
	    }
    
}
