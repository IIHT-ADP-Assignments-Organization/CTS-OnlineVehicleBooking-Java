package in.OnlineVehicleBookingApp.service;

import java.util.List;

import in.OnlineVehicleBookingApp.model.Vehicle;

public interface VahicleService {
	int createVahicle(Vehicle vehicle);
	Vehicle getVahicle(int vehicleId);
	boolean updateVahicle(Vehicle vehicle);
	boolean deleteVahicle(Vehicle Vehicle);	
	List<Vehicle> getAllVehicle();
}
