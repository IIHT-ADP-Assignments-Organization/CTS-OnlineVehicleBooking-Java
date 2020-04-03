package in.OnlineVehicleBookingApp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.OnlineVehicleBookingApp.model.Vehicle;
@Service("VahicleService")
@Transactional(readOnly = true)
public class VahicleServiceImpl implements VahicleService {

	public int createVahicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Vehicle getVahicle(int vehicleId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateVahicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteVahicle(Vehicle Vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		return null;
	}
}
