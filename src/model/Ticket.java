package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
	private int ID;
	private Vehicle vehicle;
	private LocalDateTime entryTime;
	private LocalDateTime exitTime;
	private double totalFee;
	private int slotNumber;

	public static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm");

	public Ticket() {

	}

	public Ticket(int ID, Vehicle vehicle, LocalDateTime entryTime, LocalDateTime exitTime, double totalFee,
			int slotNumber) {
		this.ID = ID;
		this.vehicle = vehicle;
		this.entryTime = entryTime;
		this.exitTime = exitTime;
		this.totalFee = totalFee;
		this.slotNumber = slotNumber;
	}

	public int getID() {
		return ID;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public String getEntryDate() {
		return dataFormat.format(entryTime);
	}

	public String getEntryTime() {
		return timeFormat.format(entryTime);
	}

	public String getExitDate() {
		return dateFormat.format(exitTime);
	}

	public String getExitTimeTOString() {
		return timeFormat.format(exitTime);
	}

	public double getTotalFee() {
		return totalFee;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

}
