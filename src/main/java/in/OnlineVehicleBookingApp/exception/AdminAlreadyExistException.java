package in.OnlineVehicleBookingApp.exception;

public class AdminAlreadyExistException extends Exception {
public static  String message="admin already exists !..please login";


public AdminAlreadyExistException()
{
	
}
public AdminAlreadyExistException(String message)
{
	this.message=message;
}
}
