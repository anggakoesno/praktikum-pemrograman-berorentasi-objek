package UTS;

public class BusinessFlight extends Flight {
    public BusinessFlight(String route, String departureDate, String airline, int availableSeats) {
        super(route, departureDate, airline, availableSeats, "BUSINESS");
    }

    @Override
    public String getFacility() {
        return "Bagasi 30 kg, makanan premium, dan priority boarding";
    }

    @Override
    public String getBookingMessage() {
        return "Nikmati priority boarding dan layanan makanan premium untuk penumpang BUSINESS";
    }
}
