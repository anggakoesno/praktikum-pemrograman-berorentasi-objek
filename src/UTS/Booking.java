package UTS;

public class Booking {
    private static int counter = 1;

    private String bookingId;
    private Passenger passenger;
    private Flight flight;

    public Booking(Passenger passenger, Flight flight) {
        this.bookingId = String.format("BK%03d", counter++);
        this.passenger = passenger;
        this.flight = flight;
    }

    public String getBookingId() { return bookingId; }
    public Passenger getPassenger() { return passenger; }
    public Flight getFlight() { return flight; }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId
                + " | (" + passenger.getEmail() + ")"
                + " | Penerbangan: " + flight.getRoute()
                + " | [" + flight.getType() + "]"
                + " | Tanggal: " + flight.getDepartureDate()
                + " | Maskapai: " + flight.getAirline();
    }


}
