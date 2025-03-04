package collectionframework;
import java.util.*;
public class EmployeeMap {
	private Map<Integer,Employee> mpp;
	private Scanner sc;
	public EmployeeMap() {
		sc=new Scanner(System.in);
		mpp=new HashMap<>();
	}
	
	public void insertData() {
		System.out.println("Enter how many employee details u want to have:");
		int numOfEmployees=sc.nextInt();
		for(int i=0;i<numOfEmployees;i++) {
			Employee e=new Employee();
			
			System.out.println("Enter Employee code:");
			int ecode=sc.nextInt();
			e.setEmpId(ecode);
			sc.nextLine();
			
			System.out.println("Enter Employee name:");
			e.setEmpName(sc.nextLine());
			
			System.out.println("Enter Salary");
			e.setSalary(sc.nextInt());
			
			mpp.put(ecode,e);
		}
	}
	
	public void retreiveData() {
		Set<Map.Entry<Integer,Employee>> set=mpp.entrySet();
		for(Map.Entry<Integer,Employee> val:set) {
			System.out.println("Key is: "+val.getKey());
			System.out.println("Name is: "+ val.getValue().getEmpName()+" \nSalary is: "+val.getValue().getSalary());
			
		}
	}
	public static void main(String[] args) {
		EmployeeMap em=new EmployeeMap();
		em.insertData();
		em.retreiveData();
	}

}
