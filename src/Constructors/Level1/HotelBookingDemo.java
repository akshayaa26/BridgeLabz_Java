package Constructors.Level1;
class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }
}

public class HotelBookingDemo {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Akshayaa", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);

        System.out.println("🏨 Default Booking");
        booking1.displayBooking();

        System.out.println("\n🏨 Parameterized Booking");
        booking2.displayBooking();

        System.out.println("\n🏨 Copied Booking");
        booking3.displayBooking();
    }
}

