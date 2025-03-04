package interfacepackage;

public class GreetingLambda {
	public void show() {
		Greeting goodMorning=(val)->{
			return val;
		};
		Greeting goodEvening=(val)->{
			return val;
		};
		Greeting goodNight=(val)->{
			return val;
		};
		
		System.out.println(goodMorning.message("Good Morning Everyone"));
		System.out.println(goodEvening.message("Good Evening Everyone"));
		System.out.println(goodNight.message("Good Night Everyone"));
	}
	
	public static void main(String args[]) {
		GreetingLambda glamb=new GreetingLambda();
		glamb.show();
	}
}
