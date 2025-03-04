package interfacepackage;

public class SquareAndCube {
	public void display() {
		Number sq=(x)->{
			System.out.println("Square is: "+x*x);
		};
		Number cube=(x)->{
			System.out.println("Cube is: "+x*x*x);
		};
		
		sq.calculate(4);
		cube.calculate(5);
	}
	public static void main(String args[]) {
		SquareAndCube sc=new SquareAndCube();
		sc.display();
	}
}
