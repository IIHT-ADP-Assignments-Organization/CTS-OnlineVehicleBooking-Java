package in.OnlineVehicleBookingApp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.OnlineVehicleBookingApp.model.Customer;
import in.OnlineVehicleBookingApp.model.Vehicle;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
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

	public boolean searchVahicle(Vehicle vahicle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean statusCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
