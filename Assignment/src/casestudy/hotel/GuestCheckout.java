package casestudy.construction.hotel;

public class GuestCheckout extends HotelService {

    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void bookRoom() {
        // Not used in Checkout
    }

    @Override
    public void checkoutGuest() {
        if (roomStatus.equalsIgnoreCase("OCCUPIED")) {
            roomStatus = "AVAILABLE";
            System.out.println("Checkout successful for " + guestName + ". Room is now AVAILABLE.");
        } else {
            System.out.println("Error: Room is already AVAILABLE. Cannot checkout.");
        }
    }

    @Override
    public void generateBill() {
        // Not used in Checkout
    }
}
