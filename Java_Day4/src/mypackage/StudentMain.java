package mypackage;

public class StudentMain {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentId(1);
		s1.setStudentName("Ansh");
		s1.setScore(499);
		
		Student s2=new Student();
		s2.setStudentId(1);
		s2.setStudentName("Ansh");
		s2.setScore(499);
		
		if(s1.equals(s2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}
}
