package mypackage;

public class Books {
	private int bookCode;
	private String bookName;
	private double price;
	private int quantity;
	
	
	public Books() {
		
	}


	public int getBookCode() {
		return bookCode;
	}


	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Books(int bookCode, String bookName, double price, int quantity) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.price = price;
		this.quantity = quantity;
	}
	
}
