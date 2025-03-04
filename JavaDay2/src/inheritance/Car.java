package inheritance;

public class Car extends Vehicle{
	private int numDoors;
	private boolean hasAC;
	public Car(String make, String model, String fuelType,int numDoors,boolean hasAC) {
		super(make, model, fuelType);
		this.numDoors=numDoors;
		this.hasAC=hasAC;
	}
	@Override
	public void display() {
		 super.display();
	     System.out.println("Doors: " + numDoors + ", Air Conditioning: " + (hasAC ? "Yes" : "No"));
	}
	
}
