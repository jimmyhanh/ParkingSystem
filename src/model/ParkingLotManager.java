package model;

import storage.DataManager;

public class ParkingLotManager {
	public Vehicle findByPlate(String plate) {
		Vehicle v = null;
		for( Vehicle vehicle : DataManager.registeredVehicles) {
			if(vehicle.getPlateNumber().toLowerCase().equals(plate.toLowerCase())) {
				v = vehicle;
				break;
			}
		}
		return v;
	}
	
	public Ticket findActiveTicketByPlate(String plate) {
		Ticket ticket = null;
		for (Ticket t : DataManager.activeTickets) {
			if (t.getVehicle().getPlateNumber().toLowerCase().equals(plate.toLowerCase())) {
				ticket = t;
				break;
			}
		}
		return ticket;
	}

	public parkingSlot findAvailableSlot(Vehicle vehicle) {
		SlotType[] carTypes = new SlotType[] { SlotType.COMPACT, SlotType.LARGE };
		SlotType[] bikeTypes = new SlotType[] { SlotType.BIKE };
		SlotType[] scooterTypes = new SlotType[] { SlotType.BIKE };
		SlotType[] bicycleTypes = new SlotType[] { SlotType.BICYCLE };
		SlotType[] vanTypes = new SlotType[] { SlotType.LARGE };
		SlotType[] truckTypes = new SlotType[] { SlotType.LARGE };
		SlotType[] busTypes = new SlotType[] { SlotType.LARGE };
		SlotType[] evTypes = new SlotType[] { SlotType.ELECTRIC, SlotType.COMPACT, SlotType.LARGE };
	
		SlotType[] type;
		
		if (vehicle instanceof Car) {
			type = new SlotType[] { SlotType.COMPACT, SlotType.LARGE };
		} else if (vehicle instanceof Bike) {
			type = new SlotType[] { SlotType.BIKE };
		} else if (vehicle instanceof Scooter) {
			type = new SlotType[] { SlotType.BIKE };
		} else if (vehicle instanceof Bicycle) {
			type = new SlotType[] { SlotType.BICYCLE };
		} else if (vehicle instanceof Van) {
			type = new SlotType[] { SlotType.LARGE };
		} else if (vehicle instanceof Truck) {
			type = new SlotType[] { SlotType.LARGE };
		} else if (vehicle instanceof Bus) {
			type = new SlotType[] { SlotType.LARGE };
		} else if (vehicle instanceof EV) {
			type = new SlotType[] { SlotType.ELECTRIC, SlotType.COMPACT, SlotType.LARGE };
		} else {
			type = new SlotType[] {SlotType.LARGE };
		}

		parkingSlot requiredSlot = null;

		for(int i = 0; i < type.length; i++) {
			SlotType slotType = type[i];
			for (int j = 0; j < DataManager.getParkingSlots().size(); j++) {
				parkingSlot slot = DataManager.getParkingSlots().get(j);

				if (slot.getType().equals(slotType) && slot.isAvaliable()) {
					requiredSlot = slot;
					break;
				}
			}
		}
		return requiredSlot;
	}
}
