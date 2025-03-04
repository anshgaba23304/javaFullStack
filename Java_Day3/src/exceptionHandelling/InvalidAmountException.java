package exceptionHandelling;

public class InvalidAmountException extends Exception{
	@Override
	public String getMessage() {
		return "Amount is greater than balance!!";
	}
}
