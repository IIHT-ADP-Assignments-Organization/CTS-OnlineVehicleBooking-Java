package in.OnlineVehicleBookingApp.exception;

public class CustomerDoesNotExistException extends Exception {
	public static String message = "customer already exists !..please login";

	public CustomerDoesNotExistException() {

	}

	public CustomerDoesNotExistException(String message) {
		this.message = message;
	}
}
