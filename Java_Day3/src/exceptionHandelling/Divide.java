package exceptionHandelling;
import java.util.*;
public class Divide {
	private Scanner sc;
	private int num1;
	private int num2;
	public void operation() {
		try {
			sc=new Scanner(System.in);
			System.out.println("Enter number1:");
			num1=sc.nextInt();
			System.out.println("Enter number2:");
			num2=sc.nextInt();
			System.out.println("Num1/Num2 is: "+num1/num2);
		}catch(ArithmeticException e){
			System.err.println(e);
			System.out.println("Invalid Operation");
		}
	}
	public static void main(String args[]) {
		Divide num=new Divide();
		num.operation();
	}
}
