package inheritance;
import java.util.*;
public class Vehicle {
	protected Scanner sc;
	private String make;
	private String model;
	private String fuelType;
	
	public Vehicle(String make,String model,String fuelType) {
		this.make=make;
		this.model=model;
		this.fuelType=fuelType;
	}
	public void start() {
		System.out.println(make +" "+ model+" is starting");
	}
	public void stop() {
		System.out.println(make+" "+ model+" is stopping");
	}
	public void display() {
		System.out.println("Make: "+make+" Model: "+model+" fuel type: "+fuelType);
	}
	
}
