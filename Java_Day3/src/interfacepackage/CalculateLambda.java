package interfacepackage;

public class CalculateLambda{
	public void display() {
		Calculator cadd=(x,y)->{
			System.out.println("Result of addition: "+(x+y));
		};
		Calculator csub=(x,y)->{
			System.out.println("Result of subtraction: "+(x-y));
		};
		cadd.calculate(90, 40);
		csub.calculate(60, 10);
	}

	public static void main(String args[]) {
		CalculateLambda clam=new CalculateLambda();
		clam.display();
	}
}
