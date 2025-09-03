package model;

public class parkingSlot {
	private int SlotNumber;
	private boolean isOccupied;
	private Vehicle vehicle;
	private SlotType type;
	
	public parkingSlot() {
		
	};
	
	public parkingSlot(int slotNumber, boolean isOccupied, Vehicle vehicle, SlotType type) {
		this.SlotNumber = slotNumber;
		this.isOccupied = isOccupied;
		this.vehicle = vehicle;
		this.type = type;
	}
	
	public boolean isAvaliable() {
		return !isOccupied;
	}
	
	public int getSlotNumber() {
		return SlotNumber;
	}
	
	public boolean isOccupied() {
		return isOccupied;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public SlotType getType() {
		return type;
	}
	
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void setSlotType(SlotType type) {
		this.type = type;
	}
}
