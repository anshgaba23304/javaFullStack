package inheritance;

public class TempEmployee extends Employee{
	private double contAmount;
	private double contDuration;
	
	@Override
	public void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter the Amount:");
		contAmount=sc.nextDouble();
		System.out.println("Enter the Duration:");
		contDuration=sc.nextDouble();
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Amount is: "+contAmount);
		System.out.println("Duration is: "+contDuration);
	}
	@Override
	public void calculateSalary() {
		System.out.println("Calculation salary of temp employee");
	}
	public static void main(String args[]) {
		Employee obj=null;
		obj=new PermanentEmployee();
		obj.acceptDetails();
		obj.displayDetails();
		obj.calculateSalary();
		TempEmployee temp=new TempEmployee();
		temp.acceptDetails();
		temp.displayDetails();
	}
}
