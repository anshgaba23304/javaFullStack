package collectionframework;
import java.util.*;
public class ListDemo {
	private List<Integer> listData;
	
	public ListDemo() {
		listData=new ArrayList<>();
	}
	public void operations() {
		listData.add(30);
		listData.add(20);
		listData.add(13);
		listData.add(25);
		listData.add(9);
		for(Integer i:listData) {
			System.out.println("Value is: "+i);
		}
		System.out.println("After removal:");
		listData.remove(2);
		for(Integer i:listData) {
			System.out.println("Value is: "+i);
		}
		
		if(listData.contains(20)) {
			System.out.println("Yes number is in the list");
		}
		else {
			System.out.println("No number is not in the list");
		}
		
		System.out.println(listData.indexOf(30));
		System.out.println(listData.lastIndexOf(9));
	}
	
	public static void main(String[] args) {
		ListDemo ldemo=new ListDemo();
		ldemo.operations();
	}
}
