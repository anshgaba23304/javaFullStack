package abstractClasses;

public abstract class Vehicle {
	String make;
    String model;
    String fuelType;

    public Vehicle(String make, String model, String fuelType) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
    }

    public abstract void displayInfo();
    public abstract double calculateFuelEfficiency(); // Fuel efficiency calculation

    public void start() {
        System.out.println(make + " " + model + " is starting...");
    }

    public void stop() {
        System.out.println(make + " " + model + " is stopping...");
    }

}
