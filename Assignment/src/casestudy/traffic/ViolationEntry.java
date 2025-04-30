package casestudy.construction.traffic;

import java.util.Arrays;
import java.util.List;

public class ViolationEntry extends TrafficRecord {

    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        List<String> allowedViolations = Arrays.asList("SPEEDING", "RED_LIGHT", "NO_HELMET", "DUI");

        if (!allowedViolations.contains(violationType.toUpperCase())) {
            System.out.println("Error: Invalid violation type.");
            return;
        }

        if (driverId.length() != 16 && !driverId.matches("[A-Z]{2}\\d{6}[A-Z]")) {
            System.out.println("Error: Invalid Driver ID format. Must be 16-digit National ID or valid license.");
            return;
        }

        if (!vehiclePlate.matches("[R][A-Z]{2}\\d{3}[A-Z]")) {
            System.out.println("Error: Invalid plate number format (e.g., RAB123D).");
            return;
        }

        System.out.println("Violation Recorded Successfully:");
        System.out.println("Driver: " + driverName + " | Violation: " + violationType.toUpperCase());
    }

    @Override
    public void assessFine() {
        // Not used here
    }

    @Override
    public void processPayment() {
        // Not used here
    }
}
