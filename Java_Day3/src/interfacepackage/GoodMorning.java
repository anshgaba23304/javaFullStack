package interfacepackage;

public class GoodMorning {
	public void display() {
		Communicator gm=()->{
			System.out.println("Good Morning");
		};
		Communicator gv=()->{
			System.out.println("Good Evening");
		};
		Communicator gn=()->{
			System.out.println("Good Night");
		};
		gm.message();
		gv.message();
		gn.message();
	}
	public static void main(String args[]) {
		GoodMorning good=new GoodMorning();
		good.display();
	}
}
