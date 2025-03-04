package abstractClasses;

public  class MotorCycle extends Vehicle{
	 String engineType;

	    public MotorCycle(String make, String model, String fuelType, String engineType) {
	        super(make, model, fuelType);
	        this.engineType = engineType;
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Motorcycle Details:");
	        System.out.println("Make: " + make + ", Model: " + model + ", Fuel Type: " + fuelType);
	        System.out.println("Engine Type: " + engineType);
	    }

	    @Override
	    public double calculateFuelEfficiency() {
	        return 30.0;
	    }
}
