package casestudy.construction.hotel;

public class RoomBooking extends HotelService {

    public RoomBooking(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void bookRoom() {
        if (stayDays >= 1 && stayDays <= 30) {
            if (roomStatus.equalsIgnoreCase("AVAILABLE")) {
                roomStatus = "OCCUPIED";
                System.out.println("Booking successful for " + guestName + ". Room is now OCCUPIED.");
            } else {
                System.out.println("Error: Room is already OCCUPIED.");
            }
        } else {
            System.out.println("Error: Stay days must be between 1 and 30.");
        }
    }

    @Override
    public void checkoutGuest() {
        // Not used in Booking
    }

    @Override
    public void generateBill() {
        // Not used in Booking
    }
}

