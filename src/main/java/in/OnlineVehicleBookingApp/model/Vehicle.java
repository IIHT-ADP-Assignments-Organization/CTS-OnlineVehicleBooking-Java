package in.OnlineVehicleBookingApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
	@Id
	@Column(name = "vahicleId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vahicleId;
	
	@Column(name = "manufacturerName")
	private String manufacturerName ;
	
	@Column(name = "exShowroomPrice")
	private String exShowroomPrice;
	
	@Column(name = "noOfVehiclesInStock")
	private int noOfVehiclesInStock; 
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "seatingCapacity")
	private String seatingCapacity;
	
	@Column(name = "branchLocation")
	private String branchLocation;

	public int getVahicleId() {
		return vahicleId;
	}

	public void setVahicleId(int vahicleId) {
		this.vahicleId = vahicleId;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getExShowroomPrice() {
		return exShowroomPrice;
	}

	public void setExShowroomPrice(String exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}

	public int getNoOfVehiclesInStock() {
		return noOfVehiclesInStock;
	}

	public void setNoOfVehiclesInStock(int noOfVehiclesInStock) {
		this.noOfVehiclesInStock = noOfVehiclesInStock;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
}
