package storage;

import java.util.ArrayList;
import model.parkingSlot;
import model.Ticket;
import model.Vehicle;

public class DataManager {
	private static ArrayList<parkingSlot> parkingSlots;
	public static ArrayList<Ticket> activeTickets;
	private static ArrayList<Ticket> ticketHistory;
	public static ArrayList<Vehicle> registeredVehicles;
	
	
	public static ArrayList<parkingSlot> getParkingSlots() {
		return parkingSlots;
	}
	public static void setParkingSlots(ArrayList<parkingSlot> parkingSlots) {
		DataManager.parkingSlots = parkingSlots;
	}
	
	public static ArrayList<Ticket> getActiveTickets() {
		return activeTickets;
	}
	public static void setActiveTickets(ArrayList<Ticket> activeTickets) {
		DataManager.activeTickets = activeTickets;
	}
	
	public static ArrayList<Ticket> getTicketHistory() {
		return ticketHistory;
	}
	public static void setTicketHistory(ArrayList<Ticket> ticketHistory) {
		DataManager.ticketHistory = ticketHistory;
	}
}
