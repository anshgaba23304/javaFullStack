package project;

public class User {
	private String UserName;
	private int password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, int password) {
		super();
		UserName = userName;
		this.password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}


}
