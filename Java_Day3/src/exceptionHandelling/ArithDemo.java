package exceptionHandelling;
import java.util.*;
public class ArithDemo {
	private Scanner sc;
	int number;
	public void acceptDetails() {
		try {
			System.out.println("Enter any number");
			number=sc.nextInt();
			System.out.println("Number is "+number);
		}
		catch(NullPointerException ex) {
			System.err.println(ex);
			System.out.println("Not allocation memory");
		}
		

	}
	public static void main(String args[]) {
		ArithDemo num=new ArithDemo();
		num.acceptDetails();
	}
}
