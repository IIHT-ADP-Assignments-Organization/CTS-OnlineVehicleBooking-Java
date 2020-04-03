package in.OnlineVehicleBookingApp.dao;

import in.OnlineVehicleBookingApp.model.Customer;

public interface CustomerDao {
	
	int createCustomer(Customer customer);

	Customer getCustomer(int customerId);

	boolean updateCustomer(Customer customer);

	boolean deleteCustomer(Customer customer);

	boolean statusCustomer(Customer customer);

}
