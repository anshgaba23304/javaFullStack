package exceptionHandelling;
import java.util.*;
public class MultipleException {	
	private Scanner sc;
	int arr[];
	public MultipleException() {
		sc=new Scanner(System.in);
		arr=new int[4];
	}
	public void acceptNumber() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value:");
			arr[i]=sc.nextInt();
		}
	}
	public void divied() {
		try {
			System.out.println("Enter index number for first value:");
			int index1=sc.nextInt();
			System.out.println("Enter index of second value:");
			int index2=sc.nextInt();
			double result=arr[index1]/arr[index2];
			System.out.println("Result is: "+result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Trying to divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Beyond Limit");
		}
		catch(Exception ex) {
			System.err.println(ex);
			System.out.println("Any Exception");
		}
		
	}
	public static void main(String args[]) {
		MultipleException ex=new MultipleException();
		ex.acceptNumber();
		ex.divied();
	}
}
