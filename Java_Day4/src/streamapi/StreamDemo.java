package streamapi;
import java.util.stream.*;
import java.util.*;
public class StreamDemo {
	private List<Integer> ls;
	public StreamDemo() {
		ls=new ArrayList<>();
		ls.add(30);
		ls.add(1);
		ls.add(40);
		ls.add(50);
	}
	public void processData() {
		ls.stream().filter(num->(num>10)).forEach(x->{
			System.out.println("value is:"+x);
		});
	}
	public void findSquare() {
		ls.stream().map(str->(str*str)).forEach(data->{
			System.out.println("value is:"+data);
		});
	}
	public void sortData() {
		ls.stream().sorted().forEach(data->{
			System.out.println("Data is "+data);
		});
	}
	public static void main(String[] args) {
		StreamDemo sobj=new StreamDemo();
		sobj.processData();
		sobj.findSquare();
		sobj.sortData();
	}
}
