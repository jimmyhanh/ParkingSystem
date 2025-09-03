package model;

public abstract class Vehicle implements Payable{
	private String plateNumber;
	private int ownerID;
	private Color color;
	private String brand;
	private String model;
	
	public void setPlateNumber(String plateNUmber) {
		this.plateNumber = plateNumber;
	}
	
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	
	public int getOwnerID() {
		return ownerID;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public Color getColor() {
		return color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}	
}
