package casestudy.construction.traffic;

import java.util.Scanner;

public class MainTraffic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Driver ID (16 digits or License Format):");
        String driverId = scanner.nextLine();

        System.out.println("Enter Driver Name:");
        String driverName = scanner.nextLine();

        System.out.println("Enter Vehicle Plate (e.g., RAB123D):");
        String vehiclePlate = scanner.nextLine();

        System.out.println("Enter Violation Type (SPEEDING / RED_LIGHT / NO_HELMET / DUI):");
        String violationType = scanner.nextLine();

        ViolationEntry entry = new ViolationEntry(driverId, driverName, vehiclePlate, violationType);
        entry.recordViolation();

        FineAssessment assessment = new FineAssessment(driverId, driverName, vehiclePlate, violationType);
        assessment.assessFine();

        FinePayment payment = new FinePayment(driverId, driverName, vehiclePlate, violationType, assessment.fineAmount, "UNPAID");
        payment.processPayment();
    }
}
