package mypackage;
import java.sql.*;
public class DataConnect {
	private static Connection con;
	public DataConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagement","root","1234");
			System.out.println("Connected");
			// jdbc: protocol
//			mysql:sunprotocol;
//			localhost:address of machine where mysql is installed
//			3306- port number
//			employeeManagenent-database name
//			userName-root
//			password-1234
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Unable to load driver");
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static Connection getConnection() {
		DataConnect dc=new DataConnect();
		return con;
	}
	public static void main(String[] args) {
		getConnection();
	}
}
