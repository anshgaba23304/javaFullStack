package abstractClasses;

public  class Truck extends Vehicle {
	double loadCapacity; 

    public Truck(String make, String model, String fuelType, double loadCapacity) {
        super(make, model, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Details:");
        System.out.println("Make: " + make + ", Model: " + model + ", Fuel Type: " + fuelType);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

    @Override
    public double calculateFuelEfficiency() {
        return 8.0;
    }
}
