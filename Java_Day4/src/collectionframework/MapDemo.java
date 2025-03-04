package collectionframework;
import java.util.*;
public class MapDemo {
	private Map<Integer,String> mpp;
	private Scanner sc;
	public MapDemo() {
		sc=new Scanner(System.in);
		mpp=new HashMap<>();
	}
	public void insert() {
		System.out.println("Enter how many items u want to have:");
		int numOfItems =sc.nextInt();
		sc.nextLine();
		for(int i=0;i<numOfItems;i++) {
			System.out.print("Enter the value:");
			String val=sc.nextLine();
			mpp.put(i, val);
		}
	}
	public void display() {
		
		Set<Map.Entry<Integer, String>> mppSet=mpp.entrySet();
		for(Map.Entry<Integer, String> val:mppSet) {
			System.out.println("Key is: "+val.getKey());
			System.out.println("Value is: "+val.getValue());
		}
	}
	public void checkValue() {
		System.out.println("Enter the value which you want to search:");
		String value=sc.nextLine();
		Set<Map.Entry<Integer, String>> mppSet=mpp.entrySet();
		for(Map.Entry<Integer,String> val:mppSet) {
			if(val.getValue().equals(value)) {
				System.out.println("Found!!");
				break;
			}
		}
	}
	public static void main(String[] args) {
		MapDemo mobj=new MapDemo();
		mobj.insert();
		mobj.display();
		mobj.checkValue();
	}

}
