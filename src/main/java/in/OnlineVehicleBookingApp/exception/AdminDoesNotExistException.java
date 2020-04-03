package in.OnlineVehicleBookingApp.exception;

public class AdminDoesNotExistException extends Exception {
	public static String message = "admin already exists !..please login";

	public AdminDoesNotExistException() {

	}

	public AdminDoesNotExistException(String message) {
		this.message = message;
	}
}
