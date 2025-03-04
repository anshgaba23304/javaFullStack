package mypackage;
import java.util.*;

public class ListOfOddNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String name=sc.nextLine();
		double num=sc.nextDouble();
		System.out.println(name);
		System.out.println(num);
		for(int i=1;i<=n;i+=2) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
