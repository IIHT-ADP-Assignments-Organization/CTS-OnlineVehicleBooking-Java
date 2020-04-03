package in.OnlineVehicleBookingApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.OnlineVehicleBookingApp.model.Admin;

@Service("AdminService")
@Transactional(readOnly = true)
public class AdminServiceImpl implements AdminService {

	public int createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

}
