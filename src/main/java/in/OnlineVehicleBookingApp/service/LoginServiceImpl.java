package in.OnlineVehicleBookingApp.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.OnlineVehicleBookingApp.model.Admin;
import in.OnlineVehicleBookingApp.model.Customer;
@Service("LoginService")
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService {

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
