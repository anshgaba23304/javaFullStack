package mypackage;
import java.util.*;
public class StudentGradeCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int subjects=sc.nextInt();
		int[] arr=new int[subjects];
		
		for(int i=0;i<subjects;i++) {
			arr[i]=sc.nextInt();
		}
		int average=0;
		for(int i=0;i<subjects;i++) {
			average+=arr[i];
		}
		double result=average/subjects;
		System.out.print(name+" has average of:"+ result);
		sc.close();
	}
}
