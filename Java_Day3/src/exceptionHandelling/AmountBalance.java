package exceptionHandelling;
import java.util.*;
public class AmountBalance {
	private Scanner sc;
	private double amount;
	private double balance;
	public AmountBalance() {
		sc=new Scanner(System.in);
	}
	public void display() {
		try {
			amount=sc.nextDouble();
			balance=sc.nextDouble();
			if(amount>balance) {
				throw new InvalidAmountException();
			}
			else {
				System.out.println("Satisfied with amount");
			}

		}
		catch(InvalidAmountException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String args[]) {
		AmountBalance ab=new AmountBalance();
		ab.display();
	}
}
