package in.OnlineVehicleBookingApp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.OnlineVehicleBookingApp.model.Admin;
import in.OnlineVehicleBookingApp.model.Customer;

@Repository
@Transactional
public class AdminDaoImpl implements AdminDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public boolean deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public int createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}
}
