package in.OnlineVehicleBookingApp.dao;

import in.OnlineVehicleBookingApp.model.Admin;
import in.OnlineVehicleBookingApp.model.Customer;

public interface LoginDao {
	
	boolean createCustomer(Customer customer);
	boolean customerLogin(String customerName,String password);
	boolean customerResetPassword(String customerName,String password);
	
	boolean createAdmin(Admin admin);
	boolean adminLogin(String adminName,String password);
	boolean adminResetPassword(String adminName,String password);
	
	
}
