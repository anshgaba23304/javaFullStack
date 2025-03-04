package abstractClasses;

public class VehicleManagementSystem{
	 public static void main(String[] args) {
	        Car car = new Car("Toyota", "Camry", "Petrol", 4, true);
	        Truck truck = new Truck("Ford", "F-150", "Diesel", 5.0);
	        MotorCycle motorcycle = new MotorCycle("Yamaha", "R15", "Petrol", "Single-Cylinder");

	        car.start();
	        car.displayInfo();
	        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
	        car.stop();

	        System.out.println();

	        truck.start();
	        truck.displayInfo();
	        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
	        truck.stop();

	        System.out.println();

	        motorcycle.start();
	        motorcycle.displayInfo();
	        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
	        motorcycle.stop();
	 }
}
