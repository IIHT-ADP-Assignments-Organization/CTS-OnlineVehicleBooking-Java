package in.OnlineVehicleBookingApp.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.OnlineVehicleBookingApp.dao.AdminDao;
import in.OnlineVehicleBookingApp.dao.CustomerDao;
import in.OnlineVehicleBookingApp.dao.LoginDao;
import in.OnlineVehicleBookingApp.dao.VahicleDao;
import in.OnlineVehicleBookingApp.model.Admin;
import in.OnlineVehicleBookingApp.model.Customer;
import in.OnlineVehicleBookingApp.model.Vehicle;
import in.OnlineVehicleBookingApp.service.VahicleService;

public class TestFunctional {

	private static AnnotationConfigApplicationContext context;
	private static AdminDao adminDao;
	private static CustomerDao customerDao;
	private static LoginDao loginDao;
	private static VahicleDao vahicleDao;

	private Admin admin;
	private Customer customer;
	private Vehicle vehicle;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("in.OnlineVehicleBookingApp");
		context.refresh();
		adminDao = (AdminDao) context.getBean(AdminDao.class);
		customerDao = (CustomerDao) context.getBean(CustomerDao.class);
		vahicleDao = (VahicleDao) context.getBean(VahicleDao.class);
		loginDao = (LoginDao) context.getBean(LoginDao.class);
	}

	@Test
	public void testGetAllVahicleList() {
		Vehicle vehicle = new Vehicle();
		vehicle.setVahicleId(1);
		vehicle.setManufacturerName("tvs");
		vehicle.setExShowroomPrice("100000");
		vehicle.setNoOfVehiclesInStock(25);
		vehicle.setColor("Black");
		vehicle.setSeatingCapacity("5");
		vehicle.setBranchLocation("Birambuga");

		VahicleService vahicleService = (VahicleService) context.getBean(VahicleService.class);
		List<Vehicle> patientFromDB = vahicleService.getAllVehicle();
		assertEquals(vehicle, patientFromDB);
	}

	
	@Test
	public void testCreateAdmin() {
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("xyzabc");
		admin.setAdminPassword("123456");
		admin.setBranchLocation("5.6");
		admin.setBranchAddress("75");
		admin.setPhoneNo("9876543210");
		admin.setEmail("shashi.2346@gmail.com");		
		assertEquals("Saved in to admin table", admin.getAdminId(), adminDao.createAdmin(admin));
	}
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("Shashidhar");
		customer.setPassword("nonofyourbussiness");
		customer.setDOB("11-11-1998");
		customer.setAddress("Hyderabad");
		customer.setEmailId("Shashi.2346@gmail.com");
		customer.setMobileNo("9494879694");
		customer.setOccupation("S/W Engi");
		customer.setStatus("activated");				
		assertEquals("Saved in to admin table", customer.getCustomerID(), customerDao.createCustomer(customer));
	}
	
	@Test
	public void testCreateVahicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setVahicleId(1);
		vehicle.setManufacturerName("tvs");
		vehicle.setExShowroomPrice("100000");
		vehicle.setNoOfVehiclesInStock(25);
		vehicle.setColor("Black");
		vehicle.setSeatingCapacity("5");
		vehicle.setBranchLocation("Birambuga");
		assertEquals("Saved in to admin table", vehicle.getVahicleId(), vahicleDao.createVahicle(vehicle));
	}
	
	@Test
	public void testUpdateStatus() {
		customerDao.statusCustomer(customer);
		customer.getStatus();
		assertEquals("updating data Diagnosis from table", true, customerDao.statusCustomer(customer));
	}


	@Test
	public void testGetVahicle() {
		vehicle = vahicleDao.getVehicle(1);
		assertEquals("getting data Diagnosis from table", 1, vehicle.getVahicleId());
	}

	@Test
	public void testUpdateVahicle() {
		vahicleDao.getVehicle(1);
		vehicle.setNoOfVehiclesInStock(23);
		assertEquals("updating data Diagnosis from table", true, vahicleDao.updateVehicle(vehicle));
	}

	@Test
	public void testDeleteVahicle() {
		vehicle = vahicleDao.getVehicle(1);
		assertEquals("deleting data Diagnosis from table", true, vahicleDao.deleteVahicle(vehicle));
	}

		 
}
