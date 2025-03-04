package exceptionHandelling;

public class InvalidAgeException extends Exception{
	@Override
	public String getMessage() {
		return "Trying to enter wrong age";
	}	
}
