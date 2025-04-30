package casestudy.construction.traffic;

public class FineAssessment extends TrafficRecord {

    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println("Error: Violation type unrecognized.");
                return;
        }

        System.out.println("Fine Assessment Complete:");
        System.out.println("Driver: " + driverName);
        System.out.println("Violation: " + violationType.toUpperCase());
        System.out.printf("Fine Amount: %,d RWF\n", (int) fineAmount);
    }

    @Override
    public void recordViolation() {
        // Not used
    }

    @Override
    public void processPayment() {
        // Not used
    }
}
