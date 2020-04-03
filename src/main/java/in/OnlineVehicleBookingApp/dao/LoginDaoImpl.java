package in.OnlineVehicleBookingApp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.OnlineVehicleBookingApp.model.Admin;
import in.OnlineVehicleBookingApp.model.Customer;
@Component
@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public boolean createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean customerLogin(String customerName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean customerResetPassword(String customerName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean adminLogin(String adminName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean adminResetPassword(String adminName, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
