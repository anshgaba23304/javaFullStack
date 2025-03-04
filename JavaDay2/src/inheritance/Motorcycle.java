package inheritance;

public class Motorcycle extends Vehicle{
	 String engineType;

	    public Motorcycle(String make, String model, String fuelType, String engineType) {
	        super(make, model, fuelType);
	        this.engineType = engineType;
	    }

	    @Override
	    public void display() {
	        super.display();
	        System.out.println("Engine Type: " + engineType);
	    }
}
