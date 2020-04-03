package in.OnlineVehicleBookingApp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.OnlineVehicleBookingApp.model.Admin;

public class TestBoundary {

	@Test
	public void testPasswordLength() {
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("xyz");
		admin.setAdminPassword("12345");
		admin.setBranchLocation("5.6");
		admin.setBranchAddress("75");
		admin.setPhoneNo("9876543210");
		admin.setEmail("shashi.2346@gmail.com");

		int passwordLength = 5;
		assertEquals(passwordLength, admin.getAdminPassword().length());
	}

	@Test
	public void testPhoneNumberLength() {
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("xyz");
		admin.setAdminPassword("12345");
		admin.setBranchLocation("5.6");
		admin.setBranchAddress("75");
		admin.setPhoneNo("9876543210");
		admin.setEmail("shashi.2346@gmail.com");

		int phoneNumberLength=10;
		int getLengthOfNumber = ((admin.getPhoneNo()).length());
		assertEquals(phoneNumberLength, getLengthOfNumber);
	}

	@Test
	public void testUserNameLength() {
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("xyzabc");
		admin.setAdminPassword("123456");
		admin.setBranchLocation("5.6");
		admin.setBranchAddress("75");
		admin.setPhoneNo("9876543210");
		admin.setEmail("shashi.2346@gmail.com");
		
		int maxChar = 5;
		boolean usernameLength = ((admin.getAdminName().length()) >= maxChar);
		assertEquals(usernameLength, true);
	}

}
