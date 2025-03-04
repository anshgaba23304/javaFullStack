package mypackage;

public class AppMain {
	public static void main(String args[]) {
		Employee emp=new Employee();
		emp.acceptName();
		emp.acceptMobile();
		emp.gradDetails();
		emp.acceptAddress();
		
		System.out.println();
		
		Customer customer=new Customer();
		customer.acceptName();
		customer.acceptMobile();
		customer.gradDetails();
		customer.acceptAddress();
		
		System.out.println();
		
		Vendor vendor=new Vendor();
		vendor.acceptName();
		vendor.acceptMobile();
		vendor.gradDetails();
	}
}
