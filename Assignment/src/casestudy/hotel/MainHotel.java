package casestudy.construction.hotel;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Guest ID:");
        String guestId = scanner.nextLine();

        System.out.println("Enter Guest Name:");
        String guestName = scanner.nextLine();

        System.out.println("Enter Room Type (STANDARD / DELUXE / SUITE):");
        String roomType = scanner.nextLine();

        System.out.println("Enter Number of Stay Days:");
        int stayDays = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        RoomBooking booking = new RoomBooking(guestId, guestName, roomType, stayDays);
        GuestCheckout checkout = new GuestCheckout(guestId, guestName, roomType, stayDays);
        Billing billing = new Billing(guestId, guestName, roomType, stayDays);

        System.out.println("Processing room booking...");
        booking.bookRoom();

        System.out.println("\nGenerating bill...");
        billing.generateBill();

        System.out.println("\nProcessing checkout...");
        checkout.roomStatus = booking.roomStatus; // Sync room status
        checkout.checkoutGuest();
    }
}

