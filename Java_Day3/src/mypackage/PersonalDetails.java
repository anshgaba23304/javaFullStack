package mypackage;

public interface PersonalDetails {
	int x=30;
	public void acceptName();
	public void acceptMobile();
	public default void acceptAddress() {
		System.out.println("Accept Addresses");
	}
}
