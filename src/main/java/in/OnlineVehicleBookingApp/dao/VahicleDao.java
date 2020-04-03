package in.OnlineVehicleBookingApp.dao;

import java.util.List;

import in.OnlineVehicleBookingApp.model.Vehicle;

public interface VahicleDao {
	boolean updateVehicle(Vehicle vehicle);
	int createVahicle(Vehicle vehicle);
	Vehicle getVehicle(int vehicleId);
	boolean deleteVahicle(Vehicle Vehicle);	
	List<Vehicle> getAllVehicle();
}
