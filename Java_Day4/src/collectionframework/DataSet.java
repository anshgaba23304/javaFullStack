package collectionframework;
import java.util.*;
public class DataSet {
	private Set<String> setStr;
	private Scanner sc;
	
	public DataSet() {
		sc=new Scanner(System.in);
		setStr=new HashSet<>();
	}
	public void insert() {
		setStr.add("one");
		setStr.add("two");
		setStr.add("three");
		setStr.add("one");
		setStr.add("two");
		setStr.add("four");
	}
	public void display() {
		for(String s:setStr) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		DataSet ds=new DataSet();
		ds.insert();
		ds.display();
	}
}
