package UTS;

public class FirstClassFlight extends Flight {
    public FirstClassFlight(String route, String departureDate, String airline, int availableSeats) {
        super(route, departureDate, airline, availableSeats, "FIRST CLASS");
    }

    @Override
    public String getFacility() {
        return "Lounge eksklusif, bagasi 40 kg, dan layanan prioritas penuh.";
    }

    @Override
    public String getBookingMessage() {
        return "Nikmati akses lounge eksklusif dan priority handling untuk penumpang FIRST CLASS";
    }
}
