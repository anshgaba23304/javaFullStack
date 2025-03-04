package mypackage;
import java.util.*;
public class BankAccount {
	Scanner sc;
	int balance=0;
	int accNumber;
	String accountHolder;
	public void enterDetails() {
		sc=new Scanner(System.in);
		accNumber=sc.nextInt();
		sc.nextLine();
		accountHolder=sc.nextLine();
	}
	public void deposit(int amount) {
		balance+=amount;
	}
	public void withdraw(int amount) {
		if(balance>amount) {
			balance-=amount;
		}
		else {
			System.out.print("Insufficient balance");
		}
	}
	public void details() {
		System.out.println("Account Number: "+accNumber);
		System.out.println("Account Holder's name: "+accountHolder);
		System.out.println("Account balance: "+ balance);
	}
	public static void main(String args[]) {
		BankAccount customer=new BankAccount();
		customer.enterDetails();
		customer.deposit(500);
		customer.withdraw(200);
		customer.details();
	}
}
