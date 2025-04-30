package casestudy.construction.hotel;

public class Billing extends HotelService {

    public Billing(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void bookRoom() {
        // Not used in Billing
    }

    @Override
    public void checkoutGuest() {
        // Not used in Billing
    }

    @Override
    public void generateBill() {
        int pricePerNight = 0;
        switch (roomType.toUpperCase()) {
            case "STANDARD":
                pricePerNight = 50000;
                break;
            case "DELUXE":
                pricePerNight = 80000;
                break;
            case "SUITE":
                pricePerNight = 120000;
                break;
            default:
                System.out.println("Error: Invalid room type.");
                return;
        }
        int totalCost = pricePerNight * stayDays;
        System.out.println("------ BILLING DETAILS ------");
        System.out.println("Guest ID: " + guestId);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Stay Duration: " + stayDays + " days");
        System.out.printf("Total Bill: %,d RWF\n", totalCost);
    }
}

