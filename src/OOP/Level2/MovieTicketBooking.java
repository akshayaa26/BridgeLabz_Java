package OOP.Level2;

import java.util.Scanner;

class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicketDetails() {
        System.out.println("\n🎟 Ticket Details");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat No    : " + seatNumber);
        System.out.println("Price      : ₹" + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        MovieTicket ticket = new MovieTicket(movie);
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);

        ticket.displayTicketDetails();

        sc.close();
    }
}
