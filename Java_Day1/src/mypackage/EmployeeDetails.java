package mypackage;
import java.util.*;
public class EmployeeDetails {

	int empid;
	double salary;
	String empName;
	Scanner sc;
	public void acceptDetails() {
		sc=new Scanner(System.in);
		empid=sc.nextInt();
		 sc.nextLine(); 
		empName=sc.nextLine();
		salary=sc.nextDouble();
	}
	public void displayDetails() {
		System.out.println("Employee id is: "+empid);
		System.out.println("Employee name is: "+empName);
		System.out.println("Employee salary is: "+salary);
		
	}
	public static void main(String args[]) {
		EmployeeDetails empobj=new EmployeeDetails();
		empobj.acceptDetails();
		empobj.displayDetails();
	}
}
