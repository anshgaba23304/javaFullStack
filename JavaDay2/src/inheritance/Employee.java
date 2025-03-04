package inheritance;
import java.util.*;
public abstract class Employee {
	protected Scanner sc;
	private int employeeId;
	private String empname;
	
	public Employee() {
		sc=new Scanner(System.in);
		System.out.println("Constructor of Employee");
	}

	public void acceptDetails() {
		System.out.println("Enter Employee id:");
		employeeId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee Name: ");
		empname=sc.nextLine();
	}
	
	public void displayDetails() {
		System.out.println("Employee id is: "+employeeId);
		System.out.println("Employee Name is: "+empname);
	}
	
	public abstract void calculateSalary();
}
