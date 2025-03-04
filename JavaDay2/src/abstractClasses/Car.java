package abstractClasses;

public  class Car extends Vehicle {
	int numDoors;
    boolean hasAirConditioning;

    public Car(String make, String model, String fuelType, int numDoors, boolean hasAirConditioning) {
        super(make, model, fuelType);
        this.numDoors = numDoors;
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make + ", Model: " + model + ", Fuel Type: " + fuelType);
        System.out.println("Doors: " + numDoors + ", Air Conditioning: " + (hasAirConditioning ? "Yes" : "No"));
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0;
    }
}
