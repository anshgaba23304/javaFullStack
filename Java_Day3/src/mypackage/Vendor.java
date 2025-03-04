package mypackage;

public class Vendor implements PersonalDetails,EducationDetails {

	@Override
	public void acceptName() {
		System.out.println("Name of Vendor");
		
	}

	@Override
	public void acceptMobile() {
		System.out.println("Number of Vendor");	
	}

	@Override
	public void gradDetails() {
		System.out.println("Vendor is 12th passout");
		
	}

}
