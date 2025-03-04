package mypackage;
import java.util.*;
public class BookMain {
	private List<Books> bookList;
	private Scanner sc;
	public BookMain() {

		sc=new Scanner(System.in);
		Books b1=new Books(1,"JavaBook",1000,2);
		Books b2=new Books(2,"Spring",1500,1);
		Books b3=new Books(3,"Angular",2000,3);
		bookList=new LinkedList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}
	public void searchByBookId() {
		System.out.println("Enter book id:");
		int id=sc.nextInt();
		sc.nextLine();
		bookList.stream().filter(book->book.getBookCode()==id).forEach(x->{
			System.out.println("Book Name is: "+x.getBookName());
			System.out.println("Price is: "+x.getPrice());
		});
	}
	public void searchByBookName() {
		System.out.println("Enter the book name:");
		String book=sc.nextLine();
		
		bookList.parallelStream().filter(b->b.getBookName().equals(book)).forEach(x->{
			System.out.println("Book Id is: "+x.getBookCode());
			System.out.println("Book Price is:"+ x.getPrice());
		});
	}
	
	public void findTotalPrice() {
		double total=bookList.stream().mapToDouble(b->b.getPrice()).sum();
		System.out.println("Sum is: "+total);
	}
	public static void main(String[] args) {
		BookMain bmain=new BookMain();
		//bmain.searchByBookId();
		//bmain.searchByBookName();
		bmain.findTotalPrice();
	}
}
