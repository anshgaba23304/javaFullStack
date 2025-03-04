package mypackage;
import java.util.*;
public class BankAccount {
	private double balance;
	private double amount;
	public Scanner sc;
	public BankAccount() {
		sc=new Scanner(System.in);
	}
	public BankAccount(int x) {
		System.out.println("Value of x is:"+x);
	}
	public void accept() {
		System.out.println("Enter Balance:");
		balance=sc.nextDouble();
		System.out.println("Enter Amount:");
		amount=sc.nextDouble();
	}
	public void deposit() {
		double updateAmount=balance+amount;
		System.out.println("New balance is: "+updateAmount);
	}
	public void withdraw() {
		double newBalance=balance-amount;
		System.out.println("New Balance is: "+newBalance);
	}
	public static void main(String args[]) {
		BankAccount bankobj=new BankAccount();
		BankAccount obj=new BankAccount(10);
		bankobj.accept();
		bankobj.deposit();
		bankobj.withdraw();
	}
}
