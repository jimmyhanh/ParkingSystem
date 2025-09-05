package test;

import java.time.LocalDateTime;
import java.time.Duration;
import model.*;

public class ParkingSystemTest {
    public static void main(String[] args) {
        testFindByPlate();
        testFindActiveTicketByPlate();
        testFindAvailableSlot();
        testParkingSlotAvailability();
        testVehicleSettersAndGetters();
        testCalculateFee();
        testTicketSettersAndGetters();
    }

    public static void testFindByPlate() {
        ParkingLotManager manager = new ParkingLotManager();
        Vehicle v = manager.findByPlate("ABC123");
        if (v == null) {
            System.out.println("testFindByPlate PASSED");
        } else {
            System.out.println("testFindByPlate FAILED");
        }
    }

    public static void testFindActiveTicketByPlate() {
        ParkingLotManager manager = new ParkingLotManager();
        Ticket t = manager.findActiveTicketByPlate("ABC123");
        if (t == null) {
            System.out.println("testFindActiveTicketByPlate PASSED");
        } else {
            System.out.println("testFindActiveTicketByPlate FAILED");
        }
    }

    public static void testFindAvailableSlot() {
        ParkingLotManager manager = new ParkingLotManager();
        Vehicle v = new Car();
        parkingSlot slot = manager.findAvailableSlot(v);
        if (slot == null) {
            System.out.println("testFindAvailableSlot PASSED");
        } else {
            System.out.println("testFindAvailableSlot FAILED");
        }
    }

    public static void testParkingSlotAvailability() {
        parkingSlot slot = new parkingSlot(1, false, null, null);
        if (slot.isAvaliable()) {
            System.out.println("testParkingSlotAvailability PASSED (available)");
        } else {
            System.out.println("testParkingSlotAvailability FAILED (available)");
        }
        slot.setOccupied(true);
        if (!slot.isAvaliable()) {
            System.out.println("testParkingSlotAvailability PASSED (occupied)");
        } else {
            System.out.println("testParkingSlotAvailability FAILED (occupied)");
        }
    }

    public static void testVehicleSettersAndGetters() {
        Car car = new Car();
        car.setPlateNumber("XYZ789");
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setOwnerID(1);
        boolean pass = true;
        pass &= "XYZ789".equals(car.getPlateNumber());
        pass &= "Toyota".equals(car.getBrand());
        pass &= "Corolla".equals(car.getModel());
        pass &= (car.getOwnerID() == 1);
        if (pass) {
            System.out.println("testVehicleSettersAndGetters PASSED");
        } else {
            System.out.println("testVehicleSettersAndGetters FAILED");
        }
    }

    public static void testCalculateFee() {
        Car car = new Car();
        Duration duration = Duration.ofHours(2);
        double fee = car.calculateFee(duration);
        if (fee >= 0) {
            System.out.println("testCalculateFee PASSED");
        } else {
            System.out.println("testCalculateFee FAILED");
        }
    }

    public static void testTicketSettersAndGetters() {
        Car car = new Car();
        LocalDateTime entry = LocalDateTime.now();
        LocalDateTime exit = entry.plusHours(2);
        Ticket ticket = new Ticket(1, car, entry, exit, 20.0, 5);
        boolean pass = true;
        pass &= (ticket.getID() == 1);
        pass &= (ticket.getVehicle() == car);
        pass &= (ticket.getEntryTime().equals(entry));
        pass &= (ticket.getExitTime().equals(exit));
        pass &= (ticket.getTotalFee() == 20.0);
        pass &= (ticket.getSlotNumber() == 5);
        if (pass) {
            System.out.println("testTicketSettersAndGetters PASSED");
        } else {
            System.out.println("testTicketSettersAndGetters FAILED");
        }
    }
}
