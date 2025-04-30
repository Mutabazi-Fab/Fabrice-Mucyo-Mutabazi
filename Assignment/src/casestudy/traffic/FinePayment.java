package casestudy.construction.traffic;

public class FinePayment extends TrafficRecord {

    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType);
        this.fineAmount = fineAmount;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public void processPayment() {
        if (paymentStatus.equalsIgnoreCase("PAID")) {
            System.out.println("Error: Fine already paid.");
        } else {
            paymentStatus = "PAID";
            System.out.println("------ PAYMENT RECEIPT ------");
            System.out.println("Driver: " + driverName);
            System.out.println("Vehicle Plate: " + vehiclePlate);
            System.out.printf("Amount Paid: %,d RWF\n", (int) fineAmount);
            System.out.println("Payment Status: " + paymentStatus);
        }
    }

    @Override
    public void recordViolation() {
        // Not used
    }

    @Override
    public void assessFine() {
        // Not used
    }
}
