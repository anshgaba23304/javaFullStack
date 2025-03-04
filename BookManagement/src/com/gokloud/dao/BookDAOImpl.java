package com.gokloud.dao;
import java.util.*;
import java.sql.*;
import com.gokloud.connect.DataConnect;

public class BookDAOImpl implements BookDAO {
	Connection con1;
	PreparedStatement stat;

	public BookDAOImpl() {
		con1=DataConnect.getConnection();
	}
	
	@Override
	public void insertBook(List<Book> blist) {
		try
		{
		stat=con1.prepareStatement("insert into book values(?,?,?,?)");
		for(Book b:blist)
		{
			stat.setInt(1, b.getBookcode());
			stat.setString(2, b.getBookname());
			stat.setDouble(3,b.getPrice());
			stat.setString(4,b.getAuthorName());
			int res=stat.executeUpdate();
			if(res>0)
			{
				System.out.println("Data inserted");
			}
		}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}

	}

	@Override
	public void deleteBook(int id) {
		try {
			System.out.println("Enter book id which u want to delete:");
			
			stat=con1.prepareStatement("Delete from book where bookcode=?" );
			stat.setInt(1, id);
			int res=stat.executeUpdate();
			 if (res > 0) {
	                System.out.println("Book with ID " + id + " deleted successfully.");
	            } else {
	                System.out.println("No book found with ID " + id);
	          }
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void updateBook(Book b) {
		try { 
			stat = con1.prepareStatement("UPDATE book SET bookname = ?, price = ?, authorName = ? WHERE bookcode = ?"); 
	        stat.setString(1, b.getBookname());
	        stat.setDouble(2, b.getPrice());
	        stat.setString(3, b.getAuthorName());
	        stat.setInt(4, b.getBookcode());
	        
	        int res = stat.executeUpdate();
	        if (res > 0) {
	            System.out.println("Book updated successfully.");
	        } else {
	            System.out.println("No book found with ID: " + b.getBookcode());
	        }
	    } catch (SQLException ex) {
	        System.out.println("Error updating book: " + ex.getMessage());
	    }
		
	}

	@Override
	public List<Book> retreiveBook() {
		 List<Book> bookList = new ArrayList<>();
		    
		    try { 
		    	stat = con1.prepareStatement("SELECT * FROM book");
		         ResultSet rs = stat.executeQuery() ;
		        
		        while (rs.next()) {
		            Book book = new Book();
		            book.setBookcode(rs.getInt("bookcode"));
		            book.setBookname(rs.getString("bookname"));
		            book.setPrice(rs.getDouble("price"));
		            book.setAuthorName(rs.getString("authorName"));
		            bookList.add(book);
		        }
		    } catch (SQLException ex) {
		        System.out.println("Error retrieving books: " + ex.getMessage());
		    }
		    
		    return bookList;
	}

}
