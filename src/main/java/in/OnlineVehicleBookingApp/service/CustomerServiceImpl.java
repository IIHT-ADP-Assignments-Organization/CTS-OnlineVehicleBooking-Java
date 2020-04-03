package in.OnlineVehicleBookingApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.OnlineVehicleBookingApp.model.Customer;

@Service("CustomerService")
@Transactional(readOnly = true)
public class CustomerServiceImpl implements CustomerService {

	public int createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean statusCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
