package mypackage;
import java.util.*;
public class Student {
	private int studentId;
	private String studentName;
	private int score;
	private String address;
	
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentName(String StudentName) {
		this.studentName =StudentName;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public int getScore() {
		return this.score;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return this.address;
	}
}
