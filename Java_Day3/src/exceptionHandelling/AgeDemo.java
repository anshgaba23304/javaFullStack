package exceptionHandelling;
import java.util.*;
public class AgeDemo {
	private Scanner sc;
	private int age;
	public AgeDemo() {
		sc=new Scanner(System.in);
	}
	public void checkAge()throws InvalidAgeException{
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		if(age<18) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("Age is: "+age);
		}
	}
	
	public static void main(String args[]) {
		AgeDemo age=new AgeDemo();
		try {
			age.checkAge();
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
