package project;
import java.util.*;
public class UserMain {
	private Scanner sc;
	private List<User> ls;
	
	public UserMain() {
		sc=new Scanner(System.in);
		ls=new LinkedList<>();
		User user1=new User("Ansh",1289);
		User user2=new User("Arora",1290);
		User user3=new User("Mittal",1297);
		ls.add(user1);
		ls.add(user2);
		ls.add(user3);
	}
	
	public void authenticateUser() {
		System.out.println("Enter the User name");
		String name=sc.nextLine();
		System.out.println("Enter the password");
		int pass=sc.nextInt();
		sc.nextLine();
		
		final boolean[] isValid= {false};
		ls.stream().filter(user -> user.getUserName().equals(name) && user.getPassword() == pass)
        .forEach(user -> {
            System.out.println("User is Valid");
            isValid[0] = true; 
        });
		if(!isValid[0]) {
			System.out.println("Invalid User");
		}
	}
	
	public static void main(String[] args) {
        UserMain userMain = new UserMain();
        userMain.authenticateUser();
    }
}
