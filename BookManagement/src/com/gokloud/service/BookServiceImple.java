package com.gokloud.service;
import java.util.*;

import com.gokloud.dao.Book;
import com.gokloud.dao.BookDAOImpl;
public class BookServiceImple implements BookService{

	private Scanner sc;
	private List<Book> booklist;
	private BookDAOImpl bookdao;
	
	public BookServiceImple() {
		sc=new Scanner(System.in);
		booklist=new ArrayList<>();
		bookdao=new BookDAOImpl();
	}

	@Override
	public void insertBook() {
		System.out.println("Enter number of books u want to have:");
		int noOfBooks=sc.nextInt();
		sc.nextLine(); 
		for(int i=0;i<noOfBooks;i++) {
			Book b=new Book();
			System.out.println("Enter book id");
			b.setBookcode(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Enter book name:");
			b.setBookname(sc.nextLine());
			
			System.out.println("Enter book price:");
			b.setPrice(sc.nextDouble());
			sc.nextLine();
			System.out.println("Enter Author name:");
			b.setAuthorName(sc.nextLine());
			
			booklist.add(b);
		
		}
		bookdao.insertBook(booklist);
		
	}

	@Override
	public void deleteBook() {
		System.out.println("Enter book ID to delete:");
        int bookId = sc.nextInt();
        bookdao.deleteBook(bookId);
		
	}

	@Override
	public void updateBoook() {
		 System.out.println("Enter book ID to update:");
		    int bookId = sc.nextInt();
		    sc.nextLine(); 

		    System.out.println("Enter new book name:");
		    String newBookName = sc.nextLine();

		    System.out.println("Enter new book price:");
		    double newPrice = sc.nextDouble();
		    sc.nextLine();

		    System.out.println("Enter new author name:");
		    String newAuthor = sc.nextLine();

		    Book book = new Book();
		    book.setBookcode(bookId);
		    book.setBookname(newBookName);
		    book.setPrice(newPrice);
		    book.setAuthorName(newAuthor);

		    bookdao.updateBook(book);
		
	}

	@Override
	public void retreiveData() {
		List<Book> books = bookdao.retreiveBook();
	    
	    if (books.isEmpty()) {
	        System.out.println("No books available.");
	    } else {
	        System.out.println("Book List:");
	        for (Book b : books) {
	            System.out.println("ID: " + b.getBookcode() + ", Name: " + b.getBookname() +
	                               ", Price: " + b.getPrice() + ", Author: " + b.getAuthorName());
	        }
	    }
	}

}
