package in.OnlineVehicleBookingApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Column(name = "customerID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerID;
	
	@Column(name = "customerName")
	private String customerName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "DOB")
	private String DOB;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "mobileNo")
	private String mobileNo;
	
	@Column(name = "occupation")
	private String occupation;

	@Column(name = "status")
	private String status;
	
	enum status{
		Pending, Activated, Rejected 
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
