package mypackage;
import java.util.*;
public class StudentMain {
	private Scanner sc;
	private Student studentArr[];
	private int numOfStudent;
	public StudentMain() {
		sc=new Scanner(System.in);
		System.out.println("Enter number of students u want to have:");
		numOfStudent=sc.nextInt();
		sc.nextLine();
		studentArr=new Student[numOfStudent];
	}
	public void insert() {
		for(int i=0;i<numOfStudent;i++) {
			studentArr[i]=new Student();
			System.out.println("Enter student code: ");
			studentArr[i].setStudentId(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Enter student name: ");
			studentArr[i].setStudentName(sc.nextLine());
			
			System.out.println("Enter student score: ");
			studentArr[i].setScore(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Enter student address: ");
			studentArr[i].setAddress(sc.nextLine());
		}
	}
	public void display() {
		for(int i=0;i<numOfStudent;i++) {
			System.out.println("Student code is:"+ studentArr[i].getStudentId());
			System.out.println("Student name is:"+ studentArr[i].getStudentName());
			System.out.println("Student score is:"+ studentArr[i].getScore());
			System.out.println("Student Address is:"+ studentArr[i].getAddress());
		}
	}
	public void update() {
		System.out.println("Enter Student id which u want to update: ");
		int studentid=sc.nextInt();
		for(int i=0;i<studentArr.length;i++) {
			if(studentid==studentArr[i].getStudentId()) {
				System.out.println("Enter new Score: ");
				studentArr[i].setScore(sc.nextInt());
				break;
			}
			
		}
	}
	public static void main(String args[]) {
		StudentMain smain=new StudentMain();
		smain.insert();
		smain.display();
		System.out.println("Update details: ");
		smain.update();
		smain.display();
	}
}
