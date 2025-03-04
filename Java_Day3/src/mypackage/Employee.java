package mypackage;

public class Employee implements PersonalDetails, EducationDetails{
	
	@Override
	public void acceptName() {
		System.out.println("Value is:"+ PersonalDetails.x);
		System.out.println("Name of Employee");
		
	}

	@Override
	public void acceptMobile() {
		System.out.println("Number of Employee");
		
	}
	@Override
	public void gradDetails() {
		System.out.println("Employee is Btech Undergraduate");
	}
	
	@Override
	public void acceptAddress() {
		System.out.println("Employee's address");
	}
}
