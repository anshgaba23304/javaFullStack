package collectionframework;
import java.util.*;
public class Sets {
	private Set<Integer> st1;
	private Set<Integer> st2;
	
	public Sets() {
		st1=new HashSet<>();
		st2=new HashSet<>();
	}
	
	public void insert() {
		st1.add(12);
		st1.add(1);
		st1.add(13);
		st1.add(2);
		
		st2.add(12);
		st2.add(120);
		st2.add(30);
		st2.add(1);
	}
	
	public void operations() {
		
		System.out.println("Union is:");
		Set<Integer> unionSet=new HashSet<>(st1);
		unionSet.addAll(st2);
		for(Integer s:unionSet) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("Remove set2 ele from set1:");
		Set<Integer> removeSet=new HashSet<>(st1);
		removeSet.removeAll(st2);
		for(Integer s:removeSet) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("Intersection is :");
		Set<Integer> intersectionSet=new HashSet<>(st1);
		intersectionSet.retainAll(st2);
		for(Integer s:intersectionSet) {
			System.out.print(s+" ");
		}
	}
	public static void main(String[] args) {
		Sets st=new Sets();
		st.insert();
		st.operations();
	}
}
