package inheritance;

public class Truck extends Vehicle{
	double loadCapacity;
	public Truck(String make, String model, String fuelType, double loadCapacity) {
        super(make, model, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
