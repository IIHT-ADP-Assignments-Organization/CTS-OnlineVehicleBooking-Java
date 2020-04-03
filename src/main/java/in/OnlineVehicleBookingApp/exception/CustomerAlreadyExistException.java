package in.OnlineVehicleBookingApp.exception;

public class CustomerAlreadyExistException extends Exception {
	public static String message = "customer already exists !..please login";
	public CustomerAlreadyExistException() {

	}

	public CustomerAlreadyExistException(String message) {
		this.message = message;
	}
}
