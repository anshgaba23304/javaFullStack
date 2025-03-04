package mypackage;
import java.sql.*;
import java.util.*;
public class EmployeeDAO {
	private Connection conL;
	private PreparedStatement stat;
	private Scanner sc;
	public EmployeeDAO() {
		conL=DataConnect.getConnection();
		sc=new Scanner(System.in);
	}
	public void insertData()  {
		try {
		System.out.println("How many employees u want to have: ");
		int numOfEmployees=sc.nextInt();
		for(int i=0;i<numOfEmployees;i++) {
			System.out.println("enter employee code: ");
			int ecode=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee name:");
			String ename=sc.nextLine();
			
			System.out.println("Enter Salary");
			double salary=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Address");
			String add=sc.nextLine();
			
			stat=conL.prepareStatement("insert into employee values(?,?,?,?)");
			stat.setInt(1,ecode);
			stat.setString(2, ename);
			stat.setDouble(3, salary);
			stat.setNString(4, add);
			
			int result=stat.executeUpdate();
			
			if(result>0) {
				System.out.println("Data inserted");
			}
		}
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void updateData() {
		try {
		System.out.println("Enter the employee id which u want to update:");
		int empid=sc.nextInt();
		System.out.println("Enter the new salary");
		double newSalary=sc.nextDouble();
		stat=conL.prepareStatement("Update Employee set salary=? where empcode=?");
		stat.setDouble(1, newSalary);
		stat.setInt(2, empid);
		int res=stat.executeUpdate();
		if(res>0) {
			System.out.println("Salary Updated!!");
		}
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void deleteData() {
		try {
			System.out.println("Enter Employee which u want to delete");
			int id=sc.nextInt();
		
			stat=conL.prepareStatement("Delete from Employee where empcode=?");
			stat.setInt(1, id);
			int res=stat.executeUpdate();
			 if (res > 0) {
		            System.out.println("Employee record deleted successfully!");
		        } else {
		            System.out.println("No employee found with the given ID.");
		     }
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void retreiveData() {
		try {
			stat=conL.prepareStatement("Select * from Employee");
			ResultSet result=stat.executeQuery();
			while(result.next()) {
				System.out.println("Employee code is: "+result.getInt(1));
				System.out.println("Employee Name is: "+result.getString(2));
				System.out.println("Employee code is: "+result.getDouble(3));
				System.out.println("Employee Name is: "+result.getString(4));
			}
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		EmployeeDAO eda=new EmployeeDAO();
		//eda.insertData();
		//eda.updateData();
		//eda.deleteData();
		eda.retreiveData();
	}
	
}
