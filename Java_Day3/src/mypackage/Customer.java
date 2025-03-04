package mypackage;

public class Customer implements PersonalDetails,EducationDetails{

	@Override
	public void acceptName() {
		System.out.println("Name of Customer");
		
	}

	@Override
	public void acceptMobile() {
		
		System.out.println("Number of Customer");
	}
	
	@Override
	public void gradDetails() {
		System.out.println("Customer is Phd Scholar");
	}
}
