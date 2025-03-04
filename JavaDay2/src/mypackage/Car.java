package mypackage;
import java.util.*;
public class Car {
	private String maker;
	private String model;
	private int year;
	private String color;
	Scanner sc;
	public Car() {
		sc=new Scanner(System.in);
		maker="Unknown";
		model="Unknown";
		year=0;
		color="Unknown";
	}
	
	public Car(String maker,String model,int year,String color) {
		this.maker=maker;
		this.model=model;
		this.year=year;
		this.color=color;
	}
	public Car(String maker,String model) {
		this.maker=maker;
		this.model=model;
		this.year=0;
		this.color="Unknown";
		
	}
	
    public Car(String maker, int year) {
    	this.maker=maker;
		this.model="Unknown";
		this.year=year;
		this.color="Unknown";
		
    }
	
    public void displayCar() {
        System.out.println("Maker: " + maker + ", Model: " + model + ", Year: " + year + ", Color: " + color);
    }
    public static void main(String args[]) {
    	Car car1=new Car();
    	car1.displayCar();
    	
    	Car car2=new Car("Hyundai","Venue",2024,"White");
    	car2.displayCar();
    	
    	Car car3=new Car("Mahindra","BE 6e");
    	car3.displayCar();
    	
    	Car car4=new Car("Tata",2023);
    	car4.displayCar();
    }
}
