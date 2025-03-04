package assignment;

public class Car implements LandVehicle{

	@Override
	public void start() {
		System.out.println("Car is started");
	}

	@Override
	public void stop() {
		System.out.println("Car is Stopped");
		
	}

	@Override
	public String getType() {
		System.out.println("Car's Type:");
		return "Modified";
	}

	@Override
	public void TwoTyres() {
		System.out.println("Car is not two Typres.");
		
	}

	@Override
	public void FourTyres() {
		System.out.println("Car is four Typres.");
		
	}

}
