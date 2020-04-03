package in.OnlineVehicleBookingApp.dao;

import in.OnlineVehicleBookingApp.model.Admin;
import in.OnlineVehicleBookingApp.model.Customer;
import in.OnlineVehicleBookingApp.model.Vehicle;

public interface AdminDao {
	int createAdmin(Admin admin);
	boolean deleteAdmin(Admin admin);	
}
