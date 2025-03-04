package collectionframework;
import java.util.*;
public class QueueDemo {
	private Queue<Integer> q;
	public QueueDemo() {
		q=new LinkedList<>();
		q.add(1);
		q.offer(3);
		q.add(4);
		System.out.println("Retrive elements without removing");
		System.out.println("Element is "+q.element()); 
		System.out.println("Element is "+q.peek());
		
		
		System.out.println("Retreving and removing:");
		System.out.println("Element is"+q.remove());
		System.out.println("Element is "+q.poll());
	}
	public static void main(String[] args) {
		QueueDemo q=new QueueDemo();
		
	}

}
