package inheritance;

public class PermanentEmployee extends Employee {
//	public PermanentEmployee() {
//		
//		System.out.println("Constructor of PermanentEmployee");
//	}
//	public PermanentEmployee(String str1) {
//		super("hello");//super will be used to call constructor of super
//		//class explicitly .but it should be first statement
//	}
//	public static void main(String args[]) {
//		PermanentEmployee pemp1=new PermanentEmployee();
//		PermanentEmployee pemp2=new PermanentEmployee("Java");
//		
//	}
	private double salary;
	@Override
	public void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter salary: ");
		salary=sc.nextDouble();
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Salary is: "+salary);
	}
	
	public static void main(String args[]) {
		PermanentEmployee pemp=new PermanentEmployee();
		pemp.acceptDetails();
		pemp.displayDetails();
	}
	@Override
	public void calculateSalary() {
		System.out.println("Calculate salary for Permanent Employee");
	}
}
