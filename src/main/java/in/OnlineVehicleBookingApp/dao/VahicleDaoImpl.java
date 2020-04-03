package in.OnlineVehicleBookingApp.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.OnlineVehicleBookingApp.model.Vehicle;
@Repository
@Transactional
public class VahicleDaoImpl implements VahicleDao {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

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

	public Vehicle getVehicle(int vehicleId) {
		// TODO Auto-generated method stub
		return null;
	}
}
