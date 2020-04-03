package in.OnlineVehicleBookingApp.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.OnlineVehicleBookingApp.dao.AdminDao;
import in.OnlineVehicleBookingApp.dao.CustomerDao;
import in.OnlineVehicleBookingApp.dao.LoginDao;
import in.OnlineVehicleBookingApp.dao.VahicleDao;
import in.OnlineVehicleBookingApp.exception.AdminAlreadyExistException;
import in.OnlineVehicleBookingApp.exception.AdminDoesNotExistException;
import in.OnlineVehicleBookingApp.exception.CustomerAlreadyExistException;
import in.OnlineVehicleBookingApp.exception.CustomerDoesNotExistException;
import in.OnlineVehicleBookingApp.model.Admin;
import in.OnlineVehicleBookingApp.model.Customer;
import in.OnlineVehicleBookingApp.model.Vehicle;
import in.OnlineVehicleBookingApp.service.LoginService;

public class TestException {
	
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
		adminDao = context.getBean(AdminDao.class);
		customerDao = context.getBean(CustomerDao.class);
		loginDao = context.getBean(LoginDao.class);
		vahicleDao = context.getBean(VahicleDao.class);
	}

	@Test
	public void testForAdminRegistration() throws AdminAlreadyExistException { 
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("xyz");
		admin.setAdminPassword("1234");
		admin.setBranchLocation("5.6");
		admin.setBranchAddress("75");
		admin.setPhoneNo("9876543210");
		admin.setEmail("8765432190");
		
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.createAdmin(admin);
		Assert.assertEquals(AdminAlreadyExistException.message, "admin already exists !..please login");
	}

	@Test
	public void testForAdminLogin() throws AdminDoesNotExistException {
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("xyz");
		admin.setAdminPassword("1234");
		admin.setBranchLocation("5.6");
		admin.setBranchAddress("75");
		admin.setPhoneNo("9876543210");
		admin.setEmail("8765432190");
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.adminLogin(admin.getAdminName(), admin.getAdminPassword());
		Assert.assertEquals(AdminDoesNotExistException.message, "admin already exists !..please login");
	}

	@Test
	public void testForCustomerRegistration() throws CustomerAlreadyExistException { 
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("aaa");
		customer.setPassword("aaa");
		customer.setDOB("aaa");
		customer.setAddress("aaa");
		customer.setEmailId("aaa");
		customer.setMobileNo("aaa");
		customer.setOccupation("aaa");

		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.createCustomer(customer);
		Assert.assertEquals(CustomerAlreadyExistException.message, "customer already exists !..please login");
	}

	@Test
	public void testForCustomerLogin() throws CustomerDoesNotExistException { 
		Customer customer = new Customer();
		customer.setCustomerID(1);
		customer.setCustomerName("aaa");
		customer.setPassword("aaa");
		customer.setDOB("aaa");
		customer.setAddress("aaa");
		customer.setEmailId("aaa");
		customer.setMobileNo("aaa");
		customer.setOccupation("aaa");
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.customerLogin(customer.getCustomerName(), customer.getPassword());
		Assert.assertEquals(CustomerDoesNotExistException.message, "customer already exists !..please login");
	}
	 
}