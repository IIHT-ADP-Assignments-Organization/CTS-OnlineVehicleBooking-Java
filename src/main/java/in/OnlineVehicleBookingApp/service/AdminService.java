package in.OnlineVehicleBookingApp.service;

import in.OnlineVehicleBookingApp.model.Admin;
import in.OnlineVehicleBookingApp.model.Customer;
import in.OnlineVehicleBookingApp.model.Vehicle;

public interface AdminService {
	int createAdmin(Admin admin);
	boolean deleteAdmin(Admin admin);	
}
