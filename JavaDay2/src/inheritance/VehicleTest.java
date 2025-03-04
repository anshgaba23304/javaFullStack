package inheritance;

public class VehicleTest {
	public static void main(String args[]) {
		Car car = new Car("Mahindra", "BE 6e", "Petrol", 4, true);
		Truck truck = new Truck("Tata", "G-17", "Diesel", 5.0);
		Motorcycle motorcycle = new Motorcycle("Honda", "R15", "Petrol", "Triple-Cylinder");
		car.start();
        car.display();
        car.stop();
        
        System.out.println();
        
        truck.start();
        truck.display();
        truck.stop();

        System.out.println();

        motorcycle.start();
        motorcycle.display();
        motorcycle.stop();
	}
}
